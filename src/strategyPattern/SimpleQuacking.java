package strategyPattern;

public class SimpleQuacking implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I quack simply");
    }
}
