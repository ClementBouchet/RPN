package fr.lacombe;

public class Multiplication extends Operation {

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand*secondOperand;
    }
}
