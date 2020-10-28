package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] array;
        array = new String[][]{{"1", "1", "1","1"}, {"1", "1", "1","1"}, {"1", "1", "1","1"}, {"1","1","1","1"}};
        doArrayTwo(array);

    }

    static void doArrayTwo(String[][] array) {
        int sum = 0;
        try {
            new MyArraySizeException().doCheckArrayLength(array);
        } catch (MyArraySizeException exception) {
            System.out.println("WARNING! Необходимо было ввести массив с размерностю 4х4");
        }
        try {
            new MyArrayDataException().doCheckArraySymbols(array);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += Integer.parseInt(array[i][j]);
                }
            }
        } catch (MyArrayDataException exData) {
            System.out.println(exData.getMessage());
        }
        System.out.println("Сумма массива равна " + sum);

    }
}
