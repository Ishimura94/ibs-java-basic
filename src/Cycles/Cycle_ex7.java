package Cycles;

import java.util.Scanner;

public class Cycle_ex7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 16;
        int y = 32;
        int z = 64;
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        int [] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
            if (array[i] == x | array[i] == y | array[i] == z ) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
