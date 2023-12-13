package Operators;

import java.util.Scanner;

public class Oper_ex6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1-масса, 2-расстояние");

        int physQuant = in.nextInt();

        if (physQuant == 1) {
            System.out.println("Выберите единицу измерения: 1-кг, 2-грамм, 3-фунт, 4-карат");
        } else {
            System.out.println("Выберите единицу измерения: 1-метр, 2-миля, 3-ярд, 4-фут");
        }

        int unit = in.nextInt();

        System.out.println("Введите число: ");
        double userNumber = in.nextDouble();

        if (physQuant == 1) {

            double kg = 0;
            double g = 0;
            double lb = 0;
            double carat = 0;

            switch (unit) {
                case 1:
                    kg = userNumber;
                    g = userNumber * 1000;
                    lb = userNumber * 2.2046223302272;
                    carat = userNumber * 5000;
                    break;
                case 2:
                    kg = userNumber / 1000;
                    g = userNumber;
                    lb = userNumber / 453.592;
                    carat = userNumber * 5;
                    break;
                case 3:
                    kg = userNumber / 2.205;
                    g = userNumber * 453.592;
                    lb = userNumber;
                    carat = userNumber * 2267.962;
                    break;
                case 4:
                    kg = userNumber / 5000;
                    g = userNumber / 5;
                    lb = userNumber / 2267.962;
                    carat = userNumber;
                    break;
            }
            System.out.println("Результат: \n килограмм = " + kg + "\n грамм = " + g + "\n фунт = " + lb + "\n карат = " + carat);

        } else {
            double meter = 0;
            double mile = 0;
            double yard = 0;
            double foot = 0;

            switch (unit) {
                case 1:
                    meter = userNumber;
                    mile = userNumber / 1609.34;
                    yard = userNumber * 1.094;
                    foot = userNumber * 3.281;
                    break;
                case 2:
                    meter = userNumber * 1609.34;
                    mile = userNumber;
                    yard = userNumber * 1760;
                    foot = userNumber * 5280;
                    break;
                case 3:
                    meter = userNumber / 1.094;
                    mile = userNumber / 1760;
                    yard = userNumber;
                    foot = userNumber * 3;
                    break;
                case 4:
                    meter = userNumber / 3.281;
                    mile = userNumber / 5280;
                    yard = userNumber / 3;
                    foot = userNumber;
                    break;
            }
            System.out.println("Результат: \n метр = " + meter + "\n миля = " + mile + "\n ярд = " + yard + "\n фут = " + foot);
        }
    }
}
