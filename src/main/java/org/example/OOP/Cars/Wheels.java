package org.example.OOP.Cars;

public class Wheels {
    private double wheelInches;

    public Wheels(double wheelInches) {
        this.wheelInches = wheelInches;
    }

    public double getWheelInches() {
        return wheelInches;
    }

    public void setWheelInches(double wheelInches) {
        this.wheelInches = wheelInches;
    }

    @Override
    public String toString() {
        return "Колеса{" +
                "Размер колес = " + wheelInches +
                '}';
    }
}
