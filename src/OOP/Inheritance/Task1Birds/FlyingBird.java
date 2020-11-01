package OOP.Inheritance.Task1Birds;

public class FlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println(new StringBuilder().append("Hey, I can fly using my feathers").toString());
        System.out.println("__________________________________________");
    }
}
