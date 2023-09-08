package box1;

public class Rectangle extends Share{
    private double a;
    private double b;

    public Rectangle(String type, int a, int b) {
        super("Прямоугольник");
        this.a = a;
        this.b = b;
    }

    public double getP(){
        return 2*(a+b);
    }

    public double getS(){
        return a*b;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nПериметр = " + getP() +
                "\nПлощадь = " + getS();
    }
}
