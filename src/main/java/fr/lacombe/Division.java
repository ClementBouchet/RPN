package fr.lacombe;

public class Division extends TwoVariablesOperation {

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand/secondOperand;
    }
}
