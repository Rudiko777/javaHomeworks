package box4;

public class Processor {
    private String name;

    public Processor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "процессор: " + name;
    }
}
