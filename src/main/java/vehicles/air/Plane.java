package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Plane extends Vehicle implements IAirVehicle, IMotorised {

    String takeOffType;
    String airCraftType;
    IMotorised engine;
    Radar radar;
    private int fuel;


    public Plane(float weight, int maxSpeed, IProduct baseProduct, String takeOffType, String airCraftType, IMotorised engine, Radar radar, int fuel) {
        super(weight, maxSpeed, baseProduct);
        this.takeOffType = takeOffType;
        this.airCraftType = airCraftType;
        this.engine = engine;
        this.radar = radar;
        this.fuel = fuel;
    }

    public String getTakeOffType() {
        return this.takeOffType;
    }

    public void setTakeOffType(String takeOffType) {
        this.takeOffType = takeOffType;
    }


    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
    this.hp = hp
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String getAircraftType() {
        return this.airCraftType;
    }

    @Override
    public void setAircraftType(String aircraftType) {
        this. = aircraftType;

    }
}
