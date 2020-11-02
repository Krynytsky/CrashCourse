package com.oop.Inheritance.task2empoyers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee("15", "Petro", "1254", 14255));
        employees.add(new SalariedEmployee("2", "Yurii", "125478", 9.5, 180));
        employees.add(new SalariedEmployee("3", "Ivan", "127828", 8, 180));

        for (Object e : employees) {
            System.out.println(e);
        }
    }
}
