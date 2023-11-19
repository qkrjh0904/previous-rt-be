package com.complete.rt.domain.account.repository;

import com.complete.rt.db.account.AccountLoginLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountLoginLogRepository extends JpaRepository<AccountLoginLog, Long> {
}
