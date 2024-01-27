package commandPattern;

public class LightOnCommand implements ICommand {

    LightReceiver lightReceiver;

    LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.switchOnTheLight();
    }

    @Override
    public void unExecute() {
        this.lightReceiver.switchOffTheLight();
    }
}
