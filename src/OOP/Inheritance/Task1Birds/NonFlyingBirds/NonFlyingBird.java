package OOP.Inheritance.Task1Birds.NonFlyingBirds;

import OOP.Inheritance.Task1Birds.Bird;

public class NonFlyingBird extends Bird {
    @Override
    protected void fly() {
        System.out.println("Hey, i'm type of the bird that can't fly;(");
        System.out.println("__________________________________________");
    }
}
