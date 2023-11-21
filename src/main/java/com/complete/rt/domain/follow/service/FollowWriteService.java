package com.complete.rt.domain.follow.service;

import com.complete.rt.db.account.Account;
import com.complete.rt.domain.account.service.AccountFindService;
import com.complete.rt.domain.follow.model.dto.SaveFollowDto;
import com.complete.rt.domain.follow.repository.FollowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class FollowWriteService {

    private final FollowRepository followRepository;

    private final AccountFindService accountFindService;

    public void saveOrDelete(String id, SaveFollowDto dto) {
        Account account = accountFindService.findByIdOrElseThrow(id);
        if(dto.followYn()){
            followRepository.save(dto.toEntity(account));
            return;
        }
        followRepository.deleteByFromAccountSnAndToAccountSn(account.getSn(), dto.toAccountSn());
    }
}
