package com.complete.rt.domain.account.repository;

import com.complete.rt.db.account.AccountPasswordLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountPasswordLogRepository extends JpaRepository<AccountPasswordLog, Long> {
}
