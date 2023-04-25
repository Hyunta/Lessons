package _01_creational_pattern._03_abstract_factory.after;

import _01_creational_pattern._02_factorymethod.after.DefaultShipFactory;
import _01_creational_pattern._02_factorymethod.after.Ship;
import _01_creational_pattern._02_factorymethod.after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
