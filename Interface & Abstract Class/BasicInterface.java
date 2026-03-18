interface Animal {
    void makeSound(); // The "What"
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!"); // The "How"
    }
}

public class BasicInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
