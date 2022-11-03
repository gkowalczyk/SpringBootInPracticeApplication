package com.javappa.springbootmp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication - Odkomentuj przed uruchomieniem.
public class SpringBootInPracticeConsoleApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootInPracticeConsoleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInPracticeConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) {
		LOG.info("CommandLineRunner Started!");

		for (int i = 0; i < args.length; ++i) {
			LOG.info("args[{}]: {}", i, args[i]);
		}
	}
}
