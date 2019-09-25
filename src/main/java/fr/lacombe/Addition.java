package fr.lacombe;

public class Addition extends Operation{

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand+secondOperand;
    }

}
