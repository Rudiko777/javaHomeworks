package box4;

public class Monitor {
    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "монитор: " + name;
    }
}
