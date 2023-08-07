package org.example.OOP.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+79990001234", 123.2,"iPhone");
        phone.receiveCall("Петр", "+79152345543");
        Phone phone1 = new Phone("+71234442211", 101.2,"Nokia");

        Phone.madeCountry = "China";

        System.out.println(phone.madeCountry);
        System.out.println(phone1.madeCountry);
    }
}
