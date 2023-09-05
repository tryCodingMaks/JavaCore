package org.example.OOP.Computer.processor;


import org.example.OOP.Computer.processor.CoreCount;
import org.example.OOP.Computer.processor.Creator;
import org.example.OOP.Computer.processor.Frequency;

public class Processors {
    private Frequency frequency;
    private CoreCount coreCount;
    private Creator creator;
    private double weight;

    public Processors(Frequency frequency, CoreCount coreCount, Creator creator, double weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.creator = creator;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processors{" +
                "frequency=" + frequency +
                ", coreCount=" + coreCount +
                ", creator=" + creator +
                ", weight=" + weight +
                '}';
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

