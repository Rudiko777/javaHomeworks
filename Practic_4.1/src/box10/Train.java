package box10;

public class Train extends Transport{
    public Train(double speed, int countSide, double price) {
        super(speed, countSide, price);
    }

    @Override
    public double cost(){
        return (1000/speed)/countSide + 14;
    }

    @Override
    public String toString() {
        return "Поезд { количество мест = "+ countSide+ ", цена = " + price + " дистанция за 10 часов: " + cost();
    }
}
