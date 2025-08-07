package selman.zoo.model;

import selman.zoo.behaviors.movable.Walk;

public class Elephant extends Animal implements Walk {

    private double weight;
    private double trunkLenght;

    public Elephant(int age,double weight, double trunkLenght) {
        super("Elephant", age, "African Elephant");
        this.trunkLenght = trunkLenght;
        this.weight = weight;
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is peaceful but can defend itself with power.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets majestically!");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walks heavily on the ground.");
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getTrunkLenght() {
        return trunkLenght;
    }
    public void setTrunkLenght(double trunkLenght) {
        this.trunkLenght = trunkLenght;
    }
}
