package box_2;

public class Ball{
    private double x = 0.0;
    private double y = 0.0;

    Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    Ball(){};

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setXY(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    public void move(double xDisp, double yDisp){
        this.setXY(xDisp, yDisp);
        System.out.println("Мяч прошёл расстояние " + this.getX() +
        " по оси x и " + this.getY() + " по оси y");
    }

    @Override
    public String toString(){
        return "Ball{" +
                "x=" + x +
                ", y=" + y + '\'' + '}';
    }
}
