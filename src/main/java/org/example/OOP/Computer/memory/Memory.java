package org.example.OOP.Computer.memory;


public class Memory {
    private MemoryTypes memoryTypes;
    private int volume;
    private double weight;

    public Memory(MemoryTypes memoryTypes, int volume, double weight) {
        this.memoryTypes = memoryTypes;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "memoryTypes=" + memoryTypes +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }

    public MemoryTypes getMemoryTypes() {
        return memoryTypes;
    }

    public void setMemoryTypes(MemoryTypes memoryTypes) {
        this.memoryTypes = memoryTypes;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
