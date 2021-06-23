package com.leshiguang.cloud.http.client.entity.weight.algorithm;

import java.io.Serializable;
import java.math.BigDecimal;

public class WeightLevelIntervalDto implements Serializable {


    private static final long serialVersionUID = 472917405939978072L;

    /*
     * 等级区间名称
     */
    private String levelIntervalName;

    /*
     * 区间开始值
     */
    private BigDecimal startValue;

    /*
     * 区间结束值
     */
    private BigDecimal endValue;

    public String getLevelIntervalName() {
        return levelIntervalName;
    }

    public void setLevelIntervalName(String levelIntervalName) {
        this.levelIntervalName = levelIntervalName;
    }

    public BigDecimal getStartValue() {
        return startValue;
    }

    public void setStartValue(BigDecimal startValue) {
        this.startValue = startValue;
    }

    public BigDecimal getEndValue() {
        return endValue;
    }

    public void setEndValue(BigDecimal endValue) {
        this.endValue = endValue;
    }
}
