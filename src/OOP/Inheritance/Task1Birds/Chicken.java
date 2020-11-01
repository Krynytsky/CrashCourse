package OOP.Inheritance.Task1Birds;

public class Chicken extends NonFlyingBird  {
    @Override
    void fly() {
        super.fly();
        System.out.println("I'm just a chicken");
        System.out.println("++++++++++++++++++");
    }
}
