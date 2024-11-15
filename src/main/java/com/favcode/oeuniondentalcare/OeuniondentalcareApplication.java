package com.favcode.oeuniondentalcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.favcode.oeuniondentalcare.repository")
@EntityScan("com.favcode.oeuniondentalcare.model")
public class OeuniondentalcareApplication {

	public static void main(String[] args) {
		SpringApplication.run(OeuniondentalcareApplication.class, args);
	}

}
