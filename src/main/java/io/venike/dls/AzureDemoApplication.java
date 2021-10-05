package io.venike.dls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureDemoApplication {

	@GetMapping("/hello")
	public String hello() {
		
		return "Congratulations! Your first app is updated and pushed to azure without much complex!! and this is real Cool!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

}
