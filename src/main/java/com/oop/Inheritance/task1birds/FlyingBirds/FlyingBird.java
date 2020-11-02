package com.oop.Inheritance.task1birds.FlyingBirds;

import com.oop.Inheritance.task1birds.Bird;

public class FlyingBird extends Bird {
    @Override
    protected void fly() {
        System.out.println(new StringBuilder().append("Hey, I can fly using my feathers").toString());
        System.out.println("__________________________________________");
    }
}
