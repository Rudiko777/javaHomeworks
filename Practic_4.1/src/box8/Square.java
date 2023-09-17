package box8;

public class Square extends Rectangle{
    public Square(){};
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width = side;
        lenght = side;
    }

    @Override
    public  double getPerimeter(){
        return 2 * (width + lenght);
    }

    @Override
    public  double getArea(){
        return width * lenght;
    }

    @Override
    public String toString(){
        return super.toString() +
                " подтип - квадрат, " +
                " периметр - " + getPerimeter() +
                " площадь - " + getArea();
    }
}
