package com.leshiguang.cloud.http.client.util;

import org.junit.Test;

public class ApiSignUtilTest {

	@Test
	public void generateSign() {

		String api_appKey = null;
		String api_timestamp = null;
		String appSecret = null;
		String sign = ApiSignUtil.generateSign(api_appKey, api_timestamp, "1.0", appSecret);
		System.out.println(sign);


	}
}
