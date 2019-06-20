package com.horstmann.greet;

public interface Greeter{
	static Greeter new Instance{
		return new com.horstmann.greet.internal.GreeterImpl();
	}

	String greet(String subject);
}