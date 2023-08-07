package org.example.Calc;

import java.util.Scanner;

public class CalcLogic {
    /**
     * sum();      //Метод суммирования чисел
     * multiply(); //Метод умножения чисел
     * diff();     //Метод вычитания чисел
     * divide();   //Метод деления чисел
     */
    private final Scanner scanner;
    double a;
    double b;
    boolean exit;


    public CalcLogic() {
        this.a = 0;
        this.b = 0;
        this.exit = false;
        this.scanner = new Scanner(System.in);
    }

    public void work() {
        choice();
    }

    private void choose() {
        System.out.println("Введите первое число: ");
        a = inputDouble();
        System.out.println("Введите второе число: ");
        b = inputDouble();
    }

    private void choice() {
        while (!exit) {
            System.out.println();
            System.out.println("***Добро пожаловать в калькулятор! Следуй шагам и у тебя все получится!***");
            System.out.println("Выберите операцию: ");
            System.out.println("1. Сложение");
            System.out.println("2. Умножение");
            System.out.println("3. Вычитание");
            System.out.println("4. Деление");
            System.out.println("5. ВЫХОД");


            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    choose();
                    sum();
                }
                case 2 -> {
                    choose();
                    multiply();
                }
                case 3 -> {
                    choose();
                    diff();
                }
                case 4 -> {
                    choose();
                    divide();
                }
                case 5 -> exit = true;
                default -> System.out.println("Неверная команда");
            }
        }
    }

    private void divide() {
        System.out.println(a + " / " + b + " = " + (b != 0 ? (a / b) : ("Нелья делить на ноль!")));
    }

    private void diff() {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    private void multiply() {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    private void sum() {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    private double inputDouble() {
        return new Scanner(System.in).nextDouble();
    }
}
