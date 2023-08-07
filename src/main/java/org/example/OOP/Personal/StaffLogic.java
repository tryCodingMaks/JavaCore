package org.example.OOP.Personal;

public class StaffLogic {
    public static void start() {
        Human sasha = new Human("Александр Родионович Бородач ", "Мужчинка ", 21);
        System.out.println("Имя: " + sasha.fullName + "Пол: " + sasha.gender + "Возраст: " + sasha.age);

        Human petya = new Human("Петя Петрович Пупков ", "Мужик ", 44);
        System.out.println("Имя: " + petya.fullName + "Пол: " + petya.gender + "Возраст: " + petya.age);

        Human nikolay = new Human("Николай Николаевич Васильев ", "Вроде как мужик ", 31);
        System.out.println("Имя: " + nikolay.fullName + "Пол: " + nikolay.gender + "Возраст: " + nikolay.age + "\n");

        sasha.walk(14);
        petya.walk(25);
        nikolay.walk(123);
    }
}
