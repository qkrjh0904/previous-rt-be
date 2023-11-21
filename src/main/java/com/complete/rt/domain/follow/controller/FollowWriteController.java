package com.complete.rt.domain.follow.controller;

import com.complete.rt.domain.follow.model.rq.SaveFollowRq;
import com.complete.rt.domain.follow.service.FollowWriteService;
import com.complete.rt.domain.global.path.ApiPath;
import com.complete.rt.security.AccountContext;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FollowWriteController {

    private final FollowWriteService followWriteService;

    @PostMapping(ApiPath.FOLLOW)
    public void save(@AuthenticationPrincipal AccountContext accountContext,
                     @RequestBody SaveFollowRq rq) {
        followWriteService.saveOrDelete(accountContext.id(), rq.toDto());
    }
}
