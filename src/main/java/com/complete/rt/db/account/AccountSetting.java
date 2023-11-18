package com.complete.rt.db.account;

import com.complete.rt.db.BaseDateTimeEntity;
import com.complete.rt.db.enums.SuccessType;
import com.complete.rt.db.enums.UseType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountSetting extends BaseDateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sn;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UseType notificationUseType = UseType.USE;

    @Column(nullable = false, updatable = false)
    private Long accountSn;

}