package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) throws IOException {
        /**
         * Даны вещественные положительные числа a, b, c, x, y.
         * Выяснить пройдет ли кирпич с ребрами a, b, c в прямоугольное отверстие
         * со сторонами x и y . Просовывать кирпич в отверстие разрешается только так,
         * чтобы каждое из его ребер было параллельно или перпендикулярно каждой из
         * сторон отверстия.
         */
        int a, b, c, x, y;
        // Create InputStreamReader foEach Variable
        BufferedReader valA = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of a: ");
        a = Integer.parseInt(valA.readLine());

        BufferedReader valB = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of b: ");
        b = Integer.parseInt(valB.readLine());

        BufferedReader valC = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of c: ");
        c = Integer.parseInt(valC.readLine());

        BufferedReader valX = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of x: ");
        x = Integer.parseInt(valX.readLine());

        BufferedReader valY = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of y: ");
        y = Integer.parseInt(valY.readLine());

        if ((a < x & c < y) || (a < y & b < x)) {
            System.out.println("The brick can probably go through the hole");
        } else {
            System.out.println("The brick is bigger than hole(");
        }

    }
}
