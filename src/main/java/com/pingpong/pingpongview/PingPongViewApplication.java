package com.pingpong.pingpongview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RefreshScope
@EnableSwagger2
@EnableEurekaClient
@SpringBootApplication
public class PingPongViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingPongViewApplication.class, args);
	}

}
