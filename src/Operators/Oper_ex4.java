package Operators;

import java.util.Scanner;

public class Oper_ex4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter X: ");
        double x = in.nextDouble();

        System.out.print("Enter Y: ");
        double y = in.nextDouble();

        System.out.print("Enter Z: ");
        double z = in.nextDouble();

        double mid = (x+y+z)/3;
        System.out.println(mid);

        double halfmid = mid/2;
        System.out.println(halfmid);

        double result = Math.floor(halfmid);
        System.out.println(result);

        String progEnd = (result > 3) ? "Программа выполнена корректно" : "На этот случай текста не было, но пусть будет, что программа выполнена некорректно" ;
        System.out.println(progEnd);
    }
}
