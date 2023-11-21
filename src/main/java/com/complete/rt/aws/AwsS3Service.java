package com.complete.rt.aws;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AwsS3Service {


    public Long upload(String fileUid, String filePath, MultipartFile file) {
        // TODO: 2023-11-22 s3 업로드
        return 10L;
    }

}
