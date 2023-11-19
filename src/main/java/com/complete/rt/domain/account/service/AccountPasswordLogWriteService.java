package com.complete.rt.domain.account.service;

import com.complete.rt.db.account.Account;
import com.complete.rt.db.account.AccountPasswordLog;
import com.complete.rt.domain.account.repository.AccountPasswordLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountPasswordLogWriteService {

    private final AccountPasswordLogRepository accountPasswordLogRepository;

    public void save(Account account) {
        AccountPasswordLog accountPasswordLog = AccountPasswordLog.create(account);
        accountPasswordLogRepository.save(accountPasswordLog);
    }
}
