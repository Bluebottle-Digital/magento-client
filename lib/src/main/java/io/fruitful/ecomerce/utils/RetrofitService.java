package io.fruitful.ecomerce.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import io.fruitful.ecomerce.commons.MagentoErrorInfo;
import io.fruitful.ecomerce.commons.MagentoException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RetrofitService {
	private static final Logger log = LoggerFactory.getLogger(RetrofitService.class);

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

		ObjectMapper objectMapper = new ObjectMapper();
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

		ObjectMapper objectMapper = new ObjectMapper();
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
				String message = new String(response.errorBody().bytes());
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
