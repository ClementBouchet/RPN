package fr.lacombe;

import java.util.ArrayList;
import java.util.List;

public class RPNFormatter {

    public static RPNInput[] formatToArray(String input) {

        String[] inputs = input.split(" ");
        List<RPNInput> inputList = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            if("+".equals(inputs[i]) || "*".equals(inputs[i]) || "/".equals(inputs[i]) || "-".equals(inputs[i])){
                inputList.add(RPNInput.operator(inputs[i]));
            }else {
                inputList.add(RPNInput.integer(Integer.valueOf(inputs[i])));
            }
        }

        return inputList.toArray(new RPNInput[0]);
    }

    static List<Integer> extractIntegers(RPNInput[] inputs){
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i].integer != null){
                integers.add(inputs[i].integer);
            }
        }

        return integers;
    }

    static List<String> extractOperators(RPNInput[] inputs){
        List<String> operators = new ArrayList<>();

        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i].operator != null){
                operators.add(inputs[i].operator);
            }
        }

        return operators;
    }
}
