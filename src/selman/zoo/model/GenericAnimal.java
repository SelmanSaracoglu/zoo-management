package selman.zoo.model;

public class GenericAnimal extends Animal {
    public GenericAnimal(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting...");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a sound.");
    }
}
