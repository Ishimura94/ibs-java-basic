package DataWork;

public class DW_ex14 {

    public static void main(String[] args) {

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            int a = -20;
            int b = 20;
            array[i] = a + (int) (Math.random() * ((b - a) + 1));
            System.out.print(array[i] + "; ");
        }

        int max = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= max) {
                max = array[j];
            }
        }
        System.out.println("\nМаксимальный элемент массива: " + max);

        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);

        int res = Math.max(Math.abs(min), Math.abs(max));
        if (Math.abs(min) == Math.abs(max))
            System.out.println("Минимальное и максимальное значения равны по модулю");
        else
            System.out.println("Максимальное по модулю: " + res);
    }
}
