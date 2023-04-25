package _01_creational_pattern._03_abstract_factory.after;

import _01_creational_pattern._03_abstract_factory.before.Anchor;
import _01_creational_pattern._03_abstract_factory.before.Wheel;

public class WhitePartsProFactory implements ShipPartsFactory{
	@Override
	public Anchor createAnchor() {
		return new WhiteAnchorPro();
	}

	@Override
	public Wheel createWheel() {
		return new WhiteWheelPro();
	}
}
