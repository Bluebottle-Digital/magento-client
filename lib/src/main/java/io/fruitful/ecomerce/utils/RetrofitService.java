package io.fruitful.ecomerce.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.fruitful.ecomerce.commons.MagentoErrorInfo;
import io.fruitful.ecomerce.commons.MagentoException;
import lombok.extern.log4j.Log4j2;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
@PropertySource("classpath:${spring.profiles.active:dev}_serviceurl.properties")
@Log4j2
public class RetrofitService {

	@Value("${mail.url}")
	private String mailUrl;
	
	public static <S> S createService(
			Class<S> serviceClass, Interceptor interceptor, String url) {
		url = url.endsWith("/") ? url : url + "/";
		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		httpClient.callTimeout(60, TimeUnit.SECONDS);
		httpClient.readTimeout(60, TimeUnit.SECONDS);

//		AuthenticationInterceptor authInterceptor =
//				new AuthenticationInterceptor(authToken);

		if (interceptor != null && !httpClient.interceptors().contains(interceptor)) {
			httpClient.addInterceptor(interceptor);
		}

		HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
		// set your desired log level
		loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);

		if (!httpClient.interceptors().contains(loggingInterceptor)) {
			// add logging as last interceptor
			httpClient.addInterceptor(loggingInterceptor);
		}

		ObjectMapper objectMapper = new Jackson2ObjectMapperBuilder().build();
		objectMapper.configure(
				DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
		objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

		Retrofit.Builder builder = new Retrofit.Builder()
				.baseUrl(url)
				.addConverterFactory(JacksonConverterFactory.create(objectMapper));
		builder.client(httpClient.build());
		Retrofit retrofit = builder.build();

		return retrofit.create(serviceClass);
	}

	public static <S> S createPublicService(
			Class<S> serviceClass, String url) {
		url = url.endsWith("/") ? url : url + "/";
		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		httpClient.callTimeout(60, TimeUnit.SECONDS);
		httpClient.readTimeout(60, TimeUnit.SECONDS);

		HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
		// set your desired log level
		loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);

		if (!httpClient.interceptors().contains(loggingInterceptor)) {
			// add logging as last interceptor
			httpClient.addInterceptor(loggingInterceptor);
		}

		ObjectMapper objectMapper = new Jackson2ObjectMapperBuilder().build();
		objectMapper.configure(
				DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);

		Retrofit.Builder builder = new Retrofit.Builder()
				.baseUrl(url)
				.addConverterFactory(JacksonConverterFactory.create(objectMapper));
		builder.client(httpClient.build());
		Retrofit retrofit = builder.build();

		return retrofit.create(serviceClass);
	}
	
	public static <T> T getData(Response<T> response) throws MagentoException {
		if (response.errorBody() != null) {
			try {
				String message = IOUtils.toString(response.errorBody().byteStream(), StandardCharsets.UTF_8.name());
				if (message == null) {
					return null;
				}
				Map<String, Object> map = new ObjectMapper().readValue(message, new TypeReference<HashMap<String, Object>>() {});
				throw new MagentoException(new MagentoErrorInfo(response.code(), (String) map.get("message")));
			} catch (IOException e) {
				log.error("parse magento error failed", e);
			}
		}

		if (response.body() != null) {
			return response.body();
		}

		throw new MagentoException(MagentoErrorInfo.INTERNAL_SERVER_ERROR);
	}
}
