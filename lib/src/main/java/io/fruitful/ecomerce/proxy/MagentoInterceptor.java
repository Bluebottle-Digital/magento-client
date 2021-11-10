package io.fruitful.ecomerce.proxy;

import io.fruitful.ecomerce.enums.SecurityConst;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

public class MagentoInterceptor implements  Interceptor {

	private String accessToken;
	public MagentoInterceptor(String accessToken) {
		this.accessToken = accessToken;
	}

	@Override
	public Response intercept(Interceptor.Chain chain) throws IOException {
		Request request = chain.request();
		if (!StringUtils.isEmpty(this.accessToken)) {
			request = request.newBuilder()
					.addHeader(SecurityConst.AUTHORIZATION_HEADER, SecurityConst.BEARER_TOKEN + this.accessToken)
					.build();
		}
		return chain.proceed(request);
	}
}
