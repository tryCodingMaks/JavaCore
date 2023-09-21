package org.example.Regex;

import java.util.Scanner;

public class Test2 {
    private static final String REGEX = "((([А-я]+)|([А-я-]+))\\s){2}(([А-я]+)|([А-я-]+))";
    private static final int NAME = 1;
    private static final int LASTNAME = 0;
    private static final int SECONDNAME = 2;
    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        String fio = new Scanner(System.in).nextLine();

        if (fio.matches(REGEX)) {
            String[] split = fio.split("\\s+");
            System.out.println("Фамилия: "+ split[LASTNAME]);
            System.out.println("Имя: "+ split[NAME]);
            System.out.println("Отечество: "+ split[SECONDNAME]);
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}
