package com.leshiguang.cloud.http.client.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultData<T> implements Serializable {

    private static final long serialVersionUID = -1;

    private T data;

    private int code;

    private String msg;


}
