package selman.zoo.model;

import selman.zoo.behaviors.movable.Swim;
import selman.zoo.behaviors.movable.Walk;

public class Penguin extends Animal implements Swim, Walk {
    private double swimSpeed;
    private double walkSpeed;

    public Penguin(String name, int age, double swimSpeed, double walkSpeed) {
        super(name, age, "Emperor Penguin"); // species fixed
        this.swimSpeed = swimSpeed;
        this.walkSpeed = walkSpeed;
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts fish under the ice.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squawks.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims at " + swimSpeed + " km/h.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " waddles at " + walkSpeed + " km/h.");
    }


    public double getSwimSpeed() {
        return swimSpeed;
    }
    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }


    public double getWalkSpeed() {
        return walkSpeed;
    }
    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }
}
