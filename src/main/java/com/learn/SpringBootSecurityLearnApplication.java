package com.learn;

import com.learn.models.User;
import com.learn.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootSecurityLearnApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityLearnApplication.class, args);
		System.out.println("Application Started.........");
		System.out.println("Jay Shree Krishna");


	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("brijesh",this.bCryptPasswordEncoder.encode("abc"),"abc@gmail.com","NORMAL");
//		this.userRepository.save(user);
		User user1 = new User("dhrumil",this.bCryptPasswordEncoder.encode("123"),"abc@gmail.com","ADMIN");
//		this.userRepository.save(user1);

	}
}
