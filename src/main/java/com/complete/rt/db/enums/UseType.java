package com.complete.rt.db.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UseType {

    USE("사용"),
    UNUSED("미사용"),
    ;

    private final String description;
}
