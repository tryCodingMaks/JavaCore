package org.example.String;

public class Test1 {

        //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
        // А-123
        // Б-321...
        // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
        public static void main(String[] args) {
            String text = " абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i) + " = " + (int) text.charAt(i));
            }
        }
    }
