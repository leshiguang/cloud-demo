package com.leshiguang.cloud.http.client.entity.weight.algorithm;

import java.io.Serializable;
import java.util.List;

/**
 * app 4.0
 * 体重单个指标 对象
 */
public class WeightLabelDto implements Serializable {


    private static final long serialVersionUID = -1046785566423871589L;
    /*标签名称*/
    private String label;

    /*标签值*/
    private Double labelValue;

    /*单位*/
    private String labelUnit;

    /*差值*/
    private Double labelDValue;

    /*差值文案*/
    private String labelDContent;

    /*等级名称*/
    private String labelLevelName;

    /*解读*/
    private String labelContent;

    /*饮食建议*/
    private String labelDietaryAdvice;

    /*运动建议建议*/
    private String labelSportsAdvice;

    /*等级区间*/
    private List<WeightLevelIntervalDto> levelIntervalList;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getLabelValue() {
        return labelValue;
    }

    public void setLabelValue(Double labelValue) {
        this.labelValue = labelValue;
    }

    public String getLabelUnit() {
        return labelUnit;
    }

    public void setLabelUnit(String labelUnit) {
        this.labelUnit = labelUnit;
    }

    public Double getLabelDValue() {
        return labelDValue;
    }

    public void setLabelDValue(Double labelDValue) {
        this.labelDValue = labelDValue;
    }

    public String getLabelDContent() {
        return labelDContent;
    }

    public void setLabelDContent(String labelDContent) {
        this.labelDContent = labelDContent;
    }

    public String getLabelLevelName() {
        return labelLevelName;
    }

    public void setLabelLevelName(String labelLevelName) {
        this.labelLevelName = labelLevelName;
    }

    public String getLabelContent() {
        return labelContent;
    }

    public void setLabelContent(String labelContent) {
        this.labelContent = labelContent;
    }

    public String getLabelDietaryAdvice() {
        return labelDietaryAdvice;
    }

    public void setLabelDietaryAdvice(String labelDietaryAdvice) {
        this.labelDietaryAdvice = labelDietaryAdvice;
    }

    public String getLabelSportsAdvice() {
        return labelSportsAdvice;
    }

    public void setLabelSportsAdvice(String labelSportsAdvice) {
        this.labelSportsAdvice = labelSportsAdvice;
    }

    public List<WeightLevelIntervalDto> getLevelIntervalList() {
        return levelIntervalList;
    }

    public void setLevelIntervalList(List<WeightLevelIntervalDto> levelIntervalList) {
        this.levelIntervalList = levelIntervalList;
    }
}
