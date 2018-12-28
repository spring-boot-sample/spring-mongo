package com.example.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MongoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args)  {
		List<User> userList = userRepository.findAll();
		userList.stream().forEach(user -> System.out.println(user.getName()));

	}
}

