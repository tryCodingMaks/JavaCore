package org.example.String;

import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHARS =" абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static void main(String[] args) {
        /*
        1. Ввод только русские, маленькие буквы
        2. Не больше 2 слов.
        3. Возвращать 2 слово.
         */
        String input = new Scanner(System.in).nextLine().trim();
        boolean isValid = true;
        int spaceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                spaceCount++;
            }
            if (!CORRECT_CHARS.contains(String.valueOf(input.charAt(i)))){
                isValid = false;
                break;
            }
        }

        if (isValid && spaceCount == 1) {
            System.out.println(input.substring(input.indexOf(' ')).trim());
        } else {
            System.out.println("Ввод некорректен!");
        }
    }
}
