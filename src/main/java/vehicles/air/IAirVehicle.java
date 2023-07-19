package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {
    String getAircraftType();
    void setAircraftType(String aircraftType);
}
