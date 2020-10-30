package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	
	private String message;
	
	public HelloWorldBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String toString() {
		return String.format("HelloworldBean [message=%s", message);
	}
}
