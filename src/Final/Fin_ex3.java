package Final;

import java.util.Scanner;

public class Fin_ex3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int strNum;
        int index = 0;
        int maxNumChar = 0;

        System.out.println("Введите количество строк:");
        strNum = in.nextInt();
        String[] stringsArray = new String[strNum];
        int[] numberCharInString = new int[strNum];
        System.out.println("Введите строки:");
        for (int i = 0; i < stringsArray.length; i++) {
            stringsArray[i] = in.next();
            numberCharInString[i] = (int) stringsArray[i].chars().distinct().count();
            if (numberCharInString[i] > maxNumChar) {
                maxNumChar = numberCharInString[i];
                index = i;
            }
        }
        System.out.println("Строка с максимальным количеством различных символов: " + stringsArray[index]);
    }
}
