package org.example.OOP.Animal;

public class Animal {
     String name;
     String color;
     double age;

    public Animal(String name, String color, double age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " -> ";
//        return "Duck{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", age=" + age +
//                '}';
    }
}


