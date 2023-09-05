package org.example.OOP.Computer.keyboard;

public class Keyboard {
    private KeyboardType keyboardType;
    private Illuminate illuminate;
    private double weight;

    public Keyboard(KeyboardType keyboardType, Illuminate illuminate, double weight) {
        this.keyboardType = keyboardType;
        this.illuminate = illuminate;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardType=" + keyboardType +
                ", illuminate=" + illuminate +
                ", weight=" + weight +
                '}';
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }

    public Illuminate getIlluminate() {
        return illuminate;
    }

    public void setIlluminate(Illuminate illuminate) {
        this.illuminate = illuminate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
