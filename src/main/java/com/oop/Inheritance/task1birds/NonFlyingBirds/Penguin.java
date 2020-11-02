package com.oop.Inheritance.task1birds.NonFlyingBirds;

public class Penguin extends NonFlyingBird {
    @Override
    protected void fly() {
        super.fly();
        System.out.println("Oh,man...Who am I?..Maybe penguin\n " +
                "//right, I'm a penguine\\\\");
        System.out.println();
    }
}
