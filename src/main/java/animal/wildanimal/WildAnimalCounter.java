package animal.wildanimal;

import java.util.ArrayList;
import java.util.List;

public class WildAnimalCounter {
    static List<WildAnimal> wildAnimals = new ArrayList<>();
    
    public int numberOfWildAnimals() {
        return wildAnimals.size();
    }
}
