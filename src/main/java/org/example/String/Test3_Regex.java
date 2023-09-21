package org.example.String;
//https://regex101.com/
public class Test3_Regex {
    public static void main(String[] args) {
        String prices = "Молоко: 89р, Масло: 120р, Печенье: 60р";

        int price1 = Integer.parseInt(prices.substring(prices.indexOf(":") + 1, prices.indexOf("р,")).trim());
        int price2 = Integer.parseInt(prices.substring(prices.indexOf(":", prices.indexOf("р, ")) + 1, prices.lastIndexOf("р,")).trim());
        int price3 = Integer.parseInt(prices.substring(prices.lastIndexOf(":") + 1, prices.lastIndexOf("р")).trim());

        System.out.println(price1);
        System.out.println(price2);
        System.out.println(price3);
        System.out.println(price1 + price2 + price3);


    }
}
