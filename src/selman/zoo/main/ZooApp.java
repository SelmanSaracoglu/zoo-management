package selman.zoo.main;

import selman.zoo.model.Dolphin;
import selman.zoo.model.Tiger;

public class ZooApp {
    public static void main(String[] args) {
        Tiger tiger1 =new Tiger(
                5,     // age
                80,         // numberOfStripes
                40.0,       // speed in km/h
                95          // roarVolume in decibels
        );
        // Davranışları test et
        System.out.println("Tiger behaviors:");
        tiger1.eat();
        tiger1.hunt();
        tiger1.makeSound();
        tiger1.walk();
        tiger1.move();

        Dolphin dolphin1 = new Dolphin(1,9, 25.5, 60);
        System.out.println(" Dolphin behaviors");
        dolphin1.eat();
        dolphin1.hunt();
        dolphin1.makeSound();
        dolphin1.swim();
        dolphin1.move();
        dolphin1.respondToCommand("Jump");

    }
}
