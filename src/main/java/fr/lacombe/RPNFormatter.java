package fr.lacombe;

import java.util.ArrayList;
import java.util.List;

public class RPNFormatter {

    public static final String ONE_OPERATOR_IS_MISSING_ERROR_MESSAGE = "At least one operator is missing";
    public static final String ONE_NUMBER_IS_MISSING_ERROR_MESSAGE = "At least one number is missing";

    public static RPNNumber[] formatToArray(String input) {

        String[] inputs = input.split(" ");
        List<RPNNumber> inputList = new ArrayList<>();
        for (String input1 : inputs) {
            addElementInList(input1, inputList);
        }
        return inputList.toArray(new RPNNumber[0]);
    }

    private static void addElementInList(String input, List<RPNNumber> inputList) {
        if("+".equals(input) || "*".equals(input) || "/".equals(input) || "-".equals(input)){
            inputList.add(RPNNumber.operator(input));
        }else {
            inputList.add(RPNNumber.integer(Integer.valueOf(input)));
        }
    }

    static List<Integer> extractIntegers(RPNNumber[] inputs){
        List<Integer> integers = new ArrayList<>();

        for (RPNNumber input : inputs) {
            if (input.integer != null) {
                integers.add(input.integer);
            }
        }

        return integers;
    }

    static List<String> extractOperators(RPNNumber[] inputs){
        List<String> operators = new ArrayList<>();

        for (RPNNumber input : inputs) {
            if (input.operator != null) {
                operators.add(input.operator);
            }
        }

        return operators;
    }

    public static void isNumberOfArgumentsValid(List<String> operators, List<Integer> integers) throws IllegalArgumentException{
        if(operators.size() < integers.size() -1){
            throw new IllegalArgumentException(ONE_OPERATOR_IS_MISSING_ERROR_MESSAGE);
        }
        if(operators.size() > integers.size() -1){
            throw new IllegalArgumentException(ONE_NUMBER_IS_MISSING_ERROR_MESSAGE);
        }

    }
}
