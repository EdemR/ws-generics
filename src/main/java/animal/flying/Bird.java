package animal.flying;

import animal.Animal;
import animal.Feed;

public class Bird extends Animal implements Flying {
    private String name;
    private boolean isFemale;

    public Bird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    @Override
    public void fly() {
        speak("Csájp, Csájp");
    }

    @Override
    public void feed() {
        speak("What a wonderful worm");
    }
}