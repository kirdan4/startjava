package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String reply = "yes";
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            if ("yes".equals(reply)) {
                System.out.println("Введите математическое выражение, без пробелов " +
                        "(число 1, знак математической операции (+, -, *, /, ^, %), число 2):");
                System.out.println("Результат операции: " + calculator.calc(scan.next()));
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            reply = scan.next();
        } while ("!no".equals(reply));
    }
}
