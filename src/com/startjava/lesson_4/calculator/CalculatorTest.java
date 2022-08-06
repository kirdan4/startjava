package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String reply;
        do {
            System.out.println("Введите математическое выражение, без пробелов (число 1, знак математической операции (+, -, *, /, ^, %), число 2):");
            Scanner scan = new Scanner(System.in);
            Calculator calculator = new Calculator(scan.next());
            System.out.println("Результат операции: " + calculator.calc());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        } while (reply.equals("yes"));
    }
}