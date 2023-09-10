package box1;

public class Circle extends Shape {
    private double r;

    public Circle(int r, String type) {
        super(type);
        this.r = r;
    }

    public double getP(){
        return 2*Math.PI*r;
    }

    public double getS(){
        return Math.PI*(Math.pow(r,2));
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
