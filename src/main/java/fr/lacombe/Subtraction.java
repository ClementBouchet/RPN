package fr.lacombe;

public class Subtraction extends TwoVariablesOperation {

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand-secondOperand;
    }
}
