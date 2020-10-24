package com.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Hole {
    private int sideX;
    private int sideY;

    public Hole() {
    }

    public Hole(int sideX, int sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
    }

    public int getSideX() {
        return sideX;
    }

    public void setSideX() throws IOException {
        BufferedReader valX = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of x: ");
        this.sideX = Integer.parseInt(valX.readLine());
    }

    public int getSideY() {
        return sideY;
    }

    public void setSideY() throws IOException {
        BufferedReader valY = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of y: ");
        this.sideY = Integer.parseInt(valY.readLine());
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
}
