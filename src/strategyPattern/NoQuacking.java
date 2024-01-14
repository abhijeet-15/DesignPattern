package strategyPattern;

public class NoQuacking implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I do not quack");
    }
}
