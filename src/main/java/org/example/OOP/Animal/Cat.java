package org.example.OOP.Animal;

public class Cat {
    Animal cat1 = new Animal("Бася ", "Разноцветная ", 9);
    Animal cat2 = new Animal("Богиня ", "Рыжая ", 5);
    public void info() {
        System.out.println("Первая кошка: " + cat2.name + "Научилась охотиться на мышей в возрасте 2 лет");
        System.out.println("Вторая кошка: " + cat1.name + "Очень много кушает");
    }
}
