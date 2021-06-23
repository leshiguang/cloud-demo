package com.leshiguang.cloud.http.client.entity.weight.algorithm;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class EuropeOrAmericaWeightIndexDTO implements Serializable {

    /**
     * 体重
     */
    private BigDecimal weight;

    /**
     * bmi
     */
    private BigDecimal bmi;

    /**
     * 体脂率
     */
    private BigDecimal pbf;

    /**
     * 脂肪量
     */
    private BigDecimal bfm;

    /**
     * 去脂体重
     */
    private BigDecimal ffm;

    /**
     * 骨量
     */
    private BigDecimal bone;

    /**
     * 骨量率
     */
    private BigDecimal boneRate;

    /**
     * 肌肉率 ，%
     */
    private BigDecimal rateOfMuscle;

    /**
     * 肌肉量
     */
    private BigDecimal muscle;

    /**
     * 水分率
     */
    private BigDecimal water;

    /**
     * 基础代谢量
     */
    private BigDecimal basalMetabolism;
}
