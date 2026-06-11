package com.example;

class Person {
    private String name;
    private int age;

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
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Initial Person's name: " + person.getName() + ", Initial Person's age: " + person.getAge());

        person.setName("Bob");
        person.setAge(27);

        System.out.println("Updated Person's name: " + person.getName() + ", Updated Person's age: " + person.getAge());
    }
}