package com.homework.task1;

import java.io.IOException;

public class Checker {
    public static void main(String[] args) throws IOException {
        /**
         * Даны вещественные положительные числа a, b, c, x, y.
         * Выяснить пройдет ли кирпич с ребрами a, b, c в прямоугольное отверстие
         * со сторонами x и y . Просовывать кирпич в отверстие разрешается только так,
         * чтобы каждое из его ребер было параллельно или перпендикулярно каждой из
         * сторон отверстия.
         */
        Brick brick = new Brick();
        Hole hole = new Hole();
        brick.setSideA();
        brick.setSideB();
        brick.setSideC();
        hole.setSideX();
        hole.setSideY();

        if ((brick.getSideA() < hole.getSideX()) && (brick.getSideC() < hole.getSideY()) ||
                (brick.getSideA() < hole.getSideY() && brick.getSideA() < hole.getSideX())) {
            System.out.println("The brick with sides\n" + "a = " + brick.getSideA()
                    + " " + "b = " + brick.getSideB() + " " + "c = " + brick.getSideC()
                    + " \ncan go through the hole with x = " + hole.getSideX()
                    + " and y = " + hole.getSideY() + " sides!");
        } else {
            System.out.println("The brick is bigger than hole(");
        }


    }
}




