package io.fruitful.ecomerce.commons;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MagentoErrorInfo implements Serializable {

	private static final long serialVersionUID = 2274535794300239705L;

	private static final Logger logger = LoggerFactory.getLogger(MagentoErrorInfo.class);

	public static Properties properties;

	static {
		try {
			properties = new Properties();
			InputStream is = MagentoErrorInfo.class.getResourceAsStream("/error_info.properties");
			properties.load(is);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	public static final int BAD_REQUEST_ERROR_CODE = 1010;
	public static final int FIELD_ERROR_CODE = 1020;

	public static final int UNKNOWN_ERROR_CODE = 1001;
	public static final int USER_NOT_FOUND_ERROR_CODE = 1002;
	public static final int USER_ACTIVATED_ERROR_CODE = 1003;
	public static final int RESET_PASSWORD_ERROR_CODE = 1004;
	public static final int INCORRECT_PASSWORD_ERROR_CODE = 1005;
	public static final int INCORRECT_CONFIRM_PASSWORD_ERROR_CODE = 1006;
	public static final int NEWS_NOT_FOUND_ERROR_CODE = 1007;
	public static final int NEWS_CATEGORY_NOT_FOUND_ERROR_CODE = 1008;
	public static final int TALENT_NOT_FOUND_ERROR_CODE = 1009;
	public static final int TALENT_CATEGORY_NOT_FOUND_ERROR_CODE = 1011;
	public static final int ACCESS_DENIED_ERROR_CODE = 1012;
	public static final int MEDIA_NOT_FOUND_ERROR_CODE = 1013;
	public static final int DATA_EXISTED_ERROR_CODE = 1014;
	public static final int MAIL_TEMPLATE_NOT_FOUND_ERROR_CODE = 1015;
	public static final int COMMENT_NOT_FOUND_ERROR_CODE = 1016;
	public static final int LOGIN_ERROR_ERROR_CODE = 1017;
	public static final int EMAIL_ALREADY_EXISTS_ERROR_CODE = 1018;
	public static final int COUNTRY_NOT_FOUND_ERROR_CODE = 1019;
	public static final int USER_SETTING_NOT_FOUND_ERROR_CODE = 1020;
	public static final int EVENT_INVALID_FIELDS_VALUE_ERROR_CODE = 1021;
	public static final int CONTENT_TYPE_NOT_FOUND_ERROR_CODE = 1022;
	public static final int EVENT_NOT_FOUND_ERROR_CODE = 1023;
	public static final int RESULT_NOT_FOUND_ERROR_CODE = 1024;
	public static final int PVPM_NOT_FOUND_ERROR_CODE = 1025;
	public static final int ADVERTISING_NOT_FOUND_ERROR_CODE = 1026;
	public static final int UPLOAD_FILE_IS_NULL_OR_EMPTY_CODE = 1027;
	public static final int CRAWLED_ARTICLE_NOT_FOUND_ERROR_CODE = 1028;
	public static final int CRAWLED_ARTICLE_WAS_APPROVED_BEFORE_CODE = 1029;
	public static final int STATUS_NOT_FOUND_ERROR_CODE = 1030;
	public static final int NO_TALENT_MATCH_ERROR_CODE = 1031;
	public static final int APPROVE_CRAWL_ARTICLE_FAIL_NO_TALENT_ERROR_CODE = 1032;
	public static final int MAGENTO_CUSTOM_ERROR_CODE = 1033;
	public static final int MAGENTO_CATEGORY_NOT_FOUND_ERROR_CODE = 1034;
	public static final int PRODUCT_NOT_FOUND_ERROR_CODE = 1035;
	public static final int CAN_NOT_CONVERT_OBJECT_TO_JSON_STRING_CODE = 1036;
	public static final int INVALID_MEDIA_INFO_CODE = 1037;
	public static final int COMMENT_FAILED_ERROR_CODE = 1038;
	public static final int POST_NOT_FOUND_ERROR_CODE = 1039;
	public static final int LOGOUT_ERROR_CODE = 1040;
	public static final int EMAIL_IS_REQUIRED_ERROR_CODE = 1041;
	public static final int NO_AVAILABLE_TALENT_FOUND_ERROR_CODE = 1042;
	public static final int CHANGE_PASSWORD_FAIL_ERROR_CODE = 1043;
	public static final int NOTIFICATION_NOT_FOUND_ERROR_CODE = 1044;
	public static final int APPROVE_DUPLICATED_CRAWLED_ARTICLE_ERROR_CODE = 1045;
	public static final int APPLE_PUBLIC_KEY_NOT_FOUND_ERROR_CODE = 1046;
	public static final int APPROVE_CRAWLED_ARTICLE_ERROR_CODE = 1047;
	public static final int RESULT_INVALID_FIELDS_VALUE_ERROR_CODE = 1048;
	public static final int CRAWL_TYPE_IS_NOT_VALID_ERROR_CODE = 1049;
	public static final int CRAWL_SETTING_NOT_FOUND_ERROR_CODE = 1050;
	public static final int INVALID_VIDEO_URL_ERROR_CODE = 1051;
	public static final int INVALID_AUDIO_URL_ERROR_CODE = 1052;
	public static final int LINK_FACEBOOK_FAILED_ERROR_CODE = 1053;
	public static final int UNLINK_FACEBOOK_FAILED_ERROR_CODE = 1054;
	public static final int LINK_TWITTER_FAILED_ERROR_CODE = 1055;
	public static final int UNLINK_TWITTER_FAILED_ERROR_CODE = 1056;
	public static final int LINK_INSTAGRAM_FAILED_ERROR_CODE = 1057;
	public static final int UNLINK_INSTAGRAM_FAILED_ERROR_CODE = 1058;
	public static final int SOCIAL_TOKEN_NOT_FOUND_ERROR_CODE = 1059;
	public static final int SOCIAL_PAGE_NOT_FOUND_ERROR_CODE = 1060;
	public static final int CRAWL_SOCIAL_POST_FAILED_ERROR_CODE = 1061;
	public static final int INSTAGRAM_POST_REQUEST_ERROR_CODE = 1062;

	private int code;
	private final List<String> messages = new ArrayList<>();

	public MagentoErrorInfo() {
	}

	public static MagentoErrorInfo newInstance(int code, String message) {
		return new MagentoErrorInfo(code, message);
	}

	public MagentoErrorInfo(int code, String... messages) {
		this.code = code;
		for (String message : messages) {
			this.messages.add(message);
		}
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return messages.size() > 0 ? messages.get(0) : null;
	}

	public void setMessage(String message) {
		this.messages.add(message);
	}
	// ===============================================================================================
	// special code
	// ===============================================================================================

	public static final MagentoErrorInfo INTERNAL_SERVER_ERROR = new MagentoErrorInfo(UNKNOWN_ERROR_CODE,
			properties.getProperty("server.error"));
	
	public static final MagentoErrorInfo USER_NOT_FOUND_ERROR = new MagentoErrorInfo(USER_NOT_FOUND_ERROR_CODE,
			properties.getProperty("user.not.found.error"));
	
	public static final MagentoErrorInfo BAD_REQUEST = new MagentoErrorInfo(BAD_REQUEST_ERROR_CODE,
			properties.getProperty("request.error"));
	
	public static final MagentoErrorInfo USER_ACTIVATED_ERROR = new MagentoErrorInfo(USER_ACTIVATED_ERROR_CODE,
			properties.getProperty("user.activated.error"));
	
	public static final MagentoErrorInfo RESET_PASSWORD_CODE_ERROR = new MagentoErrorInfo(RESET_PASSWORD_ERROR_CODE,
			properties.getProperty("reset.password.code.error"));
	
	public static final MagentoErrorInfo INCORRECT_PASSWORD_ERROR = new MagentoErrorInfo(INCORRECT_PASSWORD_ERROR_CODE,
			properties.getProperty("incorrect.password"));
	
	public static final MagentoErrorInfo INCORRECT_CONFIRM_PASSWORD_ERROR = new MagentoErrorInfo(INCORRECT_CONFIRM_PASSWORD_ERROR_CODE,
			properties.getProperty("incorrect.confirm.password"));
	
	public static final MagentoErrorInfo NEWS_NOT_FOUND_ERROR = new MagentoErrorInfo(NEWS_NOT_FOUND_ERROR_CODE,
			properties.getProperty("news.not.found"));
	
	public static final MagentoErrorInfo NEWS_CATEGORY_NOT_FOUND_ERROR = new MagentoErrorInfo(NEWS_CATEGORY_NOT_FOUND_ERROR_CODE,
			properties.getProperty("news.category.not.found"));
	
	public static final MagentoErrorInfo TALENT_NOT_FOUND_ERROR = new MagentoErrorInfo(TALENT_NOT_FOUND_ERROR_CODE,
			properties.getProperty("talent.not.found"));
	
	public static final MagentoErrorInfo TALENT_CATEGORY_NOT_FOUND_ERROR = new MagentoErrorInfo(TALENT_CATEGORY_NOT_FOUND_ERROR_CODE,
			properties.getProperty("talent.category.not.found"));
	
	public static final MagentoErrorInfo ACCESS_DENIED_ERROR = new MagentoErrorInfo(ACCESS_DENIED_ERROR_CODE,
			properties.getProperty("access.denied.error"));
	
	public static final MagentoErrorInfo MEDIA_NOT_FOUND_ERROR = new MagentoErrorInfo(MEDIA_NOT_FOUND_ERROR_CODE,
			properties.getProperty("media.not.found.error"));
	
	public static final MagentoErrorInfo DATA_EXISTED_ERROR = new MagentoErrorInfo(DATA_EXISTED_ERROR_CODE,
			properties.getProperty("data.already.exists"));
	
	public static final MagentoErrorInfo MAIL_TEMPLATE_NOT_FOUND_ERROR = new MagentoErrorInfo(MAIL_TEMPLATE_NOT_FOUND_ERROR_CODE,
			properties.getProperty("mail.template.not.found"));
	
	public static final MagentoErrorInfo COMMENT_NOT_FOUND_ERROR = new MagentoErrorInfo(COMMENT_NOT_FOUND_ERROR_CODE,
			properties.getProperty("comment.not.found.error"));
	
	public static final MagentoErrorInfo LOGIN_ERROR = new MagentoErrorInfo(LOGIN_ERROR_ERROR_CODE,
			properties.getProperty("login.error"));
	
	public static final MagentoErrorInfo EMAIL_ALREADY_EXISTS_ERROR = new MagentoErrorInfo(EMAIL_ALREADY_EXISTS_ERROR_CODE,
			properties.getProperty("email.already.exists"));

	public static final MagentoErrorInfo COUNTRY_NOT_FOUND_ERROR = new MagentoErrorInfo(COUNTRY_NOT_FOUND_ERROR_CODE,
			properties.getProperty("country.not.found.error"));

	public static final MagentoErrorInfo USER_SETTING_NOT_FOUND_ERROR = new MagentoErrorInfo(USER_SETTING_NOT_FOUND_ERROR_CODE,
			properties.getProperty("user.setting.not.found"));

	public static final MagentoErrorInfo CONTENT_TYPE_NOT_FOUND_ERROR = new MagentoErrorInfo(CONTENT_TYPE_NOT_FOUND_ERROR_CODE,
			properties.getProperty("content.type.not.found"));

	public static final MagentoErrorInfo EVENT_NOT_FOUND_ERROR = new MagentoErrorInfo(EVENT_NOT_FOUND_ERROR_CODE,
			properties.getProperty("event.not.found"));

	public static final MagentoErrorInfo RESULT_NOT_FOUND_ERROR = new MagentoErrorInfo(RESULT_NOT_FOUND_ERROR_CODE,
			properties.getProperty("result.not.found"));

	public static final MagentoErrorInfo PVPM_NOT_FOUND_ERROR = new MagentoErrorInfo(PVPM_NOT_FOUND_ERROR_CODE,
			properties.getProperty("pvpm.not.found"));

	public static final MagentoErrorInfo ADVERTISING_NOT_FOUND_ERROR = new MagentoErrorInfo(ADVERTISING_NOT_FOUND_ERROR_CODE,
			properties.getProperty("advertising.not.found"));

	public static final MagentoErrorInfo UPLOAD_FILE_IS_NULL_OR_EMPTY = new MagentoErrorInfo(UPLOAD_FILE_IS_NULL_OR_EMPTY_CODE,
			properties.getProperty("upload.file.is_null_or_empty"));
	
	public static final MagentoErrorInfo CRAWLED_ARTICLE_NOT_FOUND_ERROR = new MagentoErrorInfo(CRAWLED_ARTICLE_NOT_FOUND_ERROR_CODE,
			properties.getProperty("crawled.article.not.found"));

	public static final MagentoErrorInfo CRAWLED_ARTICLE_WAS_APPROVED_BEFORE_ERROR = new MagentoErrorInfo(CRAWLED_ARTICLE_WAS_APPROVED_BEFORE_CODE,
			properties.getProperty("crawled.article.was.approved.before"));
	
	public static final MagentoErrorInfo STATUS_NOT_FOUND_ERROR = new MagentoErrorInfo(STATUS_NOT_FOUND_ERROR_CODE,
			properties.getProperty("status.not.found"));

	public static final MagentoErrorInfo NO_TALENT_MATCH_ERROR = new MagentoErrorInfo(NO_TALENT_MATCH_ERROR_CODE,
			properties.getProperty("no.talent.match"));

	public static final MagentoErrorInfo APPROVE_CRAWL_ARTICLE_FAIL_NO_TALENT_ERROR = new MagentoErrorInfo(APPROVE_CRAWL_ARTICLE_FAIL_NO_TALENT_ERROR_CODE,
			properties.getProperty("approve.crawl.article.fail.no.talent"));

	public static final MagentoErrorInfo MAGENTO_CUSTOM_ERROR(String message) {
		return new MagentoErrorInfo(MAGENTO_CUSTOM_ERROR_CODE, message);
	}

	public static final MagentoErrorInfo MAGENTO_CATEGORY_NOT_FOUND_ERROR(String message) {
		return new MagentoErrorInfo(MAGENTO_CATEGORY_NOT_FOUND_ERROR_CODE, message);
	}

	public static final MagentoErrorInfo PRODUCT_NOT_FOUND_ERROR(String message) {
		return new MagentoErrorInfo(PRODUCT_NOT_FOUND_ERROR_CODE, message);
	}

	public static final MagentoErrorInfo CAN_NOT_CONVERT_OBJECT_TO_JSON_STRING_ERROR(String message) {
		return new MagentoErrorInfo(CAN_NOT_CONVERT_OBJECT_TO_JSON_STRING_CODE, message);
	}

	public static final MagentoErrorInfo INVALID_MEDIA_INFO_ERROR(String message) {
		return new MagentoErrorInfo(INVALID_MEDIA_INFO_CODE, message);
	}

	public static final MagentoErrorInfo COMMENT_FAILED_ERROR(String message) {
		return new MagentoErrorInfo(COMMENT_FAILED_ERROR_CODE, message);
	}

	public static final MagentoErrorInfo POST_NOT_FOUND_ERROR(String message) {
		return new MagentoErrorInfo(POST_NOT_FOUND_ERROR_CODE, message);
	}

	public static final MagentoErrorInfo EMAIL_IS_REQUIRED_ERROR = new MagentoErrorInfo(EMAIL_IS_REQUIRED_ERROR_CODE,
			properties.getProperty("email.is.required"));

	public static final MagentoErrorInfo NO_AVAILABLE_TALENT_FOUND_ERROR = new MagentoErrorInfo(NO_AVAILABLE_TALENT_FOUND_ERROR_CODE,
			properties.getProperty("no.available.talent"));

	public static final MagentoErrorInfo CHANGE_PASSWORD_FAIL_ERROR(String message) {
		return new MagentoErrorInfo(CHANGE_PASSWORD_FAIL_ERROR_CODE, message);
	}
	
	public static final MagentoErrorInfo NOTIFICATION_NOT_FOUND_ERROR = new MagentoErrorInfo(NOTIFICATION_NOT_FOUND_ERROR_CODE,
			properties.getProperty("notification.not.found.error"));

	public static final MagentoErrorInfo APPROVE_DUPLICATED_CRAWLED_ARTICLE_ERROR = new MagentoErrorInfo(APPROVE_CRAWLED_ARTICLE_ERROR_CODE,
			properties.getProperty("approve.crawled.article.error"));


	public static final MagentoErrorInfo APPLE_PUBLIC_KEY_NOT_FOUND = new MagentoErrorInfo(APPLE_PUBLIC_KEY_NOT_FOUND_ERROR_CODE,
			properties.getProperty("apple.public.key.not.found"));

	public static final MagentoErrorInfo CRAWL_TYPE_IS_NOT_VALID_ERROR = new MagentoErrorInfo(CRAWL_TYPE_IS_NOT_VALID_ERROR_CODE,
			properties.getProperty("crawl.type.is.not.valid"));

	public static final MagentoErrorInfo CRAWL_SETTING_NOT_FOUND_ERROR = new MagentoErrorInfo(CRAWL_SETTING_NOT_FOUND_ERROR_CODE,
			properties.getProperty("crawl.setting.not.found"));
	
	public static final MagentoErrorInfo INVALID_VIDEO_URL_ERROR = new MagentoErrorInfo(INVALID_VIDEO_URL_ERROR_CODE,
			properties.getProperty("invalid.video.url.error"));
	
	public static final MagentoErrorInfo INVALID_AUDIO_URL_ERROR= new MagentoErrorInfo(INVALID_AUDIO_URL_ERROR_CODE,
			properties.getProperty("invalid.audio.url.error"));

	public static final MagentoErrorInfo LINK_FACEBOOK_FAILED_ERROR = new MagentoErrorInfo(LINK_FACEBOOK_FAILED_ERROR_CODE,
			properties.getProperty("link.facebook.fail.error"));

	public static final MagentoErrorInfo UNLINK_FACEBOOK_FAILED_ERROR = new MagentoErrorInfo(UNLINK_FACEBOOK_FAILED_ERROR_CODE,
			properties.getProperty("unlink.facebook.fail.error"));

	public static final MagentoErrorInfo LINK_TWITTER_FAILED_ERROR = new MagentoErrorInfo(LINK_TWITTER_FAILED_ERROR_CODE,
			properties.getProperty("link.twitter.fail.error"));

	public static final MagentoErrorInfo UNLINK_TWITTER_FAILED_ERROR = new MagentoErrorInfo(UNLINK_TWITTER_FAILED_ERROR_CODE,
			properties.getProperty("unlink.twitter.fail.error"));


	public static final MagentoErrorInfo LINK_INSTAGRAM_FAILED_ERROR = new MagentoErrorInfo(LINK_INSTAGRAM_FAILED_ERROR_CODE,
			properties.getProperty("link.instagram.fail.error"));

	public static final MagentoErrorInfo UNLINK_INSTAGRAM_FAILED_ERROR = new MagentoErrorInfo(UNLINK_INSTAGRAM_FAILED_ERROR_CODE,
			properties.getProperty("unlink.instagram.fail.error"));

	public static final MagentoErrorInfo SOCIAL_TOKEN_NOT_FOUND_ERROR = new MagentoErrorInfo(SOCIAL_TOKEN_NOT_FOUND_ERROR_CODE,
			properties.getProperty("social.token.not.found.error"));

	public static final MagentoErrorInfo SOCIAL_PAGE_NOT_FOUND_ERROR = new MagentoErrorInfo(SOCIAL_PAGE_NOT_FOUND_ERROR_CODE,
			properties.getProperty("social.page.not.found.error"));

	public static final MagentoErrorInfo CRAWL_SOCIAL_POST_FAILED_ERROR = new MagentoErrorInfo(CRAWL_SOCIAL_POST_FAILED_ERROR_CODE,
			properties.getProperty("crawl.social.post.failed.error"));

	public static final MagentoErrorInfo INSTAGRAM_POST_REQUEST_ERROR = new MagentoErrorInfo(INSTAGRAM_POST_REQUEST_ERROR_CODE,
			properties.getProperty("instagram.post.request.error"));
}
