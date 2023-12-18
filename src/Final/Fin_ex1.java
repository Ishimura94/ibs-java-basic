package Final;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Fin_ex1 {

    static DecimalFormat df = new DecimalFormat("#.##");
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите текущий курс доллара:");
        double exRate = in.nextDouble();
        System.out.println("Введите сумму в рублях:");
        double RUB = in.nextDouble();
        double conv = RUB / exRate;
        System.out.println("Сумма в рублях: " + RUB + ", в долларах: " + df.format(conv));
    }
}
