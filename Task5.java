public class Task5 {
    public static void main(String[] args) {
        // Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] array = new int[]{4, 3, 5, 8, 5, 3, 11, 2};
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {  //поиск минимального
            if (min > array[i]) min = array[i];
        }

        for (int i = 0; i < array.length; i++) {  //поиск максимального
            if (max < array[i]) max = array[i];
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
