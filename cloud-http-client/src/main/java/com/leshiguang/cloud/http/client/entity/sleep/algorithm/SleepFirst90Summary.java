package com.leshiguang.cloud.http.client.entity.sleep.algorithm;


import java.io.Serializable;

/**
 * 睡眠前90分钟
 */
public class SleepFirst90Summary implements Serializable {

    private static final long serialVersionUID = 7913522788205627319L;

    /**
     * 深睡时长（分钟）
     */
    private int deepSleepDurationFirst90;

    /**
     * 浅睡时长（分钟）
     */
    private int shallowSleepDurationFirst90;

    /**
     * 清醒时长（分钟）
     */
    private int awakingDurationFirst90;

    /**
     * rem时长（分钟）
     */
    private int remDurationFirst90;

    private int duration;

    public int getDeepSleepDurationFirst90() {
        return deepSleepDurationFirst90;
    }

    public void setDeepSleepDurationFirst90(int deepSleepDurationFirst90) {
        this.deepSleepDurationFirst90 = deepSleepDurationFirst90;
    }

    public int getShallowSleepDurationFirst90() {
        return shallowSleepDurationFirst90;
    }

    public void setShallowSleepDurationFirst90(int shallowSleepDurationFirst90) {
        this.shallowSleepDurationFirst90 = shallowSleepDurationFirst90;
    }

    public int getAwakingDurationFirst90() {
        return awakingDurationFirst90;
    }

    public void setAwakingDurationFirst90(int awakingDurationFirst90) {
        this.awakingDurationFirst90 = awakingDurationFirst90;
    }

    public int getRemDurationFirst90() {
        return remDurationFirst90;
    }

    public void setRemDurationFirst90(int remDurationFirst90) {
        this.remDurationFirst90 = remDurationFirst90;
    }

    public void addDuration(int duration, int statusType) {
        if (this.duration >= 90) {
            return;
        }
        int addDuration;
        if (this.duration + duration > 90) {
            addDuration = 90 - this.duration;
        } else {
            addDuration = duration;
        }
        SleepStatusEnum sleepStatusEnum = SleepStatusEnum.getEnumByCode(statusType);
        switch (sleepStatusEnum) {
            case REM:
                this.remDurationFirst90 += addDuration;
                break;
            case AWAKENING:
                this.awakingDurationFirst90 += addDuration;
                break;
            case SHALLOW:
                this.shallowSleepDurationFirst90 += addDuration;
                break;
            case DEEP:
                this.deepSleepDurationFirst90 += addDuration;
                break;
        }
        this.duration += addDuration;
    }

    @Override
    public String toString() {
        return "SleepFirst90Summary{" +
                "deepSleepDurationFirst90=" + deepSleepDurationFirst90 +
                ", shallowSleepDurationFirst90=" + shallowSleepDurationFirst90 +
                ", awakingDurationFirst90=" + awakingDurationFirst90 +
                ", remDurationFirst90=" + remDurationFirst90 +
                ", duration=" + duration +
                '}';
    }
}
