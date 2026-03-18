interface Animal {
    void makeSound(); // Abstract by default
    
    default void sleep() { 
        System.out.println("This animal is sleeping..."); 
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

public class BasicInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
}
