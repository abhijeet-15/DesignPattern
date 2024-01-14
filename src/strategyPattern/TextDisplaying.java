package strategyPattern;

public class TextDisplaying implements IDisplayBehaviour {

    @Override
    public void display() {
        System.out.println("This is a text display");
    }
}
