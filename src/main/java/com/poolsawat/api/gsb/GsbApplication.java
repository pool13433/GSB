package com.poolsawat.api.gsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsbApplication.class, args);
	}
}
