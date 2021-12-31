package me.hyunta.java8to11.funcinterface;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

	public static void main(String[] args) {
		UnaryOperator<String> hi = Greeting::hi;
		Greeting greeting = new Greeting();
		UnaryOperator<String> hello = greeting::hello;

		System.out.println(hi.apply("mark"));
		System.out.println(hello.apply("marco"));

		Supplier<Greeting> newGreeting = Greeting::new;
		Greeting greeting1 = newGreeting.get();

		Function<String, Greeting> hyuntaGreeting = Greeting::new;
		System.out.println(hyuntaGreeting.apply("hyunta").getName());

		String[] names = {"hyunta", "younghan", "pobi"};
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(names));
	}
}
