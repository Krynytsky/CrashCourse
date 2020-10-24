package com.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Brick {
    private int sideA ;
    private int sideB ;
    private int sideC ;

    public Brick() {
    }

    public Brick(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;

    }

    public void setSideA() throws IOException {
        BufferedReader valA = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of a: ");
        this.sideA =Integer.parseInt(valA.readLine());
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB() throws IOException {
        BufferedReader valB = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of B: ");
        this.sideB =Integer.parseInt(valB.readLine());    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC() throws IOException {
        BufferedReader valC = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of c: ");
        this.sideC =Integer.parseInt(valC.readLine());    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Brick)) return false;
        Brick brick = (Brick) o;
        return sideA == brick.sideA &&
                sideB == brick.sideB &&
                sideC == brick.sideC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    @Override
    public String toString() {
        return "Brick:" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC;
    }
}
