package com.mao.api.model;

import com.mao.api.constant.CommonConstants;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Common result wrapper
 */
@Data
@NoArgsConstructor
public class Result<T> {
    private String code;
    private String message;
    private T data;

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(CommonConstants.SUCCESS_CODE);
        result.setMessage(CommonConstants.SUCCESS_MSG);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error(String message) {
        Result<T> result = new Result<>();
        result.setCode(CommonConstants.ERROR_CODE);
        result.setMessage(message);
        return result;
    }
}