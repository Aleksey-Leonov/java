public class Task4 {
    public static void main(String[] args) {
        int[][] twoArray = new int[3][3];

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray.length; j++) {
                twoArray[i][j] = 1;
            }
        }

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray.length; j++) {
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
