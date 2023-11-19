package com.complete.rt.db.account;

import com.complete.rt.db.BaseDateTimeEntity;
import com.complete.rt.db.file.File;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "uk_account_id", columnNames = {"id"})
})
public class Account extends BaseDateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sn;

    @Column(nullable = false, updatable = false)
    private String id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String nickname;

    private Long profileImageSn;

    public static Account create(String id, String password, String phone, String nickname) {
        Account account = new Account();
        account.id = id;
        account.password = password;
        account.phone = phone;
        account.nickname = nickname;
        return account;
    }

    public void updateNickname(String nickname) {
        this.nickname = nickname;
    }

    public void updateProfileImage(File profileImage) {
        this.profileImageSn = profileImage.getSn();
    }
}