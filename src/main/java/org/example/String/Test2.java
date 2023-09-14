package org.example.String;

import org.example.OOP.Phone.Phone;

import java.util.Scanner;

//Напишите программу, которая на входе через консоль принимает фамилию, имя и отчество одной строкой
//(например, «Иванов Сергей Петрович») и выводит фамилию, имя и отчество отдельно в формате:
//Фамилия: Иванов
//Имя: Сергей
//Отчество: Петрович
//Валидная строка от пользователя, которую мы можем интерпретировать как Ф. И. О.,
//должна содержать три слова, состоящих из символов кириллицы, разделённых пробелом,
//может содержать дефисы. Если строка не соответствует формату, то вывести в консоль:
//Введенная строка не является ФИО
public class Test2 {
    private static final String VALID_ABC = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ -";
        public static void main(String[] args) {
            boolean isValid = true;
            int spaceCount = 0;
            System.out.println("Введите Ваше ФИО");
            String input = new Scanner(System.in).nextLine().trim();

            for (int i = 0; i < input.length(); i++) {
                if(!VALID_ABC.contains(String.valueOf(input.charAt(i)))) {
                    isValid = false;
                    break;
                }
                if (input.charAt(i) == ' ') {
                    spaceCount++;
                }
            }

            if(isValid && spaceCount == 2) {
                System.out.println("Фамилия: " + input.substring(0, input.indexOf(" ")).trim());
                System.out.println("Имя: "+ input.substring(input.indexOf(" "), input.lastIndexOf(" ")).trim());
                System.out.println("Отчество: " + input.substring(input.lastIndexOf(" ")).trim());
            } else {
                System.out.println("Введеная строка не является ФИО");
            }
        }
    }

