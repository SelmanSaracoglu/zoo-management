package selman.zoo.model;

import selman.zoo.behaviors.Eatable;
import selman.zoo.behaviors.Vocalize;
import selman.zoo.behaviors.movable.Movable;


// Basic eating behavior interface.

public abstract class Animal implements Eatable, Vocalize, Movable {

    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }

    @Override
    public abstract void hunt();

    @Override
    public abstract void makeSound();

    // Getter & Setter metotları
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getSpecies() {return species;}

    public void setName(String name)
        {this.name = name;}
    public void setAge(int age)
        {this.age = age;}
    public void setSpecies(String species)
        {this.species = species;}
}
