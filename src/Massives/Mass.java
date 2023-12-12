package Massives;

public class Mass {
    public static void main(String[] args) {
        int [] array={12,32,13,24,55};
        int temp = array[0]; //меняем местами первый и последний элементы
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int sum = array[0] + array[array.length / 2]; //складываем первый и средний элементы
        System.out.println("\n"+sum); //вывод с переносом строки, чтобы разграничить оба вывода
    }
}
