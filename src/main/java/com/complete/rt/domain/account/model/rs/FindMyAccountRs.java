package com.complete.rt.domain.account.model.rs;

import com.complete.rt.db.account.Account;

public record FindMyAccountRs(
        String id,
        String phone,
        String nickname
) {
    public static FindMyAccountRs of(Account account) {
        return new FindMyAccountRs(
                account.getId(),
                account.getPhone(),
                account.getNickname()
        );
    }
}
