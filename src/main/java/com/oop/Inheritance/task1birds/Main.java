package com.oop.Inheritance.task1birds;

import com.oop.Inheritance.task1birds.FlyingBirds.Eagle;
import com.oop.Inheritance.task1birds.FlyingBirds.Swallow;
import com.oop.Inheritance.task1birds.NonFlyingBirds.Penguin;
import com.oop.Inheritance.task1birds.NonFlyingBirds.Chicken;

public class Main {
    public static void main(String[] args) {
     Bird[] birds = {new Chicken(), new Eagle(), new Penguin(), new Swallow()};
        for (Bird br : birds) {
            br.fly();
        }

    }
}
