package com.pingpong.pingpongview.event;


import lombok.extern.java.Log;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Log
@Service
@EnableBinding(Sink.class)
public class EventListener {

    @StreamListener(target = Sink.INPUT)
    public void receiveOrder(PingPong pingPong) {
        log.info("PingPong received: " + pingPong);
    }
}
