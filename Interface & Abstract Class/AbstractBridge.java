interface LivingBeing {
    void breathe();
}

// Abstract class passes the breathe() requirement to its children
abstract class LandAnimal implements LivingBeing {
    void hasLegs() { System.out.println("I walk on land."); }
}

class Lion extends LandAnimal {
    @Override
    public void breathe() {
        System.out.println("Breathing through lungs...");
    }
}

public class AbstractBridge {
    public static void main(String[] args) {
        Lion simba = new Lion();
        simba.hasLegs();
        simba.breathe();
    }
}
