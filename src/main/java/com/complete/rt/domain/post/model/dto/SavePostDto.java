package com.complete.rt.domain.post.model.dto;

import com.complete.rt.db.account.Account;
import com.complete.rt.db.enums.AccessType;
import com.complete.rt.db.file.File;
import com.complete.rt.db.post.Post;

public record SavePostDto(
        String title,
        String content,
        String videoFileUid,
        AccessType accessType
) {
    public Post toEntity(Account account, File file) {
        return Post.of(title, content, accessType, account, file);
    }
}
