import decortatorPattern.*;
import factoryPattern.Shape;
import factoryPattern.ShapeFactory;
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

        //observer Pattern
        weatherStation.add(mObserver);
        weatherStation.add(cObserver);


        //call notify
        weatherStation.notifyObservers();

        //strategy pattern
        Duck duck = new Duck(new JetFlying(), new SimpleQuacking(), new GraphicallyDisplaying());
        duck.setFlyBehaviour();
        duck.setQuackBehaviour();
        duck.setDisplayBehaviour();

        //Decorator Pattern
        BasePizza basePizza = new MushroomDecorator(new PannerDecorator(new FarmHouse()));
        System.out.println("Thank you for your order, your order amount is " + basePizza.cost());

        //FactoryMethod
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Square");
        shape.draw();

    }
}
