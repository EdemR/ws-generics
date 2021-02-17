package animal.wildanimal;

import animal.Animal;

import java.util.List;

public class WildAnimal extends Animal {

    public WildAnimal() {
        WildAnimalCounter.wildAnimals.add(this);
    }

    @Override
    public void feed() {
    }
}
