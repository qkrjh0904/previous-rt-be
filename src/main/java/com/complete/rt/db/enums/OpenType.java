package com.complete.rt.db.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OpenType {

    OPEN("공개 상태"),
    CLOSED("비공개 상태(삭제, 신고)"),
    ;

    private final String description;
}
