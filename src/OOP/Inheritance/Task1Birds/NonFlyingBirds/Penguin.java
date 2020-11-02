package OOP.Inheritance.Task1Birds.NonFlyingBirds;

public class Penguin extends NonFlyingBird {
    @Override
    protected void fly() {
        super.fly();
        System.out.println("Oh,man...Who am I?..Maybe penguin");
    }
}
