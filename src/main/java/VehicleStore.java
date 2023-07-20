import products.Product;
import vehicles.*;
import vehicles.air.Plane;
import vehicles.air.Radar;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.water.Motor;
import vehicles.water.SpeedBoat;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<IVehicle> vehicles;

    public static void main(String[] args) {
        vehicles = new ArrayList<>();
        // create a bike using composition, and call methods from its components
        Bicycle bike1 = new Bicycle(10, 20, new Product("BMX", 350, 6));
        vehicles.add(bike1);

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());

        // create a car using composition, and call methods from its multiple components
        Car car1 = new Car(200, 120, new Product("2015 Dacia Duster", 10000, 3),
        new Engine(100, 150));
        vehicles.add(car1);

        car1.startEngine();
        System.out.println(car1.getFuel());
        System.out.println(car1.getPrice());

        // lab tests (water vehicle related)...
        SpeedBoat speedBoat = new SpeedBoat(100,200,
                new Product("Boat",200,2), "sp",
                new Motor(500,150));
        
        vehicles.add(speedBoat);
        System.out.println(speedBoat.getTitle());
        System.out.println(speedBoat.getFuel());
        System.out.println(speedBoat.getPrice());

        Plane plane = new Plane(100,300,
                new Product("787",364,87),
                "Runway",
                "Widebody",
                new Engine(475,900),
                new Radar(true));
        
        vehicles.add(plane);
        System.out.println(plane.getTitle());
        System.out.println(plane.getHp());
        System.out.println(plane.getAircraftType());

    }
}
