package TaskFour;

public class Main {

    public static void main(String[] args){
        Circle circle = new Circle(5);
        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(circle.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);
        System.out.println(shapeBuilder.getTotalArea());
    }
}
