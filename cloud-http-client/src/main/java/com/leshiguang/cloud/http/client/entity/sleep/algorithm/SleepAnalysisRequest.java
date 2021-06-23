package com.leshiguang.cloud.http.client.entity.sleep.algorithm;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with Intellij IDEA.
 * Project: saassleep-parent
 * Author: lishibin
 * Date: 2020/6/3
 * Time: 下午3:48
 */
@Data
@Accessors(chain = true)
@Builder
public class SleepAnalysisRequest implements Serializable {

    private static final long serialVersionUID = 7440032759801642096L;

    /**
     * 睡眠等级,存放16进制字符串,保存蓝牙底层数据
     */
    private String levelSetStr;

    /**
     * 分析开始时间
     */
    private Date startTime;

    /**
     * 硬件类型
     */
    private String model;

    /**
     * 固件版本号
     */
    private String softwareVersion;

}