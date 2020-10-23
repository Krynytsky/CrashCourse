package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) throws IOException {

        int number;
        // Create InputStreamReader foEach number variable
        BufferedReader valueOfNumber = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of n: ");
        number = Integer.parseInt(valueOfNumber.readLine());
        String numberToString = String.valueOf(number);
        System.out.println("n is: " +number);

        int powNumber = (int) Math.pow(number,2);
        String sqrNumberToString = String.valueOf(powNumber);
        System.out.println("n^2 is: " + powNumber);

        if (sqrNumberToString.contains("3")) {
            System.out.println("the number we had squared has 3");
        } else {
            System.out.println("the number we had squared hasn't 3");
        }
        //todo end task 88



    }
}
