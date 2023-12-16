package Cycles;

import java.util.Scanner;

public class Cycle_ex9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите длину массива: "); //Вводим массив
        int size = in.nextInt();
        double [] array = new double[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextDouble();
        }

        double average = 0; //Ищем среднее каждого элемента
        if (size > 0)
        {
            double sum = 0;
            for (int j = 0; j < size; j++) {
                sum += array[j];
            }
            average = sum / size;
        }

        for (int i = 0; i < size; i++) { //Выводим элементы, умножая каждый на среднее
            System.out.println(array[i]*average);
        }
    }
}
