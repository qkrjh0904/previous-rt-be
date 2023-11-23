package com.complete.rt.domain.post.controller;

import com.complete.rt.domain.global.path.ApiPath;
import com.complete.rt.domain.post.model.rq.SavePostRq;
import com.complete.rt.domain.post.service.PostWriteService;
import com.complete.rt.config.security.AccountContext;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostWriteController {

    private final PostWriteService postWriteService;

    @PostMapping(ApiPath.POST)
    public void save(@AuthenticationPrincipal AccountContext accountContext,
                     @Validated @RequestBody SavePostRq rq) {
        postWriteService.save(accountContext.id(), rq.toDto());
    }
}
