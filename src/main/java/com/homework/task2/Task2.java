package com.homework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) throws IOException {

        int number;
        String sqrNumberToString = " ";
        // Create InputStreamReader foEach number variable
        BufferedReader valueOfNumber = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("Enter the value of n: ");
        number = Integer.parseInt(valueOfNumber.readLine());
        String numberToString = String.valueOf(number);
        System.out.println("n is: " + number);

        char[] chars = numberToString.toCharArray();
        System.out.println("Before Swaping 1st and last element :"
                + Arrays.toString(chars));
        for(int i = 0; i<chars.length;i++ ) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] =  temp;
            System.out.println("ieofjeioj"+ chars[i] );
        }


        powNumber(number);
        checkIfContainsThree(sqrNumberToString);
        reverseIntNumber(number);
        replace(numberToString);
//        int[] arr = new int[4];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        System.out.println(Arrays.toString(arr));
//        int length = arr.length - 1;
//        System.out.println("Array length = " + length);
//        for (int i = 0; i <= length; i++) {
//            System.out.print(arr[i] + " ");
//            System.out.println(" ");
//            int last = arr[length] - i;
//            arr[0] = last;
//            System.out.print(Arrays.toString(arr));
//
//        }

    }

    public static void reverseIntNumber(int number){
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

    public static void powNumber(int number) {
        int powNumber = number * number;
        System.out.println("n^2 is: " + powNumber);
    }

    public static void checkIfContainsThree(String sqrNumberToString) {
        if (sqrNumberToString.contains("3")) {
            System.out.println("the number we had squared has 3");
        } else {
            System.out.println("the number we had squared hasn't 3");
        }
    }

    public static void replace(String numberToString) {
        char[] chars = numberToString.toCharArray();
        System.out.println("Before Swaping 1st and last element :"
                + Arrays.toString(chars));
        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;
        System.out.println("After Swaping 1st and last element :"
                + Arrays.toString(chars));
    }

}
