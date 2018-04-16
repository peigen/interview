/**
 * Copyright (c) 2016-2018 Haofenqi.Co.Ltd. All rights reserved.
 */
package com.peigen.interview.service;

import com.peigen.interview.repository.entity.User;

/**
 * <b>(ServiceResult)</b>
 *
 * @author Peigen
 * @version 1.0.0
 * @date 2018/04/16
 */
public class ServiceResult {

    private Status status;

    private String code;

    private String msg;

    private User user;
}

enum Status {

    SUCCESS("SUCCESS", "处理成功"),
    FAIL("FAIL", "处理失败"),
    UNKOWN("UNKOWN", "处理结果未知");

    /** 枚举值 */
    private final String code;

    /** 枚举描述 */
    private final String message;

    Status(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /** @return Returns the code. */
    public String getCode() {
        return code;
    }

    /** @return Returns the message. */
    public String getMessage() {
        return message;
    }

    /** @return Returns the code. */
    public String code() {
        return code;
    }

    /** @return Returns the message. */
    public String message() {
        return message;
    }
}
