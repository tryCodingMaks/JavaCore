package org.example.OOP.Computer;

import org.example.OOP.Computer.hard.HardDisc;
import org.example.OOP.Computer.hard.HardDiscType;
import org.example.OOP.Computer.keyboard.Illuminate;
import org.example.OOP.Computer.keyboard.Keyboard;
import org.example.OOP.Computer.keyboard.KeyboardType;
import org.example.OOP.Computer.memory.Memory;
import org.example.OOP.Computer.memory.MemoryTypes;
import org.example.OOP.Computer.monitor.Monitor;
import org.example.OOP.Computer.monitor.MonitorType;
import org.example.OOP.Computer.processor.CoreCount;
import org.example.OOP.Computer.processor.Creator;
import org.example.OOP.Computer.processor.Frequency;
import org.example.OOP.Computer.processor.Processors;

public class Main {
    public static void main(String[] args) {
        Processors processors = new Processors(Frequency.TWO_THOUSAND, CoreCount.FOUR, Creator.AMD, 500);
        Memory memory = new Memory(MemoryTypes.DDR3, 500, 500);
        HardDisc hardDisc = new HardDisc(HardDiscType.SSD, 500, 500);
        Monitor monitor = new Monitor(17.3, MonitorType.OLED, 1500);
        Keyboard keyboard = new Keyboard(KeyboardType.WIRELESS, Illuminate.YES, 500);

        Computer computer = new Computer(processors, hardDisc,keyboard, monitor, memory, "INTEL", "INSPRION");
        System.out.println(computer.getWeight());

    }
}
