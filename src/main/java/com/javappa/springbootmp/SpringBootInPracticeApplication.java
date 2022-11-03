package com.javappa.springbootmp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootInPracticeApplication {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootInPracticeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInPracticeApplication.class, args);
	}

	@EventListener
	public void onApplicationEvent(ApplicationReadyEvent event) {
		LOG.info("Application Started!");
	}
}
