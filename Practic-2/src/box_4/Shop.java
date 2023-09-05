package box_4;

import java.util.ArrayList;
import java.util.Objects;

public class Shop implements Array{
    ArrayList<Computer> list = new ArrayList<>();
    Shop(){}

    @Override
    public void setCompInArray(String gpu, String cpu, int ram, String motherBoard){
        Computer comp = new Computer(gpu, cpu, ram, motherBoard);
        list.add(comp);
    }

    @Override
    public void removeComputerByIndex(int i){
        list.remove(i);
    }

    @Override
    public Computer searchComputer(String gpu, String cpu, int ram, String motherBoard) {
        for (Computer element: list){
            if(Objects.equals(element.getCpu(), cpu) && Objects.equals(element.getGpu(), gpu) && element.getRam() == ram && Objects.equals(element.getMotherBoard(), motherBoard)){
                return element;
            }
        }
        return null;
    }
}
