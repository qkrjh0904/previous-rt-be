package com.complete.rt.db.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AccessType {

    PUBLIC("전체 공개"),
    PRIVATE("나만 공개"),
    ;

    private final String description;
}
