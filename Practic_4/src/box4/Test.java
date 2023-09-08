package box4;

public class Test {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("Msi");
        Monitor monitor2 = new Monitor("Aoc");

        Processor processor1 = new Processor("i5");
        Processor processor2 = new Processor("i7");

        Memory memory1 = new Memory("HyperX", 16);
        Memory memory2 = new Memory("Asus", 8);

        System.out.println(new Computer(Name.Honor, memory1, monitor2, processor1));
        System.out.println(new Computer(Name.Lenovo, memory2, monitor1, processor2));
    }
}
