package _01_creational_pattern.factorymethod.after;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		client.print(new WhiteShipFactory(), "whiteship", "hyunta@mail.com");
		client.print(new BlackShipFactory(), "blackship", "hyunta@mail.com");
	}

	private void print(ShipFactory shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name, email));
	}
}
