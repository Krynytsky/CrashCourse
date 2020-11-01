package OOP.Inheritance.Task1Birds;

public class NonFlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println("Hey, i'm type of the bird that can't fly;(");
        System.out.println("__________________________________________");
    }
}
