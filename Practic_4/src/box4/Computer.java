package box4;

public class Computer {
    private Name name;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    public Computer(Name name, Memory memory, Monitor monitor, Processor processor) {
        this.name = name;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Копьютер {" + name + ", " + memory + ", " + monitor + ", " + processor + '}';
    }
}
