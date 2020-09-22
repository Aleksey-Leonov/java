public class Task6 {
    public static void main(String[] args) {
        //** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        int[] array = new int[]{1, 2, 1, 1, 1};
        System.out.println(arrayComparison(array));

    }

    public static boolean arrayComparison(int[] array) {

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sumLeft += array[i];
            sumRight = 0;
            for (int j = i + 1; j < array.length; j++) {
                sumRight = sumRight + array[j];
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }


}
// УРА!!! Не знаю как, но я это сделал)))!