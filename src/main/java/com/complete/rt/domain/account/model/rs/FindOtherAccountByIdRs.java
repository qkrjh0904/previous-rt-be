package com.complete.rt.domain.account.model.rs;

import com.complete.rt.db.account.Account;

public record FindOtherAccountByIdRs(
        String id,
        String nickname
) {
    public static FindOtherAccountByIdRs of(Account account) {
        return new FindOtherAccountByIdRs(
                account.getId(),
                account.getNickname()
        );
    }
}
