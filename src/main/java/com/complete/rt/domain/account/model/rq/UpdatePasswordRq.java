package com.complete.rt.domain.account.model.rq;

import com.complete.rt.domain.account.model.dto.UpdatePasswordDto;

public record UpdatePasswordRq(
        String password
) {
    public UpdatePasswordDto toDto() {
        return new UpdatePasswordDto(password);
    }
}
