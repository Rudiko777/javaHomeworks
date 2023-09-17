package box_4;

public class Computer {
    private String gpu;
    private String cpu;
    private int ram;
    private String motherBoard;

    Computer(String gpu, String cpu, int ram, String motherBoard){
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
        this.motherBoard = motherBoard;
    }

    public String getGpu() {
        return gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getMotherBoard() {
        return motherBoard;
    }
}
