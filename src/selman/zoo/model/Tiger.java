package selman.zoo.model;

import selman.zoo.behaviors.movable.Walk;

public class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private double speed;
    private int roarVolume;

    public Tiger(int age,int numberOfStripes, double speed, int roarVolume) {
        super("Tiger", age, "Panthera tigris");
        this.numberOfStripes = numberOfStripes;
        this.roarVolume = roarVolume;
        this.speed = speed;
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is stalking and hunting silently...");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars at " + roarVolume + " decibels!");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking with a speed of " + speed + " km/h");
    }

    @Override
    public void move() {
        walk();
    }

    // Getter & Setter
    public int getNumberOfStripes() {
        return numberOfStripes;
    }
    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getRoarVolume() {
        return roarVolume;
    }
    public void setRoarVolume(int roarVolume) {
        this.roarVolume = roarVolume;
    }
}
