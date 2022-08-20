package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String reply = "yes";
        Scanner scan = new Scanner(System.in);
        do {
            if ("yes".equals(reply)) {
                System.out.println("Введите математическое выражение, через пробел " +
                        "(число 1, знак математической операции (+, -, *, /, ^, %), число 2):");
                try {
                    System.out.println("Результат операции: " + Calculator.calc(scan.nextLine()));
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException | NumberFormatException e) {
                    System.out.println("Введено неправильное математическое выражение!");
                } catch (ArithmeticException e) {
                    System.out.println("На ноль делить нельзя!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Введено число неверного формата! Числа должны быть целыми и положительными, введены через пробел!");
                } catch (RuntimeException e) {
                    System.out.println("Введен неверный математический знак!");
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            reply = scan.nextLine();
        } while (!"no".equals(reply));
    }
}