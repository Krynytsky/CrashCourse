package com.oop.Inheritance.task1birds.NonFlyingBirds;

public class Chicken extends NonFlyingBird  {
    @Override
    protected void fly() {
        System.out.println("~~I'm a chicken~~");
    }
}
