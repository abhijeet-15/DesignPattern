public class ClockDisplay implements IObserver{

    double currentTemperature;
    WeatherStation weatherStation;

    public ClockDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        currentTemperature = weatherStation.getTemperature();
        System.out.println("The current temp in the clock display is " + currentTemperature);

    }
}
