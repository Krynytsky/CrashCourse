package OOP.Inheritance.Task1Birds;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Chicken(), new Eagle(), new Penguin(), new Swallow()};
        for (Bird br : birds) {
            br.fly();
        }

    }
}
