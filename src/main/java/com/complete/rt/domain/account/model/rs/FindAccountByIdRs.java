package com.complete.rt.domain.account.model.rs;

import com.complete.rt.db.account.Account;

public record FindAccountByIdRs(
        String id,
        String nickname
) {
    public static FindAccountByIdRs of(Account account) {
        return new FindAccountByIdRs(
                account.getId(),
                account.getNickname()
        );
    }
}
