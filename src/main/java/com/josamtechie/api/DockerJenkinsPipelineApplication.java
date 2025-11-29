package com.josamtechie.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsPipelineApplication {

    @GetMapping("/welcome")
    public String welcomeMessage()
    {
        return "Welcome to JosamTechie";
    }
	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsPipelineApplication.class, args);
	}

}
