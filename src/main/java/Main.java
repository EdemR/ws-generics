import animal.flying.Bird;
import animal.flying.Flying;
import animal.flying.LadyBird;
import animal.UncleBen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flying> flyingList = new ArrayList<>();

        Bird birdMale = new Bird("maleBird", false);
        Bird birdFemale = new Bird("femaleBird", true);
        LadyBird ladyBirdMale = new LadyBird("maleLadyBird", false);
        LadyBird ladyBirdFemale = new LadyBird("femaleLadyBird", true);

        flyingList.add(birdMale);
        flyingList.add(birdFemale);
        flyingList.add(new Bird("anotherMale", false));
        flyingList.add(ladyBirdMale);
        flyingList.add(ladyBirdFemale);
        flyingList.add(new LadyBird("anotherFemale", true));

        birdMale.feed();
        birdFemale.feed();
        ladyBirdMale.feed();
        ladyBirdFemale.feed();
        birdMale.fly();
        birdFemale.fly();
        ladyBirdMale.fly();
        ladyBirdFemale.fly();

        UncleBen uncleBen = new UncleBen();
        uncleBen.feedBirds(flyingList);
    }
}
