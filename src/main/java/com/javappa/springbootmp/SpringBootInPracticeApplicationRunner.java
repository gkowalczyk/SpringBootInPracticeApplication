package com.javappa.springbootmp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.core.annotation.Order;

//@SpringBootApplication - Odkomentuj przed uruchomieniem.
public class SpringBootInPracticeApplicationRunner implements ApplicationRunner {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootInPracticeApplicationRunner.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInPracticeApplicationRunner.class, args);
	}

	@Override
	@Order
	public void run(ApplicationArguments args) {
		
		LOG.info("SpringBootMaterialyPraktyczneApplicationRunner Started!");
        
		LOG.info("NonOptionArgs:");
        args.getNonOptionArgs().forEach(LOG::info);

        LOG.info("OptionArgs:");
        args.getOptionNames().forEach(optionName -> {
            LOG.info(optionName + "=" + args.getOptionValues(optionName));
        });
	}
}
