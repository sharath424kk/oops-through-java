abstract class Vehicle {
    abstract void fuel();
}

interface GPS {
    void track();
}

// Combining Identity (extends) and Skill (implements)
class SmartCar extends Vehicle implements GPS {
    @Override
    void fuel() { System.out.println("Runs on Electric Battery."); }

    @Override
    public void track() { System.out.println("Tracking via Satellite..."); }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartCar car = new SmartCar();
        car.fuel();
        car.track();
    }
}
