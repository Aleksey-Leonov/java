public final class ArrayUtils {
    private static final int EMPTY_INDEX = -1;
    private ArrayUtils() {
    }

    public static int[] findElementsAfterDigit(int[] numbers, int digit){
        if (numbers == null || numbers.length == 0){
            throw new RuntimeException("Array cannot be null nor empty");
        }
        int inx = EMPTY_INDEX;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == digit){
            inx = i+1;
            }
        }

        if (inx == EMPTY_INDEX){
            throw new RuntimeException("Array does not contain any digit like + " + digit);
        }

        int size = numbers.length - inx;
        int[] foundValues = new int[numbers.length - inx];
        System.arraycopy(numbers,inx, foundValues, 0 , size);

        return foundValues;

    }

}
