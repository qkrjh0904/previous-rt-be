package com.complete.rt.domain.account.service;

import com.complete.rt.db.account.Account;
import com.complete.rt.domain.account.exception.CannotFindAccountException;
import com.complete.rt.domain.account.model.rs.FindMyAccountRs;
import com.complete.rt.domain.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AccountFindService {

    private final AccountRepository accountRepository;

    public Account findByIdOrElseThrow(String id) {
        return accountRepository.findById(id)
                .orElseThrow(CannotFindAccountException::new);
    }

    public FindMyAccountRs findMyAccount(String id) {
        Account account = findByIdOrElseThrow(id);
        return FindMyAccountRs.of(account);
    }
}
