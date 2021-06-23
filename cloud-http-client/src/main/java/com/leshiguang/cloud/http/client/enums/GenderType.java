package com.leshiguang.cloud.http.client.enums;

public enum GenderType {

	MAN(1, "男"),
	FEMALE(2, "女");


	private int type;

	private String desc;

	GenderType(int type, String desc) {
		this.type = type;
		this.desc = desc;
	}
}
