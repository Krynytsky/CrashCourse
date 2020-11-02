package OOP.Inheritance.Task1Birds;

import OOP.Inheritance.Task1Birds.FlyingBirds.Eagle;
import OOP.Inheritance.Task1Birds.FlyingBirds.Swallow;
import OOP.Inheritance.Task1Birds.NonFlyingBirds.Chicken;
import OOP.Inheritance.Task1Birds.NonFlyingBirds.Penguin;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Chicken(), new Eagle(), new Penguin(), new Swallow()};
        for (Bird br : birds) {
            br.fly();
        }

    }
}
