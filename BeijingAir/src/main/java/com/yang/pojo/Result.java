package com.yang.pojo;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;
    private Long total;
    public static Result success(){
        Result result=new Result();
        result.setCode(0);
        result.setMsg("success");
        return result;
    }
    public static Result success(Object data){
        Result result = success();
        result.setData(data);
        return result;
    }
    public static Result success(Object data,Long total){
        Result result = success();
        result.setData(data);
        result.setTotal(total);
        return result;
    }
    public static Result error(String msg) {
        Result result = new Result();
        result.setMsg(msg);
        result.setCode(1);
        return result;
    }
}
