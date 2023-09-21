package org.example.String;

import java.util.Scanner;

//https://regex101.com/
public class Test3_Regex {
    public  static final String REGEX= "([А-я]+\\s+){2}([А-я]+)";

    public static void main(String[] args) {
        String test = new Scanner(System.in).nextLine();

        if(test.matches(REGEX)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }




//        String prices = "Молоко: 89р, Масло: 120р, Печенье: 60р";
//        prices = prices.replaceAll("\\D+", " ").trim();
//        String[] split = prices.split("\\s");
//        int sum = 0;
//        for (String e: split) {
//            sum =+ Integer.parseInt(e);
//        }
//        System.out.println(sum);




        //todo replaceAll System.out.println(prices.replaceAll("\\d","*"));
        // \\s - все пробелы
        // \\d - все цифры на что-то "*" если \\d+ (то число из нескольких символов заменится 1 звездочкой)
        // \\w - все англ слова + цифры на что-то "*"
        // антипаттерны
        // \\S - все кроме пробелов
        // \\D - все кроме цифр
        // \\W - все кроме слов+цифр(только англ)
        // шаблон перечисления
        // [] - все РУ буквы System.out.println(prices.replaceAll("[А-я]","*"));
        // [А-я] - все РУ буквы System.out.println(prices.replaceAll("[А-яё:,;]","*"));
        // кванторы
        // * - System.out.println(prices.replaceAll("[А-я]*","*")); сколько раз входит в диапазон
        // + - System.out.println(prices.replaceAll("[А-я]+","*")); одно или более вхождений
        // ? - System.out.println(prices.replaceAll("[А-я]?","*")); 0 или одно вхождение(меняет каждую букву отдельно)
        // []{} - System.out.println(prices.replaceAll("[А-я]{3}","*")); РОВНО {количество символов} замени на "что-то тут"
//КВАНТОР (*) = **:* *8*9**,* **:* *1*2*0**,* **:* *6*0**
//КВАНТОР (+) = *: 89*, *: 120*, *: 60*
//КВАНТОР (?) = *: *******:* *8*9**,* ******:* *1*2*0**,* ********:* *6*0**
//КВАНТОР []({3, 5}) = *о: 89р, *: 120р, *ье: 60р, *ад: 30р



        //todo просто с примитивами
//        int price1 = Integer.parseInt(prices.substring(prices.indexOf(":") + 1, prices.indexOf("р,")).trim());
//        int price2 = Integer.parseInt(prices.substring(prices.indexOf(":", prices.indexOf("р, ")) + 1, prices.lastIndexOf("р,")).trim());
//        int price3 = Integer.parseInt(prices.substring(prices.lastIndexOf(":") + 1, prices.lastIndexOf("р")).trim());
//
//        System.out.println(price1);
//        System.out.println(price2);
//        System.out.println(price3);
//        System.out.println(price1 + price2 + price3);


    }
}
