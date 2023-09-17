package box10;

public class Ship extends Transport{
    public Ship(double speed, int countSide, double price) {
        super(speed, countSide, price);
    }

    @Override
    public double cost(){
        return (1000/speed)/countSide + 105;
    }

    @Override
    public String toString() {
        return "Корабль { количество мест = "+ countSide+ ", цена = " + price + " дистанция за 10 часов: " + cost();
    }
}