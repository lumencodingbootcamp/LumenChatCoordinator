package com.lumen.LumenChatCoordinator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lumen.LumenChatCoordinator")
public class LumenChatCoordinatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LumenChatCoordinatorApplication.class, args);
	}

}
