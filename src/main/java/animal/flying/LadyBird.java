package animal.flying;

import animal.Animal;
import animal.Feed;

public class LadyBird extends Animal implements Flying, Feed {
    private String name;
    private boolean isFemale;

    public LadyBird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    @Override
    public void fly() {
        speak("Buzz, Buzz");
    }

    @Override
    public void feed() {
        speak("I love aphid");
    }
}
