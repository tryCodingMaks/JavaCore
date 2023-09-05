package org.example.Calc.TestWork;

public class Main {
    public static void main(String[] args) {
    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(11, -2);
    arithmeticCalculator.calculate(Operator.ADD);
    arithmeticCalculator.calculate(Operator.SUBTRACT);
    arithmeticCalculator.calculate(Operator.MULTIPLY);
    }
}
