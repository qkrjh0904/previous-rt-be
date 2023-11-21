package com.complete.rt.db.file;

import com.complete.rt.db.BaseCreateDateTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File extends BaseCreateDateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sn;

    @Column(nullable = false, updatable = false)
    private String uid;

    @Column(nullable = false, updatable = false)
    private String path;

    @Column(nullable = false, updatable = false)
    private Long size;

    public static File create(String fileUid, String filePath, Long fileSize) {
        File file = new File();
        file.uid = fileUid;
        file.path = filePath;
        file.size = fileSize;
        return file;
    }
}
