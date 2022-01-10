package _01_creational_pattern._03_abstract_factory.after;

import _01_creational_pattern._02_factorymethod.after.Ship;
import _01_creational_pattern._02_factorymethod.after.ShipFactory;

public class ShipInventory {
	public static void main(String[] args) {
		ShipFactory shipFactory = new WhiteshipFactory(new WhiteShipPartsFactory());
		Ship ship = shipFactory.createShip();
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());
	}
}
