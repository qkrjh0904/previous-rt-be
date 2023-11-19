package com.complete.rt.domain.file.exception;

import com.complete.rt.domain.global.exception.BaseException;
import com.complete.rt.domain.global.exception.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CannotFindFileException extends BaseException {
    public CannotFindFileException() {
        super(HttpStatus.BAD_REQUEST, ExceptionCode.EXC_FILE_01);
    }
}
