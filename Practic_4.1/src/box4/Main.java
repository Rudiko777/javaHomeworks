package box4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(5, 5);
        Matrix matrix1 = new Matrix(5, 5);
        matrix.print();
        matrix.multiplicationByANumber(2);
        System.out.println();
        matrix.print();
        matrix1.plustMethod(matrix);
        System.out.println();
        matrix1.print();
    }
}
