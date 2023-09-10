package box4;

import java.util.ArrayList;
import java.util.Random;

public class Matrix {
    private double[][] list;
    private int rows;
    private int columns;
    Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.list = new double[rows][columns];
        Random rand = new Random();
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                list[i][j] = rand.nextInt(100);
            }
        }
    }

    public double[][] getList(){
        return list;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void plustMethod(Matrix matrix){
        if (matrix.getColumns()==this.getColumns() && matrix.getRows() == this.getRows()){
            for (int i = 0; i < matrix.rows; i++){
                for (int j = 0; j < matrix.columns; j++){
                    this.getList()[i][j] += matrix.getList()[i][j];
                }
            }
            return;
        }
        System.out.println("Неверные данные для суммирования");
    }
    public void multiplicationByANumber(int number){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                this.getList()[i][j] *= number;
            }
        }
    }

    public void print(){
        for(int i = 0; i < getRows(); i++){
            System.out.print("[ ");
            for(int j = 0; j < getColumns(); j++){
                System.out.print(this.getList()[i][j] + "  ");
            }
            System.out.println("]");
        }
    }
}
