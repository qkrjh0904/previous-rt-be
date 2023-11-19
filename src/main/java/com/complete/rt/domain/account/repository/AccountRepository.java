package com.complete.rt.domain.account.repository;

import com.complete.rt.db.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findById(String id);
}
