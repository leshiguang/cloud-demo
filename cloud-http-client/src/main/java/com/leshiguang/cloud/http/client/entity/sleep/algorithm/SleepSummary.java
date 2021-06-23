package com.leshiguang.cloud.http.client.entity.sleep.algorithm;


import java.io.Serializable;

/**
 * 睡眠总结
 */
public class SleepSummary implements Serializable {

    private static final long serialVersionUID = -8076732711396363113L;

    /**
     * 开始入睡时间(单位毫秒)
     */
    private long beginSleepTimeUTC;

    /**
     * 入睡时间,unix时间戳(单位秒)
     */
    private long sleepTimeSecond;
    /**
     * 起床时间,unix时间戳（单位秒）
     */
    private long getupTimeSecond;

    /**
     * 深睡的总时长（分钟）
     */
    private long deepSleepDuration;

    /**
     * 浅睡的总时长（分钟）
     */
    private long lightSleepDuration;

    /**
     * 清醒的总时长（分钟）
     */
    private long awakeSleepDuration;

    /**
     * 眼动时长（分钟）
     */
    private int remDuration;

    /**
     * 清醒次数
     */
    private long awakeCount;

    /**
     * {@link SleepSegmentType}
     */
    private Integer segmentType;

    public long getBeginSleepTimeUTC() {
        return beginSleepTimeUTC;
    }

    public void setBeginSleepTimeUTC(long beginSleepTimeUTC) {
        this.beginSleepTimeUTC = beginSleepTimeUTC;
    }

    public long getSleepTimeSecond() {
        return sleepTimeSecond;
    }

    public void setSleepTimeSecond(long sleepTimeSecond) {
        this.sleepTimeSecond = sleepTimeSecond;
    }

    public long getGetupTimeSecond() {
        return getupTimeSecond;
    }

    public void setGetupTimeSecond(long getupTimeSecond) {
        this.getupTimeSecond = getupTimeSecond;
    }

    public long getDeepSleepDuration() {
        return deepSleepDuration;
    }

    public void setDeepSleepDuration(long deepSleepDuration) {
        this.deepSleepDuration = deepSleepDuration;
    }

    public long getLightSleepDuration() {
        return lightSleepDuration;
    }

    public void setLightSleepDuration(long lightSleepDuration) {
        this.lightSleepDuration = lightSleepDuration;
    }

    public long getAwakeSleepDuration() {
        return awakeSleepDuration;
    }

    public void setAwakeSleepDuration(long awakeSleepDuration) {
        this.awakeSleepDuration = awakeSleepDuration;
    }

    public int getRemDuration() {
        return remDuration;
    }

    public void setRemDuration(int remDuration) {
        this.remDuration = remDuration;
    }

    public long getAwakeCount() {
        return awakeCount;
    }

    public void setAwakeCount(long awakeCount) {
        this.awakeCount = awakeCount;
    }

    public Integer getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(Integer segmentType) {
        this.segmentType = segmentType;
    }

    @Override
    public String toString() {
        return "SleepSummary{" +
                "beginSleepTimeUTC=" + beginSleepTimeUTC +
                ", sleepTimeSecond=" + sleepTimeSecond +
                ", getupTimeSecond=" + getupTimeSecond +
                ", deepSleepDuration=" + deepSleepDuration +
                ", lightSleepDuration=" + lightSleepDuration +
                ", awakeSleepDuration=" + awakeSleepDuration +
                ", remDuration=" + remDuration +
                ", awakeCount=" + awakeCount +
                ", segmentType=" + segmentType +
                '}';
    }
}
