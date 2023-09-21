package org.example.Regex;

import java.util.Scanner;

public class Test3 {
    private static final String NUM_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String NUM_FORMAT = "+7 ($2) $3 $4-$5";
    private static final String SHORT_NUM_FORMAT = "+7 ($1) $2 $3-$4";

    public static void main(String[] args) {
        while (true) {
            String number = new Scanner(System.in).nextLine();
            number = number.replaceAll("\\D+", "");

            if (number.length() == 11) {
                number = number.replaceAll("(\\d)" + NUM_REGEX, NUM_FORMAT);
                System.out.println(number);
            } else if (number.length() == 10) {
                number = number.replaceAll(NUM_REGEX, SHORT_NUM_FORMAT);
                System.out.println(number);
            } else {
                System.out.println("Некорректный номер");
            }
            //89991232233
            //9991232211
            //+7 (999) 123 22-33
        }
    }
}
