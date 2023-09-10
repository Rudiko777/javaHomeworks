package box8;

public class Circle extends Shape{
    private double r;

    public Circle(){};

    public Circle(double color){
        this.r = r;
    }

    public Circle(double r, String color, boolean filled){
        super(color, filled);
        this.r = r;
    }

    @Override
    public double getArea(){
        return Math.PI * (Math.pow(r, 2));
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString(){
        return super.toString() +
                " тип - круг, " +
                " периметр - " + getPerimeter() +
                " площадь - " + getArea();
    }
}
