package commandPattern;

public class LightReceiver {

    boolean isLightOn;

    public void switchOnTheLight() {
        this.isLightOn = true;
        System.out.println("Turning the lights on...");
    }

    public void switchOffTheLight(){
        this.isLightOn = false;
        System.out.println("Turning the lights off...");
    }

}
