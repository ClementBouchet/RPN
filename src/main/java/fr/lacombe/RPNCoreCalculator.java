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
