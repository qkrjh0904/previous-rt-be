package com.complete.rt.domain.account.exception;

import com.complete.rt.domain.global.exception.BaseException;
import com.complete.rt.domain.global.exception.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CannotFindAccountException extends BaseException {
    public CannotFindAccountException() {
        super(HttpStatus.BAD_REQUEST, ExceptionCode.ACCOUNT_001);
    }
}
