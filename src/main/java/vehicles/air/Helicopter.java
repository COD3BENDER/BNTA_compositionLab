package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle, IMotorised{

    int numberOfBlades;
    String airCraftType;
    IMotorised engine;
    Radar radar;

    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, int numberOfBlades,String airCraftType, IMotorised engine, Radar radar) {
        super(weight, maxSpeed, baseProduct);
        this.numberOfBlades = numberOfBlades;
        this.engine = engine;
        this.radar = radar;
        this.airCraftType = airCraftType;
    }

    public int getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(int numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }

    public IMotorised getEngine() {
        return engine;
    }

    public void setEngine(IMotorised engine) {
        this.engine = engine;
    }

    public Radar getRadar() {
        return radar;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
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
