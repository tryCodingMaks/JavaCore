package org.example.OOP.Personal;

public class Human {

    String fullName;
    String gender;
    int age;

    public Human() {

    }
    public Human (String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Human(String fullName, String gender, int age) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
    }

    public void walk(int stepsCount) {
        System.out.print(fullName + "-> Прошел: "+ stepsCount + " шагов \n");
    }

}
