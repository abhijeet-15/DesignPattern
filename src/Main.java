import decortatorPattern.*;
import observablePattern.ClockDisplay;
import observablePattern.IObserver;
import observablePattern.MobileDisplay;
import observablePattern.WeatherStation;
import strategyPattern.Duck;
import strategyPattern.GraphicallyDisplaying;
import strategyPattern.JetFlying;
import strategyPattern.SimpleQuacking;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        IObserver mObserver = new MobileDisplay(weatherStation);
        IObserver cObserver = new ClockDisplay(weatherStation);

        //add the observer
        weatherStation.add(mObserver);
        weatherStation.add(cObserver);


        //call notify
        weatherStation.notifyObservers();

        Duck duck = new Duck(new JetFlying(), new SimpleQuacking(), new GraphicallyDisplaying());
        duck.setFlyBehaviour();
        duck.setQuackBehaviour();
        duck.setDisplayBehaviour();

        //Pizza time
        BasePizza basePizza = new MushroomDecorator(new PannerDecorator(new FarmHouse()));
        System.out.println("Thank you for your order, your order amount is " + basePizza.cost());

    }
}
