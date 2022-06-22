package com.startjava.lesson_4;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7};
        for (int num : arrayNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        //reverse array output
        for (int i = arrayNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayNumbers[i] + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] arrayNumbersToProduct = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int product = 1;
        for (int i = 1; i <= arrayNumbersToProduct.length - 1; i++) {
            product = product * arrayNumbersToProduct[i];
            if (i <= arrayNumbersToProduct.length - 3) {
                System.out.print(arrayNumbersToProduct[i] + " * ");
            } else if (i == arrayNumbersToProduct.length - 2) {
                System.out.print(arrayNumbersToProduct[i] + " = " + product + "\n");
            } else {
                System.out.printf("Под индексом '0' в массиве значение %d. " +
                        "\nПод индексом '9' в массиве значение %d. \n", arrayNumbersToProduct[0], arrayNumbersToProduct[9]);
            }
        }

        System.out.println("\n3. Удаление элементов массива");
        float[] arrayRandomRealNumbers = new float[15];
        int countZeroCell = 0;
        //filling array with random unique values [0-1)
        for (int i = 0; i < arrayRandomRealNumbers.length; i++) {
            arrayRandomRealNumbers[i] = (float) Math.random();
            System.out.print(arrayRandomRealNumbers[i] + " ");
        }
        System.out.println("\nNumber from middle cell = " + arrayRandomRealNumbers[7]);
        //rewriting all numbers that are greater than the value of the middle cell of the array with the number 0
        for (int i = 0; i < arrayRandomRealNumbers.length; i++) {
            if (arrayRandomRealNumbers[i] > arrayRandomRealNumbers[7]) {
                arrayRandomRealNumbers[i] = 0;
                countZeroCell++;
            }
            System.out.print(arrayRandomRealNumbers[i] + " ");
        }
        System.out.println("\nNumber of zeroed cells = " + countZeroCell);

        System.out.print("\n4. Вывод элементов массива лесенкой в обратном порядке");
        String[] arrayCharacters = new String[26];
        //creating an array of characters (A -Z )
        for (int i = 0; i < arrayCharacters.length; i++) {
            arrayCharacters[i] = (char) (65 + i) + "";
        }
        //displaying an array in reverse order ladder
        for (int i = 0; i <= arrayCharacters.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arrayCharacters[25 - j]);
            }
            System.out.println("");
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] arrayUniqueNumbers = new int[30];
        //filling array with random unique values [60-100]
        for (int i = 0; i < arrayUniqueNumbers.length; i++) {
            arrayUniqueNumbers[i] = (int) (60 + Math.random() * 41);
            for (int j = 0; j < i; j++) {
                if (arrayUniqueNumbers[i] == arrayUniqueNumbers[j]) {
                    i--;
                    break;
                }
            }
        }
        //bubble sorter
        for (int i = arrayUniqueNumbers.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayUniqueNumbers[j] > arrayUniqueNumbers[j + 1]) {
                    int temp = arrayUniqueNumbers[j];
                    arrayUniqueNumbers[j] = arrayUniqueNumbers[j + 1];
                    arrayUniqueNumbers[j + 1] = temp;
                }
            }
        }
        //displaying an array of 10 numbers per line
        for (int i = 0; i < arrayUniqueNumbers.length; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.print(arrayUniqueNumbers[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] arrayStrings = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        String[] tempArray = new String[arrayStrings.length];
        System.arraycopy(arrayStrings, 0, tempArray, 0, arrayStrings.length);
        Arrays.sort(tempArray);
        int countNonEmptyLine = 0;
        int countEmptyLine = 0;
        //count the number of non-empty line
        for (String s : arrayStrings) {
            if (!s.isEmpty()) {
                countNonEmptyLine++;
            }
        }
        //count the number of empty line
        for (String s : arrayStrings) {
            if (s.isEmpty()) {
                countEmptyLine++;
            }
        }
        //initialize a new array to the number of non-empty cells.
        String[] array7 = new String[countNonEmptyLine];
        System.arraycopy(tempArray, countEmptyLine, array7, 0, countNonEmptyLine);
        System.out.println(Arrays.toString(arrayStrings));
        System.out.println(Arrays.toString(array7));
    }
}