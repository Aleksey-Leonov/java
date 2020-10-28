package com.company;

public class MyArrayDataException extends Exception {

    public void doCheckArraySymbols(String[][] array) throws MyArrayDataException {
       char ch;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               ch = array[i][j].charAt(0);
                if(Character.isDigit(ch) == false){
                    throw new MyArrayDataException("Массив не может содержать символы");
                }

            }

        }

    }

    public MyArrayDataException() {
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
