package com.pingpong.pingpongview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = "vcap.application.uris[0]=localhost")
public class PingPongViewApplicationTests {

	@Test
	public void contextLoads() {
	}

}
