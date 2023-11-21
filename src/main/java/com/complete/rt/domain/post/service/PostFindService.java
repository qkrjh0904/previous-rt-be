package com.complete.rt.domain.post.service;

import com.complete.rt.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostFindService {

    private final PostRepository postRepository;
}
