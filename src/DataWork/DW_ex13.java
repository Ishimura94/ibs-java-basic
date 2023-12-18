package DataWork;

import java.util.Scanner;

public class DW_ex13 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String lat = "^[a-zA-Z]+$";
        System.out.println("Введите выражение: ");
        String[] strArray = in.nextLine().split(" ");
        int count = 0;
        for (String str : strArray) {
            if (str.matches(lat)) {
                System.out.println(str);
                count++;
            }
        }
        System.out.println("Слова, состоящие только из латиницы: " + count);
    }
}
