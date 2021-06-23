package com.leshiguang.cloud.http.client.api.algorithm;

import cn.hutool.core.net.url.UrlBuilder;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leshiguang.cloud.http.client.api.AbstractCloudApi;
import com.leshiguang.cloud.http.client.entity.ResultData;
import com.leshiguang.cloud.http.client.entity.sleep.algorithm.SleepAnalysisRequest;
import com.leshiguang.cloud.http.client.entity.sleep.algorithm.SleepSegmentDTO;

import java.util.ArrayList;
import java.util.List;

public class SleepAlgorithmCloudApi extends AbstractCloudApi {


	/**
	 * 睡眠分析接口
	 *
	 * @param request
	 * @return
	 */
	public static ResultData<List<SleepSegmentDTO>> getSleepSegmentDTOs(SleepAnalysisRequest request) {

		UrlBuilder urlBuilder = getBaseUrlBuilder("api/sleep/v1.0/origin/data/analysis");
		String url = urlBuilder
				.build();

		String res = HttpRequest.post(url)
				.body(JSON.toJSONString(request))
				.execute()
				.body();

		JSONObject jsonObject = JSON.parseObject(res);

		ResultData resultData = new ResultData();
		resultData.setCode(jsonObject.getInteger(RESULT_DATA_CODE));
		resultData.setMsg(jsonObject.getString(RESULT_DATA_MSG));

		JSONArray jsonArray = jsonObject.getJSONArray(RESULT_DATA_DATA);
		if (jsonArray != null) {
			List<SleepSegmentDTO> sleepSegmentDTOs = new ArrayList<>();
			for (int i = 0; i < jsonArray.size(); ++i) {
				JSONObject ele = jsonArray.getJSONObject(i);
				SleepSegmentDTO sleepSegmentDTO = JSON.toJavaObject(ele, SleepSegmentDTO.class);
				sleepSegmentDTOs.add(sleepSegmentDTO);
			}
			resultData.setData(sleepSegmentDTOs);
		}

		return resultData;
	}
}
