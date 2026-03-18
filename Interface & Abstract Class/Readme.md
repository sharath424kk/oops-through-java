Real-World Analogy
Interface: Like a USB Port. It doesn't matter if the device is a mouse, keyboard, or flash drive; as long as it follows the "USB contract," it will work.
Abstract Class: Like a Vehicle. All vehicles have an engine and wheels (shared state/code), but a "Vehicle" doesn't exist by itself—it must be specifically a "Car" or "Truck" to be real.
Why combine them in one line?
In real-world coding, we do this to keep the code clean and organized. Instead of creating a separate class for the GPS and a separate class for the Vehicle, we combine them into the Car class because a Car is a Vehicle and has GPS.
How it looks vs. How you might have seen it
You might have thought you had to do this:
Create a Vehicle object.
Create a GPS implementation.
Somehow glue them together.
But Java lets you do it all at once:
// The "Everything-in-One" Class
class Car extends Vehicle implements GPS, Bluetooth, AirConditioning {
    // 1. Implementation for Vehicle (The Identity)
    void drive() { ... }

    // 2. Implementation for GPS (The Skill)
    public void trackLocation() { ... }

    // 3. Implementation for Bluetooth (Another Skill)
    public void connectPhone() { ... }
}
The "Rules" of the Order
When you write this line, Java is very strict about the order:
extends must come first. (You define "What it is" first).
implements must come second. (You define "What it can do" second).
You can only extend one class, but you can implement many interfaces (separated by commas).
Why this is powerful
Imagine you have a Drone class:
class Drone extends Robot implements Flyable, Camera, GPS
By looking at that one line, you immediately know:
It is a Robot (inherits battery logic, movement, etc.).
It can Fly.
It can take Photos.
It can track its Location.
