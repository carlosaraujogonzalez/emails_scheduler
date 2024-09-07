package com.gbtec.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.scheduling.annotation.EnableScheduling
public class SchedulerApplication {

	public static void main(String[] args) throws InterruptedException {

		SpringApplication.run( SchedulerApplication.class, args);
	}

}
