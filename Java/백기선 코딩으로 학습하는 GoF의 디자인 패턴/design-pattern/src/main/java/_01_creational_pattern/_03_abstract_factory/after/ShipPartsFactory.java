package _01_creational_pattern._03_abstract_factory.after;

import _01_creational_pattern._03_abstract_factory.before.Anchor;
import _01_creational_pattern._03_abstract_factory.before.Wheel;

public interface ShipPartsFactory {

	Anchor createAnchor();

	Wheel createWheel();

}
