package com.leshiguang.cloud.http.client.api;

import cn.hutool.core.net.url.UrlBuilder;
import cn.hutool.core.net.url.UrlPath;
import com.leshiguang.cloud.http.client.util.ApiSignUtil;

import java.util.Date;

public abstract class AbstractCloudApi {

    private static final String LEZHI_CLOUD_PROD_ADDRESS = "https://api.leshiguang.com/";

    private static final String LEZHI_CLOUD_TEST_ADDRESS = "https://api-beta.leshiguang.com/";

    private static final String API_TIMESTAMP = "api_timestamp";

    private static final String API_VERSION = "api_version";

    private static final String API_APPKEY = "api_appKey";

    private static final String API_SIGN = "api_sign";

    protected static final String RESULT_DATA_CODE = "code";

    protected static final String RESULT_DATA_MSG = "msg";

    protected static final String RESULT_DATA_DATA = "data";

    private static boolean onlineFlag = true;

    public static String getLezhiCloudAddress() {
        if (onlineFlag) {
            return LEZHI_CLOUD_PROD_ADDRESS;
        } else {
            return LEZHI_CLOUD_TEST_ADDRESS;
        }
    }


    public static String getApiVersion() {
        return "1.0";
    }


    public static String getAppKey() {
        //todo !!补充为真实的appKey
        return "todo";
    }


    public static String getAppSecret() {
        //todo !!补充为真实的AppSecret
        return "todo";
    }

    protected static UrlBuilder getBaseUrlBuilder(String path) {
        String lezhiCloudAddress = getLezhiCloudAddress();
        String api_timestamp = String.valueOf(new Date().getTime());
        String api_version = getApiVersion();
        String api_appKey = getAppKey();
        String signSecret = getAppSecret();

        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder = urlBuilder
                .of(lezhiCloudAddress)
                .setPath(UrlPath.of(path, null))
                .addQuery(API_TIMESTAMP, api_timestamp)
                .addQuery(API_VERSION, api_version)
                .addQuery(API_APPKEY, api_appKey)
                .addQuery(API_SIGN, ApiSignUtil.generateSign(api_appKey, api_timestamp, api_version, signSecret));

        return urlBuilder;
    }
}
