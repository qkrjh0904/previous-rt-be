package com.complete.rt.domain.global.utils;

import lombok.experimental.UtilityClass;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.UUID;

@UtilityClass
public class FileUtils {


    public static String generateFileUid(MultipartFile file) {
        return UUID.randomUUID().toString();
    }

    public static String generateFilePath() {
        return "video/" + LocalDate.now() + "/";
    }
}
