package com.oop.collections;


import java.util.*;


public class SetColections {
    public static void main(String[] args) {

//        Set<Integer> setInt = new HashSet<>();
//        for (int i = 1; i < 6; i++) {
//            setInt.add(i);
//        }
//
//        Set<Integer> secondSetInt = new HashSet<>();
//        for (int i = 3; i < 7; i++) {
//            secondSetInt.add(i);
//        }

        Set<Student> firstGroup = new HashSet<>();
        firstGroup.add(new Student("Ivan", 22));
        firstGroup.add(new Student("Ivanka", 20));
        firstGroup.add(new Student("Yosup", 45));
        firstGroup.add(new Student("Pulu", 20));

        Set<Student> secondGroup = new HashSet<>();
        secondGroup.add(new Student("Ivan", 20));
        secondGroup.add(new Student("Pulu", 20));
        secondGroup.add(new Student("Drogba", 45));


//        unionSet(setInt, secondSetInt);
        System.out.println("Union1:");
        unionSet(firstGroup,secondGroup);
        System.out.println("=============");

//        System.out.println("Union2:");
//        unionSet(firstGroup,secondGroup);
//        System.out.println("=============");
//        System.out.println("Intersection1");
//        intersectSet(secondGroup,firstGroup);
//        System.out.println("=============");

        System.out.println("Intersection2");
        intersectSet(firstGroup,secondGroup);
        System.out.println("=============");


    }

    static void unionSet(Set<Student> set1, Set<Student> set2) {
        set1.addAll(set2);
        set1.stream().map(s -> s + " ").forEach(System.out::println);
    }
    static  void intersectSet(Set<Student> set1,Set<Student> set2) {
        boolean b = set1.retainAll(set2);
        System.out.println(b);
        for (Student s : set1) {
            String s1 = s + "";
            System.out.println(s1);
        }

    }
}