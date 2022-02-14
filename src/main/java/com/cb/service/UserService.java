package com.cb.service;

import com.cb.model.User;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class UserService {

	public static final String USER_SERVICE = "user-service";


	@Retry(name = USER_SERVICE, fallbackMethod = "getDummyUser")
	public User getUser() {
		log.info("calling 3rd party");
		// call 3rd party
		throw new RuntimeException("error");
		//return User.builder().id("101").name("DJ").address("Rourkela").build();
	}

	public User getDummyUser(Exception exception) {
		log.info("getting dummy data");
		return User.builder().id(String.valueOf(new Random().nextInt())).name("Dhananjay").address("Bangalore").build();
	}
}
