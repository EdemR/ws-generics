package animal;

import animal.flying.Bird;
import animal.flying.Flying;

import java.util.List;

public class UncleBen {
    public void feedBirds(List<Flying> flyingList) {
        flyingList.stream().filter(e -> e instanceof Bird).forEach(e -> ((Bird) e).feed());
    }
}
