package TaskFour;

public class Square implements Shape{

    double width;

    public Square(double width){
    this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
