package OOP.Inheritance.Task1Birds.FlyingBirds;

import OOP.Inheritance.Task1Birds.Bird;

public class FlyingBird extends Bird {
    @Override
    protected void fly() {
        System.out.println(new StringBuilder().append("Hey, I can fly using my feathers").toString());
        System.out.println("__________________________________________");
    }
}
