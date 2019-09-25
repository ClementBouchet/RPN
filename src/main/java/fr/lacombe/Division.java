package fr.lacombe;

public class Division extends Operation{

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand/secondOperand;
    }
}
