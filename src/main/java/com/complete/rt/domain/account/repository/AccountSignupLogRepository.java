package com.complete.rt.domain.account.repository;

import com.complete.rt.db.account.AccountSignupLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountSignupLogRepository extends JpaRepository<AccountSignupLog, Long> {
}
