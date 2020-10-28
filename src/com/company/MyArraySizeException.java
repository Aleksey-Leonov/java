package com.company;

public class MyArraySizeException extends Exception {

    public void doCheckArrayLength(String[][] array) throws MyArraySizeException {
        String[][] arrayTrue = new String[4][4];
        if (array[0].length != arrayTrue[0].length || array.length != arrayTrue.length) {// Если длина array не равна длине arraytrue
            throw new MyArraySizeException(); // то выбрасываем исключение
        }
    }

    public MyArraySizeException() {
    }

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }
}
