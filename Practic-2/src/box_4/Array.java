package box_4;

public interface Array{
    void setCompInArray(String gpu, String cpu, int ram, String motherBoard);
    void removeComputerByIndex(int i);
    Computer searchComputer(String gpu, String cpu, int ram, String motherBoard);
}
