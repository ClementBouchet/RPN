package fr.lacombe;

public class Addition extends TwoVariablesOperation {

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand+secondOperand;
    }

}
