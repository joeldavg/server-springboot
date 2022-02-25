package com.getarrays.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.getarrays.server.enumeration.Status;
import com.getarrays.server.model.Server;
import com.getarrays.server.repository.ServerRepository;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(ServerRepository serverRepository) {
		return args -> {
			serverRepository.save(
					new Server(null, "192.168.1.168", "Ubuntu Linux", "16 GB", "Personal PC", "http://", Status.SERVER_UP));
		};
	}

}
