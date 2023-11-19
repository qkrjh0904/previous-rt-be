package com.complete.rt.db.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ReadType {

    READ("읽음"),
    UNREAD("안읽음"),
    ;

    private final String description;
}
