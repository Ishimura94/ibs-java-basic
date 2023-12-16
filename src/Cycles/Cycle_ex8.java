package Cycles;

import java.util.Scanner;

public class Cycle_ex8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
