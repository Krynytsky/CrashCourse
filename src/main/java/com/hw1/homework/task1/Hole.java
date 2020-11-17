package com.hw1.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Hole {
    private final int sideX;
    private final int sideY;

    public Hole(int sideX, int sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
    }

    public int getSideX() {
        return sideX;
    }


    public int getSideY() {
        return sideY;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hole)) return false;
        Hole hole = (Hole) o;
        return sideX == hole.sideX &&
                sideY == hole.sideY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideX, sideY);
    }

    @Override
    public String toString() {
        return "Hole:" +
                "sideX=" + sideX +
                ", sideY=" + sideY;
    }

    public static Hole inputHoleSize() {
        System.out.println("Now you could enter values of the Hole size");
        BufferedReader valX = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of x: ");
        int sideX = 0;
        try {
            sideX = Integer.parseInt(valX.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader valY = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of y: ");
        int sideY = 0;
        try {
            sideY = Integer.parseInt(valY.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Hole(sideX, sideY);
    }
}
