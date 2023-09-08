package box1;

public class Square extends Share{
    private double a;

    public Square(String type, int a) {
        super("Квадрат");
        this.a = a;
    }

    public double getP(){
        return 4*a;
    }

    public double getS(){
        return Math.pow(a,2);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nПериметр = " + getP() +
                "\nПлощадь = " + getS();
    }
}
