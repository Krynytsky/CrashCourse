package com.hw1.homework.task1;

/*
 * Даны вещественные положительные числа a, b, c, x, y.
 * Выяснить пройдет ли кирпич с ребрами a, b, c в прямоугольное отверстие
 * со сторонами x и y . Просовывать кирпич в отверстие разрешается только так,
 * чтобы каждое из его ребер было параллельно или перпендикулярно каждой из
 * сторон отверстия.
 * v 5.11
 *
 * @Author: Yurii Krynytskyi
 */
public class Checker {
    public static void main(String[] args) {

        Brick brick = Brick.inputBrickSides();
        Hole hole = Hole.inputHoleSize();
        check(brick, hole);


    }


    static void check(Brick brick, Hole hole) {
        if ((brick.getSideA() < hole.getSideX())
                && (brick.getSideC() < hole.getSideY())
                ||
                (brick.getSideA() < hole.getSideY()
                        && brick.getSideA() < hole.getSideX())) {
            System.out.println("====================");
            System.out.println("The brick with sides\n" +
                    "a = " + brick.getSideA()
                    + " " +
                    "b = " + brick.getSideB()
                    + " " +
                    "c = " + brick.getSideC()
                    + " \ncan go through the hole with x = "
                    + hole.getSideX()
                    + " and y = " + hole.getSideY() + " sides!");
        } else {
            System.out.println("The brick is bigger than hole(");
        }
    }
}




