package com.complete.rt.domain.follow.model.dto;

import com.complete.rt.db.account.Account;
import com.complete.rt.db.follow.Follow;

public record SaveFollowDto(
        Long toAccountSn,
        Boolean followYn
) {
    public Follow toEntity(Account account) {
        return Follow.of(account.getSn(), toAccountSn);
    }
}
