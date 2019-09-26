package fr.lacombe;

import java.util.List;

public class RPNCoreCalculator {


    public int calculate(List<TwoVariablesOperation> twoVariablesOperations, List<Integer> operands) {
        int result = operands.get(0);
        int operandIndex = 1;
        for (TwoVariablesOperation twoVariablesOperation : twoVariablesOperations) {
            result = twoVariablesOperation.calculate(result, operands.get(operandIndex));
            operandIndex++;
        }
        return result;
    }


}
