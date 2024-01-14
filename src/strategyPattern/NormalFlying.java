package strategyPattern;

public class NormalFlying implements IFlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Normal flying");
    }
}
