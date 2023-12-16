package Cycles;

import java.util.Arrays;
import java.util.Scanner;

public class Cycle_ex10 {
    static Scanner in = new Scanner(System.in);
    
    public static class Matrix {
        public int val[][];

        Matrix(int w, int h) {
            val = new int[h][w];

            for (int i = 0; i < val.length; i++)
                Arrays.fill(val[i], 0);
        }

        public void readVals(Scanner input) {
            if (val.length == 0) return;

            for (int i = 0; i < val.length; i++)
                for (int j = 0; j < val[0].length; j++) {
                    System.out.print("m[" + i + "][" + j + "]:\t");
                    val[i][j] = input.nextInt();
                }
        }

        public void print() {
            if (val.length == 0) return;

            for (int i =0, j = 0; j < val[0].length; j++){
                System.out.print(val[i][j]*3 + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int w = 0, h = 0;

        System.out.print( "Введите ширину матрицы: " );
        w = in.nextInt();
        System.out.print( "Введите высоту матрицы: " );
        h = in.nextInt();
        Matrix m = new Matrix( w, h );

        System.out.println( "Введите значения матрицы:" );
        m.readVals( in );
        m.print();

        System.out.println();
    }
}
