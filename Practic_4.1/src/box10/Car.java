package box10;

public class Car extends Transport{
    public Car(double speed, int countSide, double price) {
        super(speed, countSide, price);
    }

    @Override
    public double cost(){
        return (1000/speed)/countSide + 76;
    }

    @Override
    public String toString() {
        return "Машина { количество мест = "+ countSide+ ", цена = " + price + " дистанция за 10 часов: " + cost();
    }
}
