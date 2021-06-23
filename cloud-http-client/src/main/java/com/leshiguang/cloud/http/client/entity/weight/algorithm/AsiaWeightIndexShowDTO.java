package com.leshiguang.cloud.http.client.entity.weight.algorithm;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author gaojd
 * @Description:
 * @date 2020/8/18
 */
public class AsiaWeightIndexShowDTO implements Serializable {

    private static final long serialVersionUID = -4587061393451890471L;

    /**
     * 体重
     */
    private BigDecimal weight;

    /**
     * 身体类型
     * {@link BodyStyleLevelEnum#getStyle()}
     */
    private String bodyStyleText;

    /**
     * 身体类型
     * {@link BodyStyleLevelEnum#getCode()}
     */
    private Integer bodyStyleCode;

    /**
     * 身体建议文案
     */
    private String bodyAdviceText;

    /**
     * 标签解读
     */
    private List<WeightLabelDto> labelList;

    /**
     * 数据结果状态
     * 0 数据正常 1阻抗异常
     */
    private Integer resultStatus;

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getBodyStyleText() {
        return bodyStyleText;
    }

    public void setBodyStyleText(String bodyStyleText) {
        this.bodyStyleText = bodyStyleText;
    }

    public Integer getBodyStyleCode() {
        return bodyStyleCode;
    }

    public void setBodyStyleCode(Integer bodyStyleCode) {
        this.bodyStyleCode = bodyStyleCode;
    }

    public String getBodyAdviceText() {
        return bodyAdviceText;
    }

    public void setBodyAdviceText(String bodyAdviceText) {
        this.bodyAdviceText = bodyAdviceText;
    }

    public List<WeightLabelDto> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<WeightLabelDto> labelList) {
        this.labelList = labelList;
    }

    public Integer getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
    }
}
