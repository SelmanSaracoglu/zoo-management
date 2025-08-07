package selman.zoo.model;

import selman.zoo.behaviors.movable.Fly;
import selman.zoo.behaviors.movable.Walk;

public class Eagle extends Animal implements Fly, Walk {

    private double wingspan;
    private double flightSpeed;
    private int visionRange;

    public Eagle(String name, int age, double wingspan, double flightSpeed, int visionRange){
        super(name, age, "Eagle");
        this.wingspan = wingspan;
        this.flightSpeed = flightSpeed;
        this.visionRange = visionRange;
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is diving from the sky to catch its prey!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " screeches loudly!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flaying at " + flightSpeed + " km/h.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking on its claws.");
    }


    public double getWingspan() {
        return wingspan;
    }
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }


    public double getFlightSpeed() {
        return flightSpeed;
    }
    public void setFlightSpeed(double flightSpeed) {
        this.flightSpeed = flightSpeed;
    }


    public int getVisionRange() {
        return visionRange;
    }
    public void setVisionRange(int visionRange) {
        this.visionRange = visionRange;
    }
}
