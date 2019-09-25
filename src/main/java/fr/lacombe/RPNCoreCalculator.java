package fr.lacombe;

import java.util.List;

public class RPNCoreCalculator {


    public int calculate(List<TwoVariablesOperation> twoVariablesOperations, List<Integer> integers) {
        int result = integers.get(0);
        int integerIndex = 1;
        for (TwoVariablesOperation twoVariablesOperation : twoVariablesOperations) {
            result = twoVariablesOperation.calculate(result, integers.get(integerIndex));
            integerIndex++;
        }
        return result;
    }


}
