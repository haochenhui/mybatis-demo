package com.test.core.base;

import com.test.core.utils.Result;

/**
 * Created by hch on 2017/7/12.
 */
public class BaseController {

    public Result success(String message) {
        return new Result().addSuccess(message);
    }

    public Result error(String message) {
        return new Result().addError(message);
    }

    public Result warn(String message) {
        return new Result().addWarn(message);
    }
    public Result fail(String message) {
        return new Result().addFail(message);
    }
}
