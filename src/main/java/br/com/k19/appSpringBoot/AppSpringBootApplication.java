package br.com.k19.appSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.k19.web")
@EnableAutoConfiguration
public class AppSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSpringBootApplication.class, args);
	}
}
