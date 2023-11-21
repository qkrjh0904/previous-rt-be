package com.complete.rt.domain.account.controller;

import com.complete.rt.domain.account.model.rs.FindMyAccountRs;
import com.complete.rt.domain.account.model.rs.FindOtherAccountByIdRs;
import com.complete.rt.domain.account.service.AccountFindService;
import com.complete.rt.domain.global.path.ApiPath;
import com.complete.rt.security.AccountContext;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountFindController {

    private final AccountFindService accountFindService;

    @Operation(summary = "내 계정 정보 조회")
    @GetMapping(ApiPath.ACCOUNT)
    public FindMyAccountRs findMyAccount(@AuthenticationPrincipal AccountContext accountContext) {
        return accountFindService.findMyAccount(accountContext.id());
    }

    @Operation(summary = "상대 계정 정보 조회")
    @GetMapping(ApiPath.ACCOUNT_ID)
    public FindOtherAccountByIdRs findOtherAccountById(@AuthenticationPrincipal AccountContext accountContext,
                                                       @RequestParam("id") String otherAccountId) {
        return accountFindService.findOtherAccountById(accountContext.id(), otherAccountId);
    }

}
