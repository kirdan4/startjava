package com.startjava.lesson_4.base;

import java.util.Arrays;

public class ArrayTheme {
    static void printArray(int[] array){
        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int lenthArray = intArray.length;
        printArray(intArray);
        System.out.println();
        //reverse array
        for (int i = 0; i < lenthArray / 2; i++) {
            int temp = intArray[lenthArray - i - 1];
            intArray[lenthArray - i - 1] = intArray[i];
            intArray[i] = temp;
        }
        printArray(intArray);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        lenthArray = intArray.length;
        for (int i = 0; i < lenthArray; i++) {
            intArray[i] = i;
        }
        int prodNumbers = 1;
        for (int i = 1; i < lenthArray - 1; i++) {
            prodNumbers *= intArray[i];
            System.out.print((i < lenthArray - 2) ? intArray[i] + " * " : (intArray[i] + " = " + prodNumbers) + "\n");
        }
        System.out.printf("Под индексом '0' в массиве значение %d. " +
                "\nПод индексом '9' в массиве значение %d. \n", intArray[0], intArray[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatArray = new float[15];
        lenthArray = floatArray.length;
        int countZeroCell = 0;
        //filling array with random unique values [0-1)
        for (int i = 0; i < lenthArray; i++) {
            System.out.print((floatArray[i] = (float) Math.random()) + " ");
        }
        System.out.println("\nNumber from middle cell = " + floatArray[lenthArray / 2]);
        //rewriting all numbers that are greater than the value of the middle cell of the array with the number 0
        for (int i = 0; i < lenthArray; i++) {
            if (floatArray[i] > floatArray[lenthArray / 2]) {
                floatArray[i] = 0;
                countZeroCell++;
            }
            System.out.print(floatArray[i] + " ");
        }
        System.out.println("\nNumber of zeroed cells = " + countZeroCell);

        System.out.print("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArray = new char[26];
        lenthArray = charArray.length;
        //creating an array of characters (A -Z )
        for (int i = 0; i < lenthArray; i++) {
            charArray[i] = (char) (65 + i);
        }
        //displaying an array in reverse order ladder
        for (int i = 0; i <= lenthArray; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(charArray[25 - j]);
            }
            System.out.println("");
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];
        lenthArray = intArray.length;
        int j;
        //filling array with random unique values [60-100]
        for (int i = 0; i < lenthArray; i++) {
            int newRandomValue = (int) (60 + Math.random() * 41);
            j = 0;
            do {
                if (newRandomValue != intArray[j]) {
                    intArray[i] = newRandomValue;
                } else {
                    i--;
                    break;
                }
                j++;
            } while (j < i);
        }
//        bubble sorter
        for (int i = lenthArray - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        //displaying an array of 10 numbers per line
        for (int i = 0; i < lenthArray; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.print(intArray[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] stringArray = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        lenthArray = stringArray.length;
        int countLine = 0;
        //count the number of non-empty line
        for (String s : stringArray) {
            if (!s.isEmpty()) {
                countLine++;
            }
        }
        //initialize a new array to the number of non-empty cells
        String[] sortedStringArray = new String[countLine];
        int lengthSortedStringArray = sortedStringArray.length;
        countLine = 0;
        for (int i = 0; i < sortedStringArray.length; i++) {
            for (j = 0; j < lenthArray; j++) {
                j = countLine;
                if (!stringArray[j].isEmpty()) {
                    System.arraycopy(stringArray, j, sortedStringArray, i, lengthSortedStringArray);
                    lengthSortedStringArray = lengthSortedStringArray - 1;
                    countLine++;
                    break;
                } else {
                    countLine++;
                }
            }
        }
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(sortedStringArray));
    }
}