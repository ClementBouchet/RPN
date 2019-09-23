package fr.lacombe;

import java.util.List;

public class RPNCoreCalculator {

    public int calculate(int firstInput, int secondInput, String operator) {
        if("*".equals(operator)){
            return firstInput*secondInput;
        }else if("/".equals(operator)){
            return firstInput/secondInput;
        }else if("-".equals(operator)){
            return firstInput-secondInput;
        }
        return firstInput+secondInput;
    }


    public int calculate(List<String> operators, List<Integer> integers) {

        int result = integers.get(0);
        int integerIndex = 1;
        for (int operatorIndex = 0; operatorIndex < operators.size(); operatorIndex++) {
            result = calculate(result, integers.get(integerIndex), operators.get(operatorIndex));
            integerIndex++;
        }

        return result;
    }


}
