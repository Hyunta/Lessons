package _01_creational_pattern._03_abstract_factory.after;

import _01_creational_pattern._03_abstract_factory.before.Anchor;
import _01_creational_pattern._03_abstract_factory.before.Wheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {

	@Override
	public Anchor createAnchor() {
		return new WhiteAnchor();
	}

	@Override
	public Wheel createWheel() {
		return new WhiteWheel();
	}
}
