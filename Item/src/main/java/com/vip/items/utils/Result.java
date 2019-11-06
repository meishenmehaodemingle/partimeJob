package com.vip.items.utils;

import lombok.Data;


@Data
public class Result<T> {
    private int status;
    private String msg;
    private T data;

    public static Result success(Object o){
        Result result = new Result();
        result.setStatus(constant.SUCCESS_STATUS_200);
        result.setData(o);
        result.setMsg(constant.SUCCESS_MSG);
        return result;
    }
    public static Result error(){
        Result result = new Result();
        result.setStatus(constant.ERROR_STATUS_404);
        result.setMsg(constant.ERROR_MSG);
        return result;
    }
}
