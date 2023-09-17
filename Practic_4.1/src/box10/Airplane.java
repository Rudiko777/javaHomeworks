package box10;

public class Airplane extends Transport{
    public Airplane(double speed, int countSide, double price){
        super(speed, countSide, price);
    }

    @Override
    public double cost(){
        return (1000/speed)/countSide + 10;
    }

    @Override
    public String toString() {
        return "Самолёт { количество мест = "+ countSide+ ", цена = " + price + " расходы: " + cost();
    }
}
