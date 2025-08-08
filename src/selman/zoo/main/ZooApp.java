package selman.zoo.main;

import selman.zoo.model.*;
import selman.zoo.zoo.Zoo;

import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        boolean running = true;

        System.out.print("Enter your role (manager/user): ");
        String role = scanner.nextLine();
        boolean isManager = role.equalsIgnoreCase("manager");

        while (running) {
            System.out.println("==== Zoo Management ====");
            System.out.println("1. Add new animal");
            System.out.println("2. List animals");
            System.out.println("3. Remove animal");
            System.out.println("4. View animal details");
            System.out.println("5. Show total animal count");
            if (isManager){
                System.out.println("6. Add new animal type ");
                System.out.println("7. Exit");
            }
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    boolean addingAnimals = true;
                    while (addingAnimals) {
                        System.out.println("Which animal do you want to add?");
                        System.out.println("1. Tiger");
                        System.out.println("2. Dolphin");
                        System.out.println("3. Penguin");
                        System.out.println("4. Eagle");
                        System.out.println("5. Elephant");
                        System.out.print("Your choice: ");
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
                            case 6: {
                                if (isManager) {
                                    System.out.println("Enter new animal type name: ");
                                    String typeName = scanner.nextLine();

                                    System.out.println("Enter species: ");
                                    String species = scanner.nextLine();

                                    System.out.println("Enter Age: ");
                                    int age =  scanner.nextInt();
                                    scanner.nextLine();

                                    Animal generic = new GenericAnimal(typeName, age, species);
                                    zoo.addAnimal(generic);

                                    System.out.println(typeName + " has been added as a new animal type.");
                                }else {
                                    System.out.println("You do not have permission to add new animal types.");
                                }
                                break;
                            }
                            default:
                                System.out.println("Invalid choice");
                        }
                        System.out.println("Do you want to add another animal? (y/n): ");
                        String addMore = scanner.nextLine();
                        if (!addMore.equalsIgnoreCase("y"))
                            addingAnimals = false;
                        break;
                    }
                case 2: {
                    zoo.ListAnimals();
                    break;
                }
                case 3: {
                    zoo.ListAnimals();

                    if (zoo.getAnimalCount() == 0) {
                        break;
                    }

                    System.out.print("Enter the number of the animal to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    zoo.removeAnimal(index - 1);
                    break;
                }
                case 4: {
                    zoo.ListAnimals();

                    if (zoo.getAnimalCount() == 0) {
                        break;
                    }

                    System.out.println("Enter the number of the animal to view: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    Animal animal = zoo.getAnimal(index - 1);
                    if (animal != null) {
                        System.out.println("=== Animal Details ===");
                        System.out.println("Name: " + animal.getName());
                        System.out.println("Species: " + animal.getSpecies());
                        System.out.println("Age: " + animal.getAge());

                        if (animal instanceof Tiger) {
                            Tiger t = (Tiger) animal;
                            System.out.println("Number of stripes: " + t.getNumberOfStripes());
                            System.out.println("Speed: " + t.getSpeed() + " km/h");
                            System.out.println("Roar volume: " + t.getRoarVolume() + " dB");
                        } else if (animal instanceof Dolphin) {
                            Dolphin d = (Dolphin) animal;
                            System.out.println("Intelligence level: " + d.getIntelligenceLevel());
                            System.out.println("Swim speed: " + d.getSwimSpeed() + " km/h");
                            System.out.println("Click volume: " + d.getClickVolume() + " dB");
                        } else if (animal instanceof Penguin) {
                            Penguin p = (Penguin) animal;
                            System.out.println("Swim speed: " + p.getSwimSpeed() + " km/h");
                            System.out.println("Walk speed: " + p.getWalkSpeed() + " km/h");
                        } else if (animal instanceof Eagle) {
                            Eagle e = (Eagle) animal;
                            System.out.println("Wingspan: " + e.getWingspan() + " m");
                            System.out.println("Flight speed: " + e.getFlightSpeed() + " km/h");
                            System.out.println("Vision range: " + e.getVisionRange() + " m");
                        } else if (animal instanceof Elephant) {
                            Elephant el = (Elephant) animal;
                            System.out.println("Weight: " + el.getWeight() + " tons");
                            System.out.println("Trunk length: " + el.getTrunkLenght() + " m");
                        }
                    } else {
                        System.out.println("Invalid animal number.");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Total animals in the zoo: " + zoo.getAnimalCount());
                    break;
                }
                case 6:
                    System.out.println("Exit");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            if (running) {
                System.out.print("Do you want to return to main menu? (y/n): ");
                String continueChoice = scanner.nextLine();
                if (!continueChoice.equalsIgnoreCase("y")) {
                    running = false;
                }
            }
        }
        System.out.println("Exit");
        scanner.close();
    }
}
