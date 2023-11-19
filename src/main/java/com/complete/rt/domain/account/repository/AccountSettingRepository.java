package com.complete.rt.domain.account.repository;

import com.complete.rt.db.account.AccountSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountSettingRepository extends JpaRepository<AccountSetting, Long> {
}
