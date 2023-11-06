package com.kimjunyo.kbo.service;

import com.kimjunyo.kbo.model.Kbo;
import com.kimjunyo.kbo.repository.KboRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KboService {

    //잘 못 되었을 때를 대비해 로그 확인
    private static final Logger logger = LoggerFactory.getLogger(KboService.class);

    @Autowired  // 의존성 주입
    private KboRepository repository;

    public List<Kbo> findByTeamName(String team) {
        List<Kbo> teams = repository.findByTeamName(team);
        return teams;
    }
}