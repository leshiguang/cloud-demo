package com.leshiguang.cloud.http.client.entity.sleep.algorithm;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 睡眠状态详细数据
 */
@Data
@Accessors(chain = true)
public class SleepStateDetail implements Serializable {

    private static final long serialVersionUID = 3273823480708344094L;

    /**
     * 区间状态
     * {@link SleepStatusEnum}
     */
    private int sleepStatus;

    /**
     * 区间开始时间（秒）
     */
    private long startTime;

    /**
     * 区间结束时间（秒）
     */
    private long endTime;

    /**
     * 区间时长（分钟）
     */
    private int duration;
}
