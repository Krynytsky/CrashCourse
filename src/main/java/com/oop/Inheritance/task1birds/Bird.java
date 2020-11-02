package com.oop.Inheritance.task1birds;

import java.util.Objects;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(){

    }

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        Bird bird = (Bird) o;
        return isFeathers() == bird.isFeathers() &&
                isLayEggs() == bird.isLayEggs();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFeathers(), isLayEggs());
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    protected abstract void fly();

}
