package animal;

public abstract class Animal implements Feed{

    public void speak(String text) {
        System.out.println(text);
    }
}
