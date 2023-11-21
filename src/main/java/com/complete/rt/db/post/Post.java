package com.complete.rt.db.post;

import com.complete.rt.db.BaseDateTimeEntity;
import com.complete.rt.db.account.Account;
import com.complete.rt.db.enums.AccessType;
import com.complete.rt.db.enums.OpenType;
import com.complete.rt.db.file.File;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseDateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sn;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false, updatable = false)
    private Long videoFileSn;

    @Column(nullable = false, updatable = false)
    private Long accountSn;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AccessType accessType;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OpenType openType = OpenType.OPEN;

    public static Post of(String title, String content, AccessType accessType, Account account, File file) {
        Post post = new Post();
        post.title = title;
        post.content = content;
        post.videoFileSn = file.getSn();
        post.accountSn = account.getSn();
        post.accessType = accessType;
        return post;
    }
}
