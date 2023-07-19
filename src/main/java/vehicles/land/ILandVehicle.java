package vehicles.land;

import vehicles.IVehicle;

public interface ILandVehicle extends IVehicle {
    int getWheelCount();
    void setWheelCount(int count) throws Exception;
}
