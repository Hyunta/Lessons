package _01_creational_pattern.factorymethod.after;

public class BlackShipFactory implements ShipFactory {

	@Override
	public Ship createShip() {
		return new BlackShip();
	}
}
