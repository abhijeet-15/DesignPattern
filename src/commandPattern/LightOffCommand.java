package commandPattern;

public class LightOffCommand implements ICommand{

    LightReceiver lightReceiver;

    LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.switchOffTheLight();
    }

    @Override
    public void unExecute() {
        this.lightReceiver.switchOnTheLight();
    }
}
