package box8;

public class Rectangle extends Shape{
    protected double width;
    protected double lenght;

    public Rectangle(){};
    public Rectangle(double width, double lenght){
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getPerimeter(){
        return (width + lenght) * 2;
    }

    @Override
    public double getArea(){
        return width * lenght;
    }

    @Override
    public String toString(){
        return super.toString() +
                " тип - прямоугольник, ";
    }
}
