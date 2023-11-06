package com.xiaoxu.usercenterbackend.common;

public class ResultUtil {
    public static <T> BaseResponse<T> success(T  data) {
        return new BaseResponse<>(0, data, "ok");
    }
}
