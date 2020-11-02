package com.oop.Inheritance.task1birds.NonFlyingBirds;

import com.oop.Inheritance.task1birds.Bird;

public class NonFlyingBird extends Bird {
    @Override
    protected void fly() {
        System.out.println("Hey, i'm type of the bird that can't fly;(");
        System.out.println("__________________________________________");
    }
}
