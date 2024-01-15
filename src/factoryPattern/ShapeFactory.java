package factoryPattern;

public class ShapeFactory implements Factory{

    @Override
    public Shape getShape(String input) {
        return switch (input) {
            case "Rectangle" -> new RectangleShape();
            case "Square" -> new SquareShape();
            case "Rhombus" -> new RhombusShape();
            default -> null;
        };
    }
}
