package commandPattern;

public class Main {

    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        RemoteControllerInvoker remote = new RemoteControllerInvoker();
        remote.setCommand(new LightOffCommand(lightReceiver));
        remote.pressButton();

        for(int i=1; i<=100000000; i++) {
            remote.undo();
        }
    }
}
