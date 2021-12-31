package me.hyunta.java8to11.interfaceDiff1;

public class App {
	public static void main(String[] args) {
		Foo foo = new DefaultFoo("hyuntae");
		foo.printName();
		foo.printNameUpperCase();

		Foo.printAnything();
	}
}
