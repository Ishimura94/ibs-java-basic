package Operators;

import java.util.Scanner;

public class Oper_ex5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число A: ");
        double a = in.nextDouble();

        System.out.print("Введите число B: ");
        double b = in.nextDouble();

        System.out.print("Выберите тип операции (+, -, / или *): ");
        String op = in.next();

        double arif;

        switch (op) {

            case ("+"):
                arif = a + b;
                System.out.println("Результат сложения " + a + " + " + b + " = " + arif);
                break;
            case ("-"):
                arif = a - b;
                System.out.println("Результат вычитания " + a + " - " + b + " = " + arif);
                break;
            case ("/"):
                arif = a / b;
                System.out.println("Результат деления " + a + " / " + b + " = " + arif);
                break;
            case ("*"):
                arif = a * b;
                System.out.println("Результат умножения " + a + " * " + b + " = " + arif);
                break;
            default:
                System.out.println("Неверный ввод типа операции");
                break;
        }
    }
}
