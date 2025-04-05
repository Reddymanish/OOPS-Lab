public class Encap4 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.setSpeed(120);
        System.out.println("Car: " + car.getBrand() + " " + car.getModel() + ", Speed: " + car.getSpeed());
    }
}

class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0; // Default speed
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be between 0 and 200.");
        }
    }
}