package me.hyunta.java8to11.interfaceDiff2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("keesum");
		names.add("hyunta");
		names.add("pobi");
		names.add("foo");

		// names.forEach(System.out::println);

		// for (String name : names) {
		// 	System.out.println(name);
		// }
		Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
		names.sort(compareToIgnoreCase);
		// names.sort(compareToIgnoreCase.reversed().thenComparing()); 정렬을 하고 또 다른 우선순위
		names.forEach(System.out::println);

		Spliterator<String> spliterator = names.spliterator();
		Spliterator<String> spliterator1 = spliterator.trySplit();
		while (spliterator.tryAdvance(System.out::println));
		System.out.println("=============");
		while (spliterator1.tryAdvance(System.out::println));

		List<String> k = names.stream().map(String::toUpperCase)
			.filter(s -> s.startsWith("K"))
			.collect(Collectors.toList());
		System.out.println(k);

		names.removeIf(s -> s.startsWith("k"));
		names.forEach(System.out::println);

	}
}
