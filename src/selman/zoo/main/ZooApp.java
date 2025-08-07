package selman.zoo.main;

import selman.zoo.model.*;
import selman.zoo.zoo.Zoo;

import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        boolean running = true;

        while (running) {
            System.out.println("==== Zoo Management ====");
            System.out.println("1. Yeni hayvan ekle");
            System.out.println("2. Hayvanları listele");
            System.out.println("3. Hayvanı sil");
            System.out.println("4. Hayvanı detaylı görüntüle");
            System.out.println("5. Toplam hayvan sayısını göster");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Hangi hayvanı eklemek istiyorsunuz?");
                    System.out.println("1. Tiger");
                    System.out.println("2. Dolphin");
                    System.out.println("3. Penguin");
                    System.out.println("4. Eagle");
                    System.out.println("5. Elephant");
                    System.out.print("Seçiminiz: ");

                    int animalChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (animalChoice) {
                        case 1: {
                            System.out.print("Tiger name: ");
                            String tigerName = scanner.nextLine();

                            System.out.print("Age: ");
                            int tigerAge = scanner.nextInt();

                            System.out.print("Number of stripes: ");
                            int numberOfStripes = scanner.nextInt();

                            System.out.print("Speed (km/h): ");
                            double speed = scanner.nextDouble();

                            System.out.print("Roar volume (dB): ");
                            int roarVolume = scanner.nextInt();
                            scanner.nextLine(); // dummy read

                            Tiger tiger = new Tiger(tigerName, tigerAge, numberOfStripes, speed, roarVolume);
                            zoo.addAnimal(tiger);
                            break;
                        }
                        case 2: {
                            System.out.print("Dolphin name: ");
                            String dolphinName = scanner.nextLine();

                            System.out.print("Age: ");
                            int dolphinAge = scanner.nextInt();

                            System.out.print("Swim speed (km/h): ");
                            double swimSpeed = scanner.nextDouble();

                            System.out.print("Intelligence level (1–100): ");
                            int intelligenceLevel = scanner.nextInt();
                            scanner.nextLine(); // dummy read

                            System.out.print("Click volume (dB): ");
                            int clickVolume = scanner.nextInt();
                            scanner.nextLine();

                            Dolphin dolphin = new Dolphin(dolphinName, dolphinAge, intelligenceLevel, swimSpeed, clickVolume);
                            zoo.addAnimal(dolphin);
                            break;
                        }
                        case 3: {
                            System.out.print("Penguin name: ");
                            String name = scanner.nextLine();

                            System.out.print("Age: ");
                            int age = scanner.nextInt();

                            System.out.print("Swim speed (km/h): ");
                            double swimSpeed = scanner.nextDouble();

                            System.out.print("Walk speed (km/h): ");
                            double walkSpeed = scanner.nextDouble();
                            scanner.nextLine(); // dummy read

                            Penguin penguin = new Penguin(name, age, swimSpeed, walkSpeed);
                            zoo.addAnimal(penguin);
                            break;
                        }
                        case 4: {
                            System.out.print("Eagle name: ");
                            String name = scanner.nextLine();

                            System.out.print("Age: ");
                            int age = scanner.nextInt();

                            System.out.print("Wingspan (meters): ");
                            double wingspan = scanner.nextDouble();

                            System.out.print("Flight speed (km/h): ");
                            double flightSpeed = scanner.nextDouble();

                            System.out.print("Vision range (meters): ");
                            int visionRange = scanner.nextInt();
                            scanner.nextLine(); // dummy read

                            Eagle eagle = new Eagle(name, age, wingspan, flightSpeed, visionRange);
                            zoo.addAnimal(eagle);
                            break;
                        }
                        case 5: {
                            System.out.print("Age: ");
                            int age = scanner.nextInt();

                            System.out.print("Weight (tons): ");
                            double weight = scanner.nextDouble();

                            System.out.print("Trunk length (meters): ");
                            double trunkLength = scanner.nextDouble();
                            scanner.nextLine(); // dummy read

                            Elephant elephant = new Elephant(age, weight, trunkLength);
                            zoo.addAnimal(elephant);
                            break;
                        }
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 2:
                    zoo.ListAnimals();
                    break;
                case 3:
                    System.out.println("Çıkılıyor...");
                    running = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
            System.out.println();
        }
        scanner.close();
    }

}
