package com.complete.rt.domain.account.model.dto;

import com.complete.rt.db.account.Account;

public record SaveAccountDto(
        String id,
        String password,
        String phone,
        String nickname
) {

    public Account toEntity() {
        return Account.create(id, password, phone, nickname);
    }
}
