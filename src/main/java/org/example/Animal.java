package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for isDog
    public boolean isDog() {
        return isDog;
    }

    // toString method
    @Override
    public String toString() {
        return "Animal{name='" + name + "', isDog=" + isDog + "}";
    }
}
