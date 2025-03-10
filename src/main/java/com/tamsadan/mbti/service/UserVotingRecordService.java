package com.tamsadan.mbti.service;

import com.tamsadan.mbti.repository.UserVotingRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserVotingRecordService {
    private final UserVotingRecordRepository userVotingRecordRepository;
}
