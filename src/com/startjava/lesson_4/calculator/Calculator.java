package com.startjava.lesson_4.calculator;

public class Calculator {
    private final String[] tokens;

    public Calculator(String mathExpression) {
      tokens = mathExpression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
    }
    public int  calc() {
        int number1 = Integer.parseInt(tokens[0]);
        int number2 = Integer.parseInt(tokens[2]);
        String operation = tokens[1];

        switch (operation) {
            case "+":
                return Math.addExact(number1, number2);
            case "-":
                return Math.subtractExact(number1, number2);
            case "*":
                return Math.multiplyExact(number1, number2);
            case "/":
                return Math.floorDiv(number1, number2);
            case "^":
                return (int) Math.pow(number1, number2);
            case "%":
                return Math.floorMod(number1, number2);
            default:
                System.out.println("Введён неправильный знак математической операции");
        }
        return 0;
    }
}
