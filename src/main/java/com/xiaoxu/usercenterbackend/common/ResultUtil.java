package com.xiaoxu.usercenterbackend.common;

public class ResultUtil {
    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T  data) {
        return new BaseResponse<>(0, data, "ok");
    }
    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

}
