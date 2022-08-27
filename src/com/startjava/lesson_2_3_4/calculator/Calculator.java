package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calc(String mathExpression) {
        String[] operands = mathExpression.split("\\s+");
        if (operands.length != 3) {
            throw new IllegalArgumentException("Введено математическое выражение неверного формата!" +
                    "\n(пример:23 * 43)");
        }
        int num1 = Integer.parseInt(operands[0]);
        int num2 = Integer.parseInt(operands[2]);
        if (num1 < 1 || num2 < 1) {
            throw new IllegalArgumentException("Введено число неверного формата! Числа должны быть " +
                    "положительными.");
        }
        char operation = operands[1].charAt(0);
        return switch (operation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            default -> throw new IllegalArgumentException("Введен неверный математический знак!" +
                    "\n(допустимые знаки: +, -, *, /, ^, %)");
        };
    }
}
