package selman.zoo.zoo;

import selman.zoo.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo.");
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void ListAnimals(){
        if (animals.isEmpty()) {
            System.out.println("Zoo is currently empty.");
            return;
        }

        System.out.println("=== Animals in the Zoo ===");
        for (int i = 0; i < animals.size(); i++) {
            Animal a = animals.get(i);
            System.out.println((i + 1) + ". " + a.getName()
                    + " (" + a.getSpecies() + ") - Age: " + a.getAge());
        }
    }

    public int getAnimalCount(){
        return animals.size();
    }

    public Animal getAnimal(int index) {
        if (index >= 0 && index < animals.size()){
            return animals.get(index);
        }
        return null;
    }

    public void removeAnimal(int index) {
        if (index >= 0 && index < animals.size()) {
            Animal removed = animals.remove(index);
            System.out.println(removed.getName() + " has been removed from the zoo.");
        } else {
            System.out.println("Invalid index");
        }
    }
}
