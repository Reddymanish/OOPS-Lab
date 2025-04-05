class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}


interface ElectricVehicle {
    void chargeBattery();
}


interface FuelVehicle {
    void refuel();
}


class Tesla extends Vehicle implements ElectricVehicle {
    public void chargeBattery() {
        System.out.println("Tesla is charging its battery.");
    }

    void autopilot() {
        System.out.println("Tesla is in autopilot mode.");
    }
}


class Ford extends Vehicle implements FuelVehicle {
    public void refuel() {
        System.out.println("Ford is refueling with gasoline.");
    }

    void manualDrive() {
        System.out.println("Ford is being driven manually.");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.start();         // Inherited from Vehicle
        myTesla.chargeBattery(); // Implemented from ElectricVehicle
        myTesla.autopilot();     // Specific to Tesla

        System.out.println("-----------------");

        Ford myFord = new Ford();
        myFord.start();   // Inherited from Vehicle
        myFord.refuel();  // Implemented from FuelVehicle
        myFord.manualDrive();  // Specific to Ford
    }
}