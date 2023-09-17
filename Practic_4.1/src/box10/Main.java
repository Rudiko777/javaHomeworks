package box10;

public class Main {
    public static void main(String[] args) {
        Transport[] tran = new Transport[]{
                new Train(80, 400, 4113),
                new Ship(50, 300, 41341),
                new Airplane(240, 100, 897861),
                new Car(120, 5, 6741624)
        };

        for(Transport el: tran){
            System.out.println(el);
        }
    }
}
