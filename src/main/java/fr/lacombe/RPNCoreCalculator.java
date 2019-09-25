package fr.lacombe;

import java.util.List;

public class RPNCoreCalculator {


    public int calculate(List<Operation> biFunctions, List<Integer> integers) {
        int result = integers.get(0);
        int integerIndex = 1;
        for (Operation biFunction : biFunctions) {
            result = biFunction.calculate(result, integers.get(integerIndex));
            integerIndex++;
        }
        return result;
    }


}
