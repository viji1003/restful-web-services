package com.in28minutes.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Controller

@RestController
@CrossOrigin("http://localhost:4200")
public class BasicAuthenticationController {

	// URI - /basicauth
	@RequestMapping(method = RequestMethod.GET, path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		// throw new RuntimeException("Some Error has Happened! Contact Support at
		// ***-***-****");
		return new AuthenticationBean("You are authenticated");
	}

}
