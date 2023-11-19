package com.complete.rt.db.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SuccessType {

    SUCCESS("성공"),
    FAIL("실패"),
    ;

    private final String description;
}
