package OOP.Inheritance.Task1Birds.NonFlyingBirds;

public class Chicken extends NonFlyingBird  {
    @Override
    protected void fly() {
        System.out.println("~~I'm a chicken~~");
    }
}
