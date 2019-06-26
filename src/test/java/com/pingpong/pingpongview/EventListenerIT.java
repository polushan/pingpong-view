package com.pingpong.pingpongview;

import com.pingpong.pingpongview.dao.PingPong;
import com.pingpong.pingpongview.dao.PingPongRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.test.binder.MessageCollector;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EventListenerIT {
    @Autowired
    private Sink sink;
    @Autowired
    private MessageCollector messageCollector;
    @MockBean
    private PingPongRepository pingPongRepository;

    @Test
    public void eventAccepted() {
        String id = UUID.randomUUID().toString();
        PingPong pingPong = new PingPong(id, "ping", "pong");
        sink.input().send(MessageBuilder.withPayload(pingPong).build());
        verify(pingPongRepository, times(1)).save(any(PingPong.class));
    }
}
