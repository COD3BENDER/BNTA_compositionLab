package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Plane extends Vehicle implements IAirVehicle, IMotorised {

    String takeOffType;
    String airCraftType;
    IMotorised engine;
    Radar radar;


    public Plane(

            float weight,
            int maxSpeed,
            IProduct baseProduct,
            String takeOffType,
            String airCraftType,
            IMotorised engine,
            Radar radar
            ) {

        super(weight, maxSpeed, baseProduct);
        this.takeOffType = takeOffType;
        this.airCraftType = airCraftType;
        this.engine = engine;
        this.radar = radar;
    }

    public String getTakeOffType() {
        return this.takeOffType;
    }

    public void setTakeOffType(String takeOffType) {
        this.takeOffType = takeOffType;
    }


    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }

    @Override
    public String getAircraftType() {
        return this.airCraftType;
    }

    @Override
    public void setAircraftType(String aircraftType) {
        this.airCraftType = aircraftType;

    }
}
