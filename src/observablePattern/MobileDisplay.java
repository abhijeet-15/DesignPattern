package observablePattern;

public class MobileDisplay implements IObserver {

    WeatherStation weatherStation;
    double currentTemperature;

    public MobileDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        currentTemperature = weatherStation.getTemperature();
        System.out.println("Current temp in Mobile device is " + currentTemperature);
    }
}
