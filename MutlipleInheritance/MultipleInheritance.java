abstract class Vehicle {
    abstract void fuelType();
}

interface GPS {
    void trackLocation();
}

// Achieving Multiple Inheritance
class SmartCar extends Vehicle implements GPS {
    @Override
    void fuelType() {
        System.out.println("This car runs on Electricity.");
    }

    @Override
    public void trackLocation() {
        System.out.println("GPS: Tracking car at 5th Avenue...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartCar tesla = new SmartCar();
        tesla.fuelType();
        tesla.trackLocation();
    }
}
