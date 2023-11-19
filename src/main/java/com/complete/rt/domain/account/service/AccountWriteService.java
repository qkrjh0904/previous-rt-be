package com.complete.rt.domain.account.service;

import com.complete.rt.db.account.Account;
import com.complete.rt.db.file.File;
import com.complete.rt.domain.account.model.dto.SaveAccountDto;
import com.complete.rt.domain.account.model.dto.UpdateAccountDto;
import com.complete.rt.domain.account.repository.AccountRepository;
import com.complete.rt.domain.file.service.FileFindService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountWriteService {

    private final AccountRepository accountRepository;

    private final FileFindService fileFindService;
    private final AccountFindService accountFindService;
    private final AccountSignupLogWriteService accountSignupLogWriteService;
    private final AccountPasswordLogWriteService accountPasswordLogWriteService;

    public void save(SaveAccountDto dto) {
        checkValidation(dto);
        Account account = dto.toEntity();
        accountRepository.save(account);

        accountSignupLogWriteService.save(account);
        accountPasswordLogWriteService.save(account);
    }

    private void checkValidation(SaveAccountDto dto) {
        // TODO: 2023-11-19 아이디 중복체크
        // TODO: 2023-11-19 비밀번호 유효성 체크
        // TODO: 2023-11-19 휴대폰 인증 체크
    }

    public void update(String id, UpdateAccountDto dto) {
        Account account = accountFindService.findByIdOrElseThrow(id);
        File profileImage = fileFindService.findByFileUidOrElseThrow(dto.profileImageUid());

        account.updateNickname(dto.nickname());
        account.updateProfileImage(profileImage);
    }
}
