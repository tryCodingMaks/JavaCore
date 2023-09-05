package org.example.OOP.Delivery;

public class Delivery {
    public void calculateDeliveryPrice (DeliveryTypes type) {
        System.out.println(type.getValue());
    }
}
/*      Рефактор данного кода
        if (type == DeliveryTypes.STEP) {
            System.out.println("Пешая доставка стоит 100р.");
        } else if (type = DeliveryTypes.AUTO) {
            System.out.println("Авто доставка стоит 200р.");
        } else if (type = DeliveryTypes.WATER) {
            System.out.println("Водная доставка стоит 500р.");
        } else if (type = DeliveryTypes.AERO) {
            System.out.println("Авиа доставка стоит 1000р.");
        } else {
            System.out.println("Неверный тип данных");
        }*/