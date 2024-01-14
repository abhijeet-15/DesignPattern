package strategyPattern;

public class Duck {

    IFlyBehaviour iFlyBehaviour;
    IQuackBehaviour iQuackBehaviour;
    IDisplayBehaviour iDisplayBehaviour;

    public Duck(IFlyBehaviour iFlyBehaviour, IQuackBehaviour iQuackBehaviour, IDisplayBehaviour iDisplayBehaviour) {
        this.iFlyBehaviour = iFlyBehaviour;
        this.iQuackBehaviour = iQuackBehaviour;
        this.iDisplayBehaviour = iDisplayBehaviour;
    }

    public void setFlyBehaviour() {
        this.iFlyBehaviour.fly();
    }

    public void setQuackBehaviour() {
        this.iQuackBehaviour.quack();
    }

    public void setDisplayBehaviour() {
        this.iDisplayBehaviour.display();
    }

}
