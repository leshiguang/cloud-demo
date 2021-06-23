package com.leshiguang.cloud.http.client.entity.sleep.algorithm;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project: saassleep-parent
 * Author: lishibin
 * Date: 2020/6/3
 * Time: 下午4:01
 */
@Data
public class SleepSegmentDTO implements Serializable {

    private static final long serialVersionUID = -4944765108607330638L;

    /**
     * 整体总结数据
     */
    private SleepSummary summary;

    /**
     * 前90分钟的总结数据
     */
    private SleepFirst90Summary first90Summary;

    /**
     * 睡眠状态(深睡/浅睡/清醒...)详细数据
     */
    private List<SleepStateDetail> statusDetails;

}