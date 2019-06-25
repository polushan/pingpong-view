package com.pingpong.pingpongview.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PingPong {
    private String id;
    private String ping;
    private String pong;
}
