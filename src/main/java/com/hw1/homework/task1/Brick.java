package com.hw1.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Brick {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Brick(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;

    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }


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

    public static Brick inputBrickSides() {
        BufferedReader valA = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of a: ");
        int sideA = 0;
        try {
            sideA = Integer.parseInt(valA.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader valB = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of B: ");
        int sideB = 0;
        try {
            sideB = Integer.parseInt(valB.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader valC = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of c: ");
        int sideC = 0;
        try {
            sideC = Integer.parseInt(valC.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Brick(sideA, sideB, sideC);
    }

}

