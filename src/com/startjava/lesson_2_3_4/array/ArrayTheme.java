package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int length = intArray.length;
        printArray(intArray);

        //reverse array
        for (int i = 0; i < length / 2; i++) {
            int temp = intArray[length - i - 1];
            intArray[length - i - 1] = intArray[i];
            intArray[i] = temp;
        }
        printArray(intArray);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
        }
        int prodNumbers = 1;
        for (int i = 1; i < length - 1; i++) {
            prodNumbers *= intArray[i];
            System.out.print(intArray[i] + ((i < length - 2) ? " * " : " = " + prodNumbers));
        }
        System.out.printf("\nПод индексом '0' в массиве значение %d. " +
                "\nПод индексом '9' в массиве значение %d. \n", intArray[0], intArray[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatArray = new float[15];
        length = floatArray.length;
        int countZeroCell = 0;
        //filling array with random unique values [0-1)
        for (int i = 0; i < length; i++) {
            System.out.print((floatArray[i] = (float) Math.random()) + " ");
        }
        System.out.println("\nNumber from middle cell = " + floatArray[length / 2]);
        //rewriting all numbers that are greater than the value of the middle cell of the array with the number 0
        for (int i = 0; i < length; i++) {
            if (floatArray[i] > floatArray[length / 2]) {
                floatArray[i] = 0;
                countZeroCell++;
            }
            System.out.print(floatArray[i] + " ");
        }
        System.out.println("\nNumber of zeroed cells = " + countZeroCell);

        System.out.print("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArray = new char[26];
        length = charArray.length;
        //creating an array of characters (A -Z )
        for (int i = 0; i < length; i++) {
            charArray[i] = (char) (65 + i);
        }
        //displaying an array in reverse order ladder
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(charArray[25 - j]);
            }
            System.out.println("");
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;
        int j;
        //filling array with random unique values [60-100]
        for (int i = 0; i < length; i++) {
            int newRandomValue = (int) (60 + Math.random() * 41);
            j = 0;
            do {
                if (newRandomValue == intArray[j]) {
                    i--;
                    break;
                }
                intArray[i] = newRandomValue;
                j++;
            } while (j < i);
        }
//        bubble sorter
        for (int i = length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        //displaying an array of 10 numbers per line
        for (int i = 1; i < length + 1; i++) {
            System.out.printf("%d%s", intArray[i - 1], (i % 10 == 0) ? "\n" : " ");
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] stringArray = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        length = stringArray.length;
        int countLine = 0;
        //count the number of non-empty line
        for (String s : stringArray) {
            if (!s.isBlank()) {
                countLine++;
            }
        }
        //initialize a new array to the number of non-empty cells
        String[] stringArrayNoBlankLines = new String[countLine];
        int numberRowsCopy = stringArrayNoBlankLines.length;
        countLine = 0;
        for (int i = 0; i < stringArrayNoBlankLines.length; i++) {
            for (j = 0; j < length; j++) {
                j = countLine;
                if (!stringArray[j].isBlank()) {
                    System.arraycopy(stringArray, j, stringArrayNoBlankLines, i, numberRowsCopy);
                    numberRowsCopy -= 1;
                    countLine++;
                    break;
                }
                countLine++;
            }
        }
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(stringArrayNoBlankLines));
    }

    private static void printArray(int[] nums) {
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}