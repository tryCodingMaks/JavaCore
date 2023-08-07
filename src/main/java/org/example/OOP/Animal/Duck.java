package org.example.OOP.Animal;


public class Duck {
    Animal duck1 = new Animal("Желтуха ", "Желтый ", 2);
    Animal duck2 = new Animal("Чернуха ", "Черная ", 3);
    Animal duck3 = new Animal("Краснуха ", "Красная ", 5);
    private int duck;


    public void fly() {
        System.out.println("Первая утка: " + duck1.name + "научилась летать когда ей стало: 1 год и 5 месяцев" + " \nСейчас ей: " + duck1.age + " года " + "\nЕё цвет: " + duck1.color);
        System.out.println("Вторая Утка: " + duck2.name + " научилась летать когда ей стало: 1 год и 2 месяца" + " \nСейчас ей: " + duck2.age + " года " + "\nЕё цвет: " + duck2.color + "\n");
    }
}

