package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calc(String mathExpression) throws IllegalArgumentException {
        String[] operands = mathExpression.split(" ");
        int num1;
        int num2;
        if (Integer.parseInt(operands[0]) >= 0 && Integer.parseInt(operands[2]) >= 0) {
            num1 = Integer.parseInt(operands[0]);
            num2 = Integer.parseInt(operands[2]);
        } else {
            throw new IllegalArgumentException();
        }
        String tempOperation = mathExpression.replaceAll("[0-9|\s]", "");
        char operation = tempOperation.charAt(0);
        return switch (operation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            default -> throw new RuntimeException();
        };
    }
}
