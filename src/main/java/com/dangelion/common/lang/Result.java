package com.dangelion.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author Gavin
 * @Date 2020/7/22
 */
@Data
public class Result implements Serializable {

    private int code;//200正常，非200表示异常
    private String msg;
    private Object data;

    public static Result success(Object data) {
        return success(200, "操作成功", data);
    }

    public static Result success(int code, String msg, Object data) {
        Result rs = new Result();
        rs.setCode(code);
        rs.setMsg(msg);
        rs.setData(data);
        return rs;
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(int code, String msg, Object data) {
        Result rs = new Result();
        rs.setCode(code);
        rs.setMsg(msg);
        rs.setData(data);
        return rs;
    }
}
