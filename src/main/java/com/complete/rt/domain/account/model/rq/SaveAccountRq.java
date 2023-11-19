package com.complete.rt.domain.account.model.rq;

import com.complete.rt.domain.account.model.dto.SaveAccountDto;
import jakarta.validation.constraints.NotBlank;

public record SaveAccountRq(
        @NotBlank(message = "아이디는 필수입니다.")
        String id,
        @NotBlank(message = "비밀번호는 필수입니다.")
        String password,
        @NotBlank(message = "전화번호는 필수입니다.")
        String phone,
        @NotBlank(message = "닉네임은 필수입니다.")
        String nickname
) {
    public SaveAccountDto toDto() {
        return new SaveAccountDto(id, password, phone, nickname);
    }
}
