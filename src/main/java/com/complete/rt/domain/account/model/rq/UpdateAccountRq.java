package com.complete.rt.domain.account.model.rq;

import com.complete.rt.domain.account.model.dto.UpdateAccountDto;

public record UpdateAccountRq(
        String nickname,
        String profileImageUid
) {
    public UpdateAccountDto toDto() {
        return new UpdateAccountDto(nickname, profileImageUid);
    }
}
