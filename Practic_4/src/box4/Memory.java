package box4;

public class Memory {
    private String name;
    private int size;

    public Memory(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "память: " + name + ", размер  памяти: " + size + "ГБ";
    }
}
