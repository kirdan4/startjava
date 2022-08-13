package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String reply = "yes";
        Scanner scan = new Scanner(System.in);
        do {
            if ("yes".equals(reply)) {
                System.out.println("Введите математическое выражение, без пробелов " +
                        "(число 1, знак математической операции (+, -, *, /, ^, %), число 2):");
                try {
                    Calculator.calc(scan.next());
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Вы ввели неправильное математическое выражение!");
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            reply = scan.next();
        } while (!"no".equals(reply));
    }
}
