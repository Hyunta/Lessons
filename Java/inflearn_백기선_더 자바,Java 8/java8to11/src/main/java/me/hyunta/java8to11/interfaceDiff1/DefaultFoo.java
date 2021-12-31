package me.hyunta.java8to11.interfaceDiff1;

public class DefaultFoo implements Foo {
	String name;

	public DefaultFoo(String name) {
		this.name = name;
	}

	@Override
	public void printName() {
		System.out.println(this.name);
	}

	@Override
	public String getName() {
		return this.name;
	}
}
