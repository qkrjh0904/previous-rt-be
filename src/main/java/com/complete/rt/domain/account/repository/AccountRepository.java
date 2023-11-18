package com.complete.rt.domain.account.repository;

import com.complete.rt.db.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
