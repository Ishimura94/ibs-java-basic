package Final;

import java.util.Scanner;

public class Fin_ex2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите уравнение в формате x-2=7 или x+3=5:");
        String str = in.nextLine();

        switch (str.charAt(1)) {
            case '+':
                if (str.charAt(0) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(2)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("x = " + (b - a));
                    break;
                }
                if (str.charAt(2) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("x = " + (b - a));
                    break;
                }
                if (str.charAt(4) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(2)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(0)));
                    System.out.println("x = " + (b + a));
                    break;
                }

            case '-':
                if (str.charAt(0) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(2)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("x = " + (b + a));
                    break;
                }
                if (str.charAt(2) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("x = " + (a - b));
                    break;
                }
                if (str.charAt(4) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(2)));
                    System.out.println("x = " + (a - b));
                    break;
                }
        }
    }
}
