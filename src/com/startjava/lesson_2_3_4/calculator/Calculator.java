package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calc(String mathExpression) {
        String[] mathTerms = mathExpression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        int num1 = Integer.parseInt(mathTerms[0]);
        int num2 = Integer.parseInt(mathTerms[2]);
        String tempOperation = mathExpression.replaceAll("[0-9]", "");
        char operation = tempOperation.charAt(0);
        switch (operation) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyExact(num1, num2);
            case '/':
                return Math.floorDiv(num1, num2);
            case '^':
                return (int) Math.pow(num1, num2);
            case '%':
                return Math.floorMod(num1, num2);
            default:
                System.out.println("Введён неправильный знак математической операции");
        }
        return 0;
    }
}
