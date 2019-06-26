package com.pingpong.pingpongview.event;


import com.pingpong.pingpongview.dao.PingPong;
import com.pingpong.pingpongview.dao.PingPongRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Log
@Service
@EnableBinding(Sink.class)
public class EventListener {
    private PingPongRepository repository;

    @Autowired
    public EventListener(PingPongRepository repository) {
        this.repository = repository;
    }

    @StreamListener(target = Sink.INPUT)
    public void receiveOrder(PingPong pingPong) {
        log.info("PingPong received: " + pingPong);
        repository.save(pingPong);
    }
}
