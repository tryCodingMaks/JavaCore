package org.example.OOP.Phone;

public class Phone {
    static String madeCountry;

    String number;
    double weight;
    String model;

    public Phone() {
    }

    public Phone(String number, double weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }
    public void receiveCall(String nameCall) {
        receiveCall(nameCall,"");
    }
    public void receiveCall(String nameCall, String numberCall) {
        System.out.println("Звонит абонент по имени " + "\""+
                nameCall+"\"" + " номер телефона: " + (numberCall == "" ? "" : " номер телефона: " + numberCall));
    }

}
