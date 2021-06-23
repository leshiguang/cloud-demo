package com.leshiguang.cloud.http.client.entity.weight.algorithm;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Accessors(chain = true)
@Builder
public class WeightAlgorithmRequest implements Serializable {

    /**
     * 体重
     */
    private BigDecimal weight;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     * {@link com.leshiguang.cloud.http.client.enums.GenderType}
     */
    private Integer sex;

    /**
     * 身高 单位：米
     */
    private BigDecimal height;

    /**
     * 抗阻
     */
    private BigDecimal resistance;

    /**
     * 体重单位(默认为kg)
     * 1 kg
     * 2 斤
     * 3 磅
     */
    private Integer weightUnit = 1;
}
