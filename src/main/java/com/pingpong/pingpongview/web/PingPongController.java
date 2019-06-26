package com.pingpong.pingpongview.web;

import com.pingpong.pingpongview.dao.PingPong;
import com.pingpong.pingpongview.service.PingPongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/view", produces = "application/json")
public class PingPongController {
    private PingPongService pingPongService;

    @Autowired
    public PingPongController(PingPongService pingPongService) {
        this.pingPongService = pingPongService;
    }

    @GetMapping
    public ResponseEntity<List<PingPong>> getAll() {
        return ResponseEntity.ok(pingPongService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PingPong> getById(@PathVariable("id") String id) {
        return ResponseEntity.ok(pingPongService.findById(id));
    }
}
