package com.complete.rt.db.account;

import com.complete.rt.db.BaseCreateDateTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountSignupLog extends BaseCreateDateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sn;

    @Column(nullable = false, updatable = false)
    private Long accountSn;

    @Column(nullable = false, updatable = false)
    private String id;

    @Column(nullable = false, updatable = false)
    private String phone;

    @Column(nullable = false, updatable = false)
    private String ip;

    public static AccountSignupLog create(Account account, String ip) {
        AccountSignupLog accountSignupLog = new AccountSignupLog();
        accountSignupLog.accountSn = account.getSn();
        accountSignupLog.id = account.getId();
        accountSignupLog.phone = account.getPhone();
        accountSignupLog.ip = ip;
        return accountSignupLog;
    }
}
