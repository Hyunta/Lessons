package me.hyunta.java8to11.funcinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {
	public static void main(String[] args) {
		/**
		 * 함수형 인터페이스와 람다 표현식 소개
		 */
		//익명 내부 클래스 anonymous inner class
		// RunSomething runSomething = (number) -> {
		// 	return number + 10;
		// };
		// System.out.println(runSomething.doIt(1));
		// System.out.println(runSomething.doIt(2));

		// int baseNumber = 10;
		// RunSomething runSomething = new RunSomething() {
		//
		// 	@Override
		// 	public int doIt(int number) {
		// 		return number + baseNumber;
		// 	}
		// };
		// System.out.println(runSomething.doIt(10));
		// System.out.println(runSomething.doIt(10));

		// Plus10 plus10 = new Plus10();
		// System.out.println(plus10.apply(1));

		/**
		 * 자바가 제공하는 함수형 인터페이스
		 */
		Function<Integer, Integer> plus10 = (number) -> number + 10;
		Function<Integer, Integer> multiply2 = (i) -> i * 2;
		Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
		Function<Integer, Integer> plus10AndThenMultiply2 = plus10.andThen(multiply2);

		System.out.println(plus10.apply(1));
		System.out.println(multiply2.apply(2));
		System.out.println(plus10.compose(multiply2).apply(2));
		System.out.println(plus10AndThenMultiply2.apply(2));

		Consumer<Integer> printT = (i) -> System.out.println(i);
		printT.accept(10);

		Supplier<Integer> get10 = () -> 10;
		System.out.println(get10.get());

		Predicate<String> statsWithH = (s) -> s.startsWith("H");
		Predicate<Integer> isEven = (i) -> i % 2 == 0;
		System.out.println(statsWithH.test("Hyunta"));

		UnaryOperator<Integer> minus10 = (i) -> i - 10;
		System.out.println(minus10.apply(20));

	}
}
