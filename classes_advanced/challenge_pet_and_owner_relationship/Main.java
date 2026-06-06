package com.example;

public class Main {
    public static void main(String[] args) {
        Pet garfield = new Pet("Garfield");
        Pet ben = new Pet("Ben");
        Owner bob = new Owner("bob", garfield);
        Owner alice = new Owner("alice", ben);
        System.out.println(bob);
        System.out.println(alice);
    }
}

class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" + "name='" + name + '\'' + '}';
    }
}

class Owner {
    String name;
    Pet pet;

    public Owner(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Owner{" + "name='" + name + '\'' + ", pet=" + pet + '}';
    }
}