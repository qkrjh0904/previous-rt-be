package com.complete.rt.db.account;

import com.complete.rt.db.BaseCreateDateTimeEntity;
import com.complete.rt.db.enums.SuccessType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountLoginLog extends BaseCreateDateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sn;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, updatable = false)
    private SuccessType successType;

    @Column(nullable = false, updatable = false)
    private Long accountSn;

    @Column(nullable = false, updatable = false)
    private String id;

    @Column(nullable = false, updatable = false)
    private String ip;

    @Column(nullable = false, updatable = false, columnDefinition = "text")
    private String message;


    public static AccountLoginLog create(SuccessType successType, Long accountSn, String id, String ip, String message) {
        AccountLoginLog accountLoginLog = new AccountLoginLog();
        accountLoginLog.successType = successType;
        accountLoginLog.accountSn = accountSn;
        accountLoginLog.id = id;
        accountLoginLog.ip = ip;
        accountLoginLog.message = message;
        return accountLoginLog;
    }
}
