package me.hyunta.java8to11.funcinterface;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Foo2 {
	public static void main(String[] args) {
		Supplier<Integer> get10 = () -> 10;
		BinaryOperator<Integer> sum = (a, b) -> a + b;
		Foo2 foo2 = new Foo2();
		foo2.run();

	}

	private void run() {
		int baseNumber = 10;

		//로컬 클래스
		class LocalClass{
			void PrintBaseNumber() {
				int baseNumber = 11;
				System.out.println(baseNumber);
			}
		}

		//익명 클래스
		Consumer<Integer> integerConsumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer baseNumber) {
				System.out.println(baseNumber);
			}
		};

		//람다
		IntConsumer printInt = (i) -> {
			System.out.println(i + baseNumber);
		};

		printInt.accept(10);
	}
}
