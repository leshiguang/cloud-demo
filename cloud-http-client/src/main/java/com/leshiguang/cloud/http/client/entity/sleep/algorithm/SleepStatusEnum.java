package com.leshiguang.cloud.http.client.entity.sleep.algorithm;

/**
 * 睡眠状态枚举
 */
public enum SleepStatusEnum {

	/**
	 * 快速眼动
	 */
	REM(0, 20, 40),

	/**
	 * 清醒
	 */
	AWAKENING(1, 0, 5),

	/**
	 * 浅睡
	 */
	SHALLOW(2, 0, 80),

	/**
	 * 深睡
	 */
	DEEP(3, 20, 40);


	private int code;

	private int idealRangeLower;

	private int idealRangeUpper;

	SleepStatusEnum(int code, int idealRangeLower, int idealRangeUpper) {
		this.code = code;
		this.idealRangeLower = idealRangeLower;
		this.idealRangeUpper = idealRangeUpper;
	}

	public int getCode() {
		return code;
	}

	public int getIdealRangeLower() {
		return idealRangeLower;
	}

	public int getIdealRangeUpper() {
		return idealRangeUpper;
	}

	public static SleepStatusEnum getEnumByCode(int code) {
		SleepStatusEnum[] sleepStatusEnums = SleepStatusEnum.values();
		for (SleepStatusEnum sleepStatusEnum : sleepStatusEnums) {
			if (sleepStatusEnum.code == code) {
				return sleepStatusEnum;
			}
		}
		return null;
	}

	public static String getSleepRatioTag(SleepStatusEnum sleep, long ratio) {
		if (ratio < sleep.getIdealRangeLower()) {
			return "偏低";
		}
		if (ratio > sleep.getIdealRangeUpper()) {
			return "偏高";
		}
		return null;
	}
}
