package me.hyunta.java8to11.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("keesun");
		names.add("hyunta");
		names.add("pobi");
		names.add("foo");

		List<String> collect = names.stream().map((s) -> {
			System.out.println(s);
			return s.toUpperCase();
		}).collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("===============");

		names.forEach(System.out::println);

		List<String> result = names.parallelStream().map(String::toUpperCase)
			.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
