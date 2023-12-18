package DataWork;

import java.util.Scanner;

public class DW_ex12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your string  \"I like Java!!!\"");
        String str = in.nextLine();

        if (str.equals("I like Java!!!")) {

            boolean have = str.contains("Java");
            System.out.println("String contains \"Java\" : " + have);

            boolean start = str.startsWith("I like");
            System.out.println("String starts with \"I like\": " + start);

            boolean end = str.endsWith("!!!");
            System.out.println("String ends with \"!!!\": " + end);

            if (have == true && start == true && end == true) {
                String result = str.toUpperCase();
                System.out.println(result);
            }

            String rep = str.replace("a", "o");
            String result = rep.substring(7, 11);
            System.out.println(result);
        } else
            System.out.println("Your string is not equals \"I like Java!!!\"");
    }
}
