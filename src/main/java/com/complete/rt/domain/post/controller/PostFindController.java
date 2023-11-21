package com.complete.rt.domain.post.controller;

import com.complete.rt.domain.post.service.PostFindService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostFindController {

    private final PostFindService postFindService;

}
