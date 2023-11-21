package com.complete.rt.domain.follow.model.rq;

import com.complete.rt.domain.follow.model.dto.SaveFollowDto;

public record SaveFollowRq(
        Long toAccountSn,
        Boolean followYn
) {
    public SaveFollowDto toDto() {
        return new SaveFollowDto(toAccountSn, followYn);
    }
}
