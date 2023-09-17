package box_4;

public class Tester {
    public static void main(String[] args) {
        Shop hyperX = new Shop();
        hyperX.setCompInArray("1600 super", "i5", 16, "matka");
        Computer comp = hyperX.searchComputer("i5", "1600 super", 16, "matka");
        hyperX.removeComputerByIndex(0);
    }
}
