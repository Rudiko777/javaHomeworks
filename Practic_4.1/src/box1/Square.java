package box1;

public class Square extends Shape {
    private double a;

    public Square(String type, int a) {
        super(type);
        this.a = a;
    }

    public double getP(){
        return 4*a;
    }

    public double getS(){
        return Math.pow(a,2);
    }

    @Override
    public String getType(){
        return this.getType();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nПериметр = " + getP() +
                "\nПлощадь = " + getS();
    }
}
