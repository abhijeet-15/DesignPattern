public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        IObserver mObserver = new MobileDisplay(weatherStation);
        IObserver cObserver = new ClockDisplay(weatherStation);

        //add the observer
        weatherStation.add(mObserver);
        weatherStation.add(cObserver);


        //call notify
        weatherStation.temperature = 12.0;
        weatherStation.notifyObservers();
    }
}
