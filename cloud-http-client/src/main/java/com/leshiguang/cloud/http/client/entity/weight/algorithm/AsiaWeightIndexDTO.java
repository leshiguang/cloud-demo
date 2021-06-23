package com.leshiguang.cloud.http.client.entity.weight.algorithm;

import lombok.Data;

import java.io.Serializable;

@Data
public class AsiaWeightIndexDTO implements Serializable {

    private static final long serialVersionUID = 2290703141386904900L;

    /**
     * 体重
     */
    private Double weight;

    /**
     * 50K电阻值
     */
    private Double resistance50k;


    /**
     * 内脏脂肪指数
     */
    private Double visceralFat;

    /**
     * 基础代谢量
     */
    private Double basalMetabolism;

    /**
     * 蛋白质
     */
    private Double protein;

    /**
     * 年龄的偏移
     */
    private Integer ageOffset;

    /**
     * 身材得分
     */
    private Double bodyScore;

    /**
     * 体型
     */
    private String bodyStyle;

    private Double beatPercent;


    /**
     * 体质指数
     */
    private Double bmi;

    /**
     * 脂肪率 脂肪比率,Percent body fat(PBF)
     */
    private Double pbf;

    /**
     * 肌肉量
     */
    private Double muscle;

    /**
     * 骨骼量
     */
    private Double bone;

    /**
     * 水分率
     */
    private Double water;


    /**
     * 脂肪量（ Body fat mass）
     */
    private double bfm;

    /**
     * 去脂体重（fat free mass）
     */
    private double ffm;

    /**
     * 肌肉率
     */
    private double rateOfMuscle;

    /**
     * 骨骼肌
     */
    private double skeletonMuscle;


    /**
     * 身体年龄
     */
    private Integer bodyAge;

    /**
     * 肌肉控制
     */
    private double muscleControl;

    /**
     * 脂肪控制
     */
    private double fatControl;

    /**
     * 内脏脂肪指数等级
     */
    private Integer visceralFatLevel;
}
