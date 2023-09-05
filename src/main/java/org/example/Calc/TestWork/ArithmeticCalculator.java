package org.example.Calc.TestWork;

public class ArithmeticCalculator {
    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operator operator) {
        if (operator == Operator.ADD) {
            System.out.println(a + b);
        } else if (operator == Operator.SUBTRACT) {
            System.out.println(a - b);

        } else if (operator == Operator.MULTIPLY) {
            System.out.println(a * b);
        } else {
            System.out.println("Неизвестная команда");
        }
    }
}
