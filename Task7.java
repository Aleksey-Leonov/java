public class Task7 {
    public static void main(String[] args) {
        //**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = -2;
        arrayOffset(array, a);

    }

    public static void arrayOffset(int array[], int a) {
        if (a != 0) {
            int firstLast;
            if (a > array.length) firstLast = Math.abs(a % array.length);
            else firstLast = a;

            if (firstLast > 0) {
                for (int n = 0; n < firstLast; n++) {
                    int buffer = array[0];
                    array[0] = array[array.length - 1];

                    for (int j = 1; j < array.length - 1; j++) {
                        array[array.length - j] = array[array.length - j - 1];
                    }
                    array[1] = buffer;
                }
            } else if (firstLast < 0) {
                for (int i = 0; i > firstLast; i--) {
                    int buffer = array[array.length - 1];
                    array[array.length - 1] = array[0];

                    for (int j = 1; j < array.length - 1; j++) {
                        array[j - 1] = array[j];
                    }
                    array[array.length - 2] = buffer;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
