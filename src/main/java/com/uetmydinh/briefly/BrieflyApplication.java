package com.uetmydinh.briefly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BrieflyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrieflyApplication.class, args);
	}

}
