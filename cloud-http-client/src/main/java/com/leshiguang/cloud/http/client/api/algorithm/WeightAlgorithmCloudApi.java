package com.leshiguang.cloud.http.client.api.algorithm;

import cn.hutool.core.net.url.UrlBuilder;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.leshiguang.cloud.http.client.api.AbstractCloudApi;
import com.leshiguang.cloud.http.client.entity.ResultData;
import com.leshiguang.cloud.http.client.entity.weight.algorithm.AsiaWeightIndexDTO;
import com.leshiguang.cloud.http.client.entity.weight.algorithm.AsiaWeightIndexShowDTO;
import com.leshiguang.cloud.http.client.entity.weight.algorithm.EuropeOrAmericaWeightIndexDTO;
import com.leshiguang.cloud.http.client.entity.weight.algorithm.WeightAlgorithmRequest;

public class WeightAlgorithmCloudApi extends AbstractCloudApi {


	/**
	 * 亚洲人种：体脂18项计算
	 *
	 * @param request
	 * @return
	 */
	public static ResultData<AsiaWeightIndexDTO> getAsiaWeightIndexDTO(WeightAlgorithmRequest request) {

		UrlBuilder urlBuilder = getBaseUrlBuilder("api/weight/algorithm/v1.0/getWeightIndexCalculateResult");
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

		if (jsonObject.getJSONObject(RESULT_DATA_DATA) != null) {
			AsiaWeightIndexDTO asiaWeightIndexDTO =
					JSON.toJavaObject(jsonObject.getJSONObject(RESULT_DATA_DATA), AsiaWeightIndexDTO.class);
			resultData.setData(asiaWeightIndexDTO);
		}

		return resultData;
	}


	/**
	 * 亚洲人种：体脂各项指标，以及详细的分析
	 *
	 * @param request
	 * @return
	 */
	public static ResultData<AsiaWeightIndexShowDTO> getAsiaWeightIndexShowDTO(WeightAlgorithmRequest request) {

		UrlBuilder urlBuilder = getBaseUrlBuilder("api/weight/algorithm/v1.0/getWeightIndexCalculateAndAnalysisResult");
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

		if (jsonObject.getJSONObject(RESULT_DATA_DATA) != null) {
			AsiaWeightIndexShowDTO asiaWeightIndexShowDTO =
					JSON.toJavaObject(jsonObject.getJSONObject(RESULT_DATA_DATA), AsiaWeightIndexShowDTO.class);
			resultData.setData(asiaWeightIndexShowDTO);
		}

		return resultData;
	}

	/**
	 * 欧美人种：体脂18项计算
	 *
	 * @param request
	 * @return
	 */
	public static ResultData<EuropeOrAmericaWeightIndexDTO> getEuropeOrAmericaWeightIndexDTO(WeightAlgorithmRequest request) {

		UrlBuilder urlBuilder = getBaseUrlBuilder("api/weight/algorithm/v1.0/getforeignWeightAlgorithmResult");
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

		if (jsonObject.getJSONObject(RESULT_DATA_DATA) != null) {
			EuropeOrAmericaWeightIndexDTO europeOrAmericaWeightIndexDTO =
					JSON.toJavaObject(jsonObject.getJSONObject(RESULT_DATA_DATA), EuropeOrAmericaWeightIndexDTO.class);
			resultData.setData(europeOrAmericaWeightIndexDTO);
		}

		return resultData;
	}

}
