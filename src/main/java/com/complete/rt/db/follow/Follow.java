package com.complete.rt.db.follow;

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
public class Follow extends BaseCreateDateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sn;

    @Column(nullable = false, updatable = false)
    private Long fromAccountSn;

    @Column(nullable = false, updatable = false)
    private Long toAccountSn;

    public static Follow of(Long fromAccountSn, Long toAccountSn) {
        Follow follow = new Follow();
        follow.fromAccountSn = fromAccountSn;
        follow.toAccountSn = toAccountSn;
        return follow;
    }
}
