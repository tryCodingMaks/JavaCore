package org.example.OOP.Cars;

public class Main {
    public static void main(String[] args) {
        Body body = new Body("Седан");
        Wheels wheels = new Wheels(18.0);
        Engine engine = new Engine("BMW", 4.4);

        Car car1 = new Car(engine, body, wheels);
        System.out.println("Первая машина " + car1);
    }
}
