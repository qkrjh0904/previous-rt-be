package com.complete.rt.domain.post.service;

import com.complete.rt.db.account.Account;
import com.complete.rt.db.file.File;
import com.complete.rt.domain.account.service.AccountFindService;
import com.complete.rt.domain.file.service.FileFindService;
import com.complete.rt.domain.post.model.dto.SavePostDto;
import com.complete.rt.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PostWriteService {

    private final PostRepository postRepository;

    private final FileFindService fileFindService;
    private final AccountFindService accountFindService;

    public void save(String id, SavePostDto dto) {
        Account account = accountFindService.findByIdOrElseThrow(id);
        File file = fileFindService.findByFileUidOrElseThrow(dto.videoFileUid());
        postRepository.save(dto.toEntity(account, file));
    }
}
