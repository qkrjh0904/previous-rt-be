package com.complete.rt.domain.post.model.rq;

import com.complete.rt.db.enums.AccessType;
import com.complete.rt.domain.post.model.dto.SavePostDto;

public record SavePostRq(
        String title,
        String content,
        String videoFileUid,
        AccessType accessType
) {
    public SavePostDto toDto() {
        return new SavePostDto(title, content, videoFileUid, accessType);
    }
}
