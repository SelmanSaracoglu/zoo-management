package selman.zoo.model;

import selman.zoo.behaviors.Trainable;
import selman.zoo.behaviors.movable.Swim;

public class Dolphin extends Animal implements Swim, Trainable {


    private int intelligenceLevel;  // 1–10 arası
    private double swimSpeed;       // km/h
    private int clickVolume;        // decibel

    public Dolphin(int age, int intelligenceLevel, double swimSpeed, int clickVolume){
        super("Dolphin", age, "Delphinidea");
        this.intelligenceLevel = intelligenceLevel;
        this.swimSpeed = swimSpeed;
        this.clickVolume = clickVolume;
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is catching fish with sonar precision.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is clicking at " + clickVolume + " decibels.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming at " + swimSpeed + " km/h.");
    }

    @Override
    public void move() {
        swim();
    }

    @Override
    public void respondToCommand(String command) {
        System.out.println(getName() + " respond to '" + command + "' command with excitement! ");
    }
}
