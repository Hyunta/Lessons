package _01_creational_pattern.factorymethod.before;

public class Client {
	public static void main(String[] args) {
		Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
		System.out.println(whiteship);

		Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
		System.out.println(blackship);
	}
}
