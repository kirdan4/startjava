package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calc(String mathExpression) {
        String[] operands = mathExpression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        int num1 = Integer.parseInt(operands[0]);
        int num2 = Integer.parseInt(operands[2]);
        String tempOperation = mathExpression.replaceAll("[0-9]", "");
        char operation = tempOperation.charAt(0);
        System.out.println( "Результат операции: " +
            switch (operation) {
                case '+' -> Math.addExact(num1, num2);
                case '-' -> Math.subtractExact(num1, num2);
                case '*' -> Math.multiplyExact(num1, num2);
                case '/' -> Math.floorDiv(num1, num2);
                case '^' -> (int) Math.pow(num1, num2);
                case '%' -> Math.floorMod(num1, num2);
                default -> "Введён неправильный знак математической операции";
            }
        );
        return 0;
    }
}
