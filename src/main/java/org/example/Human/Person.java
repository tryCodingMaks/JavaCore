package org.example.Human;

public class Person {
    private String name;
    private int age;
    private String post;
    private String placeOfWork;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, String post, String placeOfWork, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.placeOfWork = placeOfWork;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
