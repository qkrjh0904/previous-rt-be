package com.complete.rt.domain.post.controller;

import com.complete.rt.domain.post.service.PostWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostWriteController {

    private final PostWriteService postWriteService;
}
