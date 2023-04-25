package _01_creational_pattern._03_abstract_factory.before;

import _01_creational_pattern._02_factorymethod.after.DefaultShipFactory;
import _01_creational_pattern._02_factorymethod.after.Ship;
import _01_creational_pattern._02_factorymethod.after.WhiteShip;
import _01_creational_pattern._03_abstract_factory.after.WhiteAnchor;
import _01_creational_pattern._03_abstract_factory.after.WhiteWheel;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
