package com.complete.rt.domain.file.service;

import com.complete.rt.db.file.File;
import com.complete.rt.domain.file.exception.CannotFindFileException;
import com.complete.rt.domain.file.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FileFindService {

    private final FileRepository fileRepository;

    public File findByFileUidOrElseThrow(String uid) {
        return fileRepository.findByUid(uid)
                .orElseThrow(CannotFindFileException::new);
    }
}
