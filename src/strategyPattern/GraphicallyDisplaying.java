package strategyPattern;

public class GraphicallyDisplaying implements IDisplayBehaviour {

    @Override
    public void display() {
        System.out.println("This is a graphic display");
    }
}
