package com.leshiguang.cloud.http.client.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.Arrays;

public class ApiSignUtil {

	//计算示例
	public static String generateSign(String api_appKey, String api_timestamp, String api_version, String appSecret) {
		String[] arraySign = new String[]{api_timestamp, api_appKey, appSecret, api_version};
		String sign = doGenerateSign(arraySign);

		return sign;
	}


	/**
	 * @param contents
	 * @return
	 */
	private static String doGenerateSign(String... contents) {
		String sign = Arrays.stream(contents).filter(StringUtils::isNotBlank)
				.sorted()
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString();
		return DigestUtils.md5DigestAsHex(sign.getBytes()).toUpperCase();
	}
}
