package com.complete.rt.domain.follow.repository;

import com.complete.rt.db.follow.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long> {
    void deleteByFromAccountSnAndToAccountSn(Long sn, Long accountSn);
}
