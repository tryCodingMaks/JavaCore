package org.example.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.move(5, 10);
        robot.move(10, 15);

        System.out.println(robot.getX() + " " + robot.getY());
    }
}
