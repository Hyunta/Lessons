package _01_creational_pattern.factorymethod.after;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();

		Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "hyunta@naver.com");
		System.out.println(whiteShip);

		Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "hyunta@naver.com");
		System.out.println(blackShip);
	}
}
