package org.example;

import java.util.Scanner;
public class Main {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        sum();

        int[] array = {2, 4, 6, 8, 10};
        int result = processArray(array);
        System.out.println("Результат: " + result);
    }
    public static void sum() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Сумма: "+ sum);
    }

        public static int processArray(int[] data) {
            int sum = 0;
            for (int num : data) {
                sum += num;
            }
            return sum;
        }
    }
