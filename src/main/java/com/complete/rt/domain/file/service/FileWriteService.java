package com.complete.rt.domain.file.service;

import com.complete.rt.aws.AwsS3Service;
import com.complete.rt.db.file.File;
import com.complete.rt.domain.file.repository.FileRepository;
import com.complete.rt.domain.global.utils.FileUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
@RequiredArgsConstructor
public class FileWriteService {

    private final AwsS3Service awsS3Service;
    private final FileRepository fileRepository;

    public String save(MultipartFile newFile) {
        checkFileExtensionValidation(newFile);

        String fileUid = FileUtils.generateFileUid(newFile);
        String filePath = FileUtils.generateFilePath();
        Long fileSize = awsS3Service.upload(fileUid, filePath, newFile);

        checkFileSizeValidation(fileSize);
        File file = File.create(fileUid, filePath, fileSize);
        fileRepository.save(file);

        return fileUid;
    }

    private void checkFileSizeValidation(Long fileSize) {
        // TODO: 2023-11-22 파일 사이즈 검증
    }

    private void checkFileExtensionValidation(MultipartFile file) {
        // TODO: 2023-11-22 파일 확장자 검증
    }


}
