package org.example.OOP.Delivery;

public enum DeliveryTypes {
    STEP("Пешая доставка стоит - 100р."),
    AUTO("Авто доставка стоит - 200р."),
    WATER("Водная доставка стоит - 500р."),
    AERO("Авиа доставка стоит - 1000р.");
    private String value;

    DeliveryTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
