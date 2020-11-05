package com.hw1.homework.task1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.hw1.homework.task1.Checker.check;

public class CheckerTest {

    private Hole hole;
    private Brick brick;
    private Hole anotherHole;
    private Brick anotherBrick;

    @BeforeClass
    public void createObject() {
        hole = new Hole(11, 11);
        brick = new Brick(2, 2, 2);
        anotherHole = new Hole(1, 1);
        anotherBrick = new Brick(2, 2, 2);
    }

    @Test
    public void checkTheBrickGoThroughTheHole() {
        check(brick,hole);
    }

    @Test
    public void checkTheBrickCantGoThroughTheHole() {
        check(anotherBrick,anotherHole);
    }
}