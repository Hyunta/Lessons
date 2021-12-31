package me.hyunta.java8to11.funcinterface;

@FunctionalInterface
public interface RunSomething {

	//추상화 메서드가 몇개있냐? 한개면 무조건 functional interface
	// void doIt();

	int doIt(int number);

	static void printName() {
		System.out.println("Hyunta");
	}

	default void printAge() {
		System.out.println("30");
	}
}
