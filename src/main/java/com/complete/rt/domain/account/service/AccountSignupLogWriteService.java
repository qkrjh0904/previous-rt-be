package com.complete.rt.domain.account.service;

import com.complete.rt.db.account.Account;
import com.complete.rt.db.account.AccountSignupLog;
import com.complete.rt.domain.account.repository.AccountSignupLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountSignupLogWriteService {

    private final AccountSignupLogRepository accountSignupLogRepository;

    public void save(Account account) {
        AccountSignupLog accountSignupLog = AccountSignupLog.create(account, "ip");
        accountSignupLogRepository.save(accountSignupLog);
    }
}
