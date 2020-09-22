public class Task1 {

    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == 0) arrayInt[i] = 1;
            else if (arrayInt[i] == 1) arrayInt[i] = 0;
        }

        for (int i = 0; i < arrayInt.length; i++) { //проверка
            System.out.println(arrayInt[i]);
        }

    }

}
