package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Controller

@RestController
@CrossOrigin("http://localhost:4200")
public class HelloWorldController {

	// GET
	// URI - /hello-world
	// method - "Hello world"
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	// URI - /hello-world-bean
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		// throw new RuntimeException("Some Error has Happened! Contact Support at
		// ***-***-****");
		return new HelloWorldBean("Hello World - changed");
	}

	// URI - /hello-world/path-variable/in28minutes
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World , %s", name));
	}

}
