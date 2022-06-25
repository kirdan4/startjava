package com.startjava.lesson_4;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        for (int number : intArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        //reverse array
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = intArray[i];
            intArray[i] = temp;
        }
        for (int number : intArray) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        for (int i= 0; i < intArray.length; i++) {
            intArray[i] += i;
        }
        int product = 1;
        for (int i = 1; i <= intArray.length - 2; i++) {
            product = product * intArray[i];
            String answer = (i <= intArray.length - 3) ? intArray[i] + " * " : intArray[i] + " = " + product + "\n";
            System.out.print(answer);
        }
        System.out.printf("Под индексом '0' в массиве значение %d. " +
                "\nПод индексом '9' в массиве значение %d. \n", intArray[0], intArray[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatArray = new float[15];
        int countZeroCell = 0;
        //filling array with random unique values [0-1)
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print((floatArray[i] = (float) Math.random()) + " ");
        }
        System.out.println("\nNumber from middle cell = " + floatArray[floatArray.length / 2]);
        //rewriting all numbers that are greater than the value of the middle cell of the array with the number 0
        for (int i = 0; i < floatArray.length; i++) {
            if (floatArray[i] > floatArray[floatArray.length / 2]) {
                floatArray[i] = 0;
                countZeroCell++;
            }
            System.out.print(floatArray[i] + " ");
        }
        System.out.println("\nNumber of zeroed cells = " + countZeroCell);

        System.out.print("\n4. Вывод элементов массива лесенкой в обратном порядке");
        String[] charArray = new String[26];
        //creating an array of characters (A -Z )
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (65 + i) + "";
        }
        //displaying an array in reverse order ladder
        for (int i = 0; i <= charArray.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(charArray[25 - j]);
            }
            System.out.println("");
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];
        //filling array with random unique values [60-100]
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (60 + Math.random() * 41);
            for (int j = 0; j < i; j++) {
                if (intArray[i] == intArray[j]) {
                    i--;
                    break;
                }
            }
        }
        //bubble sorter
        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        //displaying an array of 10 numbers per line
        for (int i = 0; i < intArray.length; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.print(intArray[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] stringArray = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        String[] tempStringArray = new String[stringArray.length];
        System.arraycopy(stringArray, 0, tempStringArray, 0, stringArray.length);
        Arrays.sort(tempStringArray);
        int countNonEmptyLine = 0;
        int countEmptyLine = 0;
        //count the number of non-empty line
        for (String s : stringArray) {
            if (!s.isEmpty()) {
                countNonEmptyLine++;
            }
        }
        //count the number of empty line
        for (String s : stringArray) {
            if (s.isEmpty()) {
                countEmptyLine++;
            }
        }
        //initialize a new array to the number of non-empty cells.
        String[] sortedStringArray = new String[countNonEmptyLine];
        System.arraycopy(tempStringArray, countEmptyLine, sortedStringArray, 0, countNonEmptyLine);
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(sortedStringArray));
    }
}