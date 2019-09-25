package fr.lacombe;

public class Multiplication extends TwoVariablesOperation {

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand*secondOperand;
    }
}
