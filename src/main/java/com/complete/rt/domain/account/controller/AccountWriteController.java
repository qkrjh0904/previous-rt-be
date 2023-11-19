package com.complete.rt.domain.account.controller;

import com.complete.rt.domain.account.model.rq.SaveAccountRq;
import com.complete.rt.domain.account.model.rq.UpdateAccountRq;
import com.complete.rt.domain.account.service.AccountWriteService;
import com.complete.rt.domain.global.path.ApiPath;
import com.complete.rt.security.AccountContext;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "AccountWriteController", description = "계정 쓰기 API")
public class AccountWriteController {

    private final AccountWriteService accountWriteService;

    @Operation(summary = "회원가입")
    @PostMapping(ApiPath.ACCOUNT)
    public void save(@Validated @RequestBody SaveAccountRq rq) {
        accountWriteService.save(rq.toDto());
    }

    @Operation(summary = "계정수정")
    @PutMapping(ApiPath.ACCOUNT)
    public void update(@AuthenticationPrincipal AccountContext accountContext,
                       @Validated @RequestBody UpdateAccountRq rq) {
        accountWriteService.update(accountContext.id(), rq.toDto());
    }

    // TODO: 2023-11-19 로그아웃
    // TODO: 2023-11-19 회원탈퇴  
    // TODO: 2023-11-19 비밀번호 수정
}
