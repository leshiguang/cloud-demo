package com.leshiguang.cloud.http.client.api.algorithm;

import com.leshiguang.cloud.http.client.api.algorithm.WeightAlgorithmCloudApi;
import com.leshiguang.cloud.http.client.entity.ResultData;
import com.leshiguang.cloud.http.client.entity.weight.algorithm.AsiaWeightIndexDTO;
import com.leshiguang.cloud.http.client.entity.weight.algorithm.AsiaWeightIndexShowDTO;
import com.leshiguang.cloud.http.client.entity.weight.algorithm.EuropeOrAmericaWeightIndexDTO;
import com.leshiguang.cloud.http.client.entity.weight.algorithm.WeightAlgorithmRequest;
import org.junit.Test;

import java.math.BigDecimal;

public class WeightAlgorithmCloudApiTest {


    @Test
    public void getWeightIndexCalculateResult() {

        WeightAlgorithmRequest request = WeightAlgorithmRequest.builder()
                .age(29)
                .weight(BigDecimal.valueOf(65))
                .height(BigDecimal.valueOf(1.68))
                .sex(1)
                .weightUnit(1)
                .resistance(BigDecimal.valueOf(500.0))
                .build();
        ResultData<AsiaWeightIndexDTO> res = WeightAlgorithmCloudApi.getAsiaWeightIndexDTO(request);

        System.out.println();
    }

    @Test
    public void getAsiaWeightIndexShowDTO() {

        WeightAlgorithmRequest request = WeightAlgorithmRequest.builder()
                .age(29)
                .weight(BigDecimal.valueOf(65))
                .height(BigDecimal.valueOf(1.68))
                .sex(1)
                .weightUnit(1)
                .resistance(BigDecimal.valueOf(500.0))
                .build();
        ResultData<AsiaWeightIndexShowDTO> res = WeightAlgorithmCloudApi.getAsiaWeightIndexShowDTO(request);

        System.out.println();
    }


    @Test
    public void getEuropeOrAmericaWeightIndexDTO() {

        WeightAlgorithmRequest request = WeightAlgorithmRequest.builder()
                .age(29)
                .weight(BigDecimal.valueOf(65))
                .height(BigDecimal.valueOf(1.68))
                .sex(1)
                .weightUnit(1)
                .resistance(BigDecimal.valueOf(500.0))
                .build();
        ResultData<EuropeOrAmericaWeightIndexDTO> res = WeightAlgorithmCloudApi.getEuropeOrAmericaWeightIndexDTO(request);

        System.out.println();


    }
}