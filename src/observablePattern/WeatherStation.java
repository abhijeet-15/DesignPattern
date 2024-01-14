package observablePattern;

import java.util.ArrayList;

public class WeatherStation implements IObservable {

    double temperature;
    ArrayList<IObserver> observers = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers) {
            observer.update();
        }
    }

    public double getTemperature() {
        return this.temperature;
    }
}
