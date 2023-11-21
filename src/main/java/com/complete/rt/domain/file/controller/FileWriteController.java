package com.complete.rt.domain.file.controller;

import com.complete.rt.domain.file.service.FileWriteService;
import com.complete.rt.domain.global.path.ApiPath;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class FileWriteController {

    private final FileWriteService fileWriteService;

    @PostMapping(ApiPath.FILE)
    public String save(@RequestPart("file") MultipartFile newFile) {
        return fileWriteService.save(newFile);
    }
}
