package _01_creational_pattern.factorymethod.after;

public class WhiteShipFactory implements ShipFactory{

	@Override
	public Ship createShip() {
		return new WhiteShip();
	}
}
