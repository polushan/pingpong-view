package com.pingpong.pingpongview.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "pingpong")
@AllArgsConstructor
@NoArgsConstructor
public class PingPong {
    @Id
    @Column(length = 36)
    private String id;
    @Column(length = 4)
    private String ping;
    private String pong;
}
