package Final;

import java.util.Scanner;

public class Fin_ex4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 3;
        System.out.println("Загадка: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.\n" +
                "Если нужна подсказка, введи слово \"Подсказка\" (доступна к использованию только на первой попытке) или введи свой ответ:");
        do {
            String answer = in.nextLine();
            switch (answer) {
                case "Заархивированный вирус":
                    System.out.println("Правильно!");
                    count = 0;
                    break;
                case "Подсказка":
                    if (count != 3) {
                        System.out.println("Подсказка уже недоступна \nВведи ответ:");
                        break;
                    } else {
                        System.out.println("Два слова. Первое - сжатый файл (прилагательное, \"сжатый\" по-другому), второе - Covid19.");
                        count = 1;
                        break;
                    }
                default:
                    if (count == 1) {
                        System.out.println("Обидно, приходи в другой раз");
                        count--;
                        break;
                    } else {
                        System.out.println("Подумай еще! \nВведи ответ ещё раз:");
                        count--;
                        break;
                    }
            }
        } while (count > 0);
        in.close();
    }
}
