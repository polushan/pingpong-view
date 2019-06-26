package com.pingpong.pingpongview.service;

import com.google.common.collect.Lists;
import com.pingpong.pingpongview.dao.PingPong;
import com.pingpong.pingpongview.dao.PingPongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PingPongService {
    private PingPongRepository pingPongRepository;

    @Autowired
    public PingPongService(PingPongRepository pingPongRepository) {
        this.pingPongRepository = pingPongRepository;
    }

    public PingPong findById(String id) {
        return pingPongRepository.findById(id).orElse(null);
    }

    public List<PingPong> findAll() {
        return Lists.newArrayList(pingPongRepository.findAll());
    }
}
