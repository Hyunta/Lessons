package me.hyunta.java8to11.optionalAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import me.hyunta.java8to11.optional.OnlineClass;

public class App {
	public static void main(String[] args) {
		List<OnlineClass> springClasses = new ArrayList<>();
		springClasses.add(new OnlineClass(1, "spring boot", true));
		springClasses.add(new OnlineClass(5, "rest api development", false));

		Optional<OnlineClass> onlineClass = springClasses.stream()
			.filter(oc -> oc.getTitle().startsWith("spring"))
			.findFirst();

		boolean present = onlineClass.isPresent();

		// OnlineClass onlineClassPrac = onlineClass.get();
		// System.out.println(onlineClassPrac.getTitle());

		Optional<OnlineClass> optional = springClasses.stream()
			.filter(oc -> oc.getTitle().startsWith("spring"))
			.findFirst();

		// optional.ifPresent(oc -> System.out.println(oc.getTitle()));
		OnlineClass onlineClass3 = optional.orElseGet(App::createNewJpaClass);
		System.out.println(onlineClass3.getTitle());

		OnlineClass onlineClass1 = optional.orElseThrow(IllegalStateException::new);
		System.out.println(onlineClass1.getTitle());

		Optional<OnlineClass> optional1 = optional.filter(oc -> !oc.isClosed());
		System.out.println(optional1.isEmpty());

		Optional<Integer> integer = optional.map(OnlineClass::getId);
		System.out.println(integer.isPresent());

	}

	private static OnlineClass createNewJpaClass() {
		System.out.println("creating new online class");
		return new OnlineClass(10, "New Class", false);
	}
}
