package _01_creational_pattern._02_factorymethod.after;

public class BlackShipFactory extends DefaultShipFactory {

	@Override
	public Ship createShip() {
		return new BlackShip();
	}
}
