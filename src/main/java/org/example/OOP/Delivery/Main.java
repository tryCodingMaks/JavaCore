package org.example.OOP.Delivery;

public class Main {
    public static void main(String[] args) {
    Delivery delivery = new Delivery();
    delivery.calculateDeliveryPrice(DeliveryTypes.STEP);
    delivery.calculateDeliveryPrice(DeliveryTypes.AUTO);
    delivery.calculateDeliveryPrice(DeliveryTypes.WATER);
    delivery.calculateDeliveryPrice(DeliveryTypes.AERO);
    }
}
