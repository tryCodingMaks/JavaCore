package org.example.Robot;

public class Robot {
    private int x;
    private int y;

    public void move(int x, int y) {
        this.x = print(this.x, x, "x");
        this.y = print(this.y, y, "y");
    }

    private int print(int start, int end, String axisName) {
        while (start < end) {
            System.out.println("Двигаемся по оси " + axisName + " от " + start + " до " + (++start));
        }
        return start;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
