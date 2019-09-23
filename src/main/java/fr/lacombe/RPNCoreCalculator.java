package fr.lacombe;

import java.util.ArrayList;
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


    public int calculate(RPNInput[] inputs) {
//        RPNInput[] splittedOperation = splitOperation(inputs);
//        int firstResult = calculate(splittedOperation[0].integer, splittedOperation[1].integer, splittedOperation[2].operator);
//        return calculate(firstResult, inputs[2].integer, inputs[4].operator);
        List<String> operators = extractOperators(inputs);
        List<Integer> integers = extractIntegers(inputs);
        int result = calculate(integers.get(0), integers.get(1), operators.get(0));
        int integerIndex = 2;
        int operatorIndex = 1;
        for (int i = operatorIndex; i < operators.size(); i++) {
            result = calculate(result, integers.get(integerIndex), operators.get(operatorIndex));
            integerIndex++;
        }

        return result;
    }

    public RPNInput[] splitOperation(RPNInput[] inputs) {
        RPNInput rpnInputOperator = null;
        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i].operator != null){
                rpnInputOperator = RPNInput.operator(inputs[i].operator);
                break;
            }
        }
        return new RPNInput[]{inputs[0], inputs[1], rpnInputOperator};
    }

    private List<String> extractOperators(RPNInput[] inputs){
        List<String> operators = new ArrayList<>();

        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i].operator != null){
                operators.add(inputs[i].operator);
            }
        }

        return operators;
    }

    private List<Integer> extractIntegers(RPNInput[] inputs){
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i].integer != null){
                integers.add(inputs[i].integer);
            }
        }

        return integers;
    }


}
