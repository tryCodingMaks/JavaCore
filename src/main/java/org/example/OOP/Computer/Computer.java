package org.example.OOP.Computer;

import org.example.OOP.Computer.hard.HardDisc;
import org.example.OOP.Computer.keyboard.Keyboard;
import org.example.OOP.Computer.memory.Memory;
import org.example.OOP.Computer.monitor.Monitor;
import org.example.OOP.Computer.processor.Processors;

public class Computer {
    private Processors processors;
    private HardDisc hardDisc;
    private Keyboard keyboard;
    private Monitor monitor;
    private Memory memory;

    private final String vendor;
    private final String name;

    public Computer(Processors processors, HardDisc hardDisc, Keyboard keyboard, Monitor monitor, Memory memory, String vendor, String name) {
        this.processors = processors;
        this.hardDisc = hardDisc;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.memory = memory;
        this.vendor = vendor;
        this.name = name;
    }

    public double getWeight() {
        return processors.getWeight() + memory.getWeight() + hardDisc.getWeight() + monitor.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processors=" + processors +
                ", hardDisc=" + hardDisc +
                ", keyboard=" + keyboard +
                ", monitor=" + monitor +
                ", memory=" + memory +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Processors getProcessors() {
        return processors;
    }

    public void setProcessors(Processors processors) {
        this.processors = processors;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setRam(Memory memory) {
        this.memory = memory;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }
}
