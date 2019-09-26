package fr.lacombe;

import java.util.ArrayList;
import java.util.List;

public class RPNFormatter {

    public static final String OPERATOR_IS_MISSING_ERROR_MESSAGE = "At least one operator is missing";
    public static final String NUMBER_IS_MISSING_ERROR_MESSAGE = "At least one number is missing";

    public static RPNElement[] formatToArray(String input) throws IllegalArgumentException {

        String[] inputs = input.split(" ");
        List<RPNElement> inputList = new ArrayList<>();
        for (String input1 : inputs) {
            addElementInList(input1, inputList);
        }
        return inputList.toArray(new RPNElement[0]);
    }

    private static void addElementInList(String input, List<RPNElement> inputList) throws IllegalArgumentException {
        if("+".equals(input) || "*".equals(input) || "/".equals(input) || "-".equals(input)){
            inputList.add(RPNElement.operator(input));
        }else if(input.matches("-?\\d+")){
            inputList.add(RPNElement.integer(Integer.valueOf(input)));
        }else {
            throw new IllegalArgumentException();
        }
    }

    static List<Integer> extractIntegers(RPNElement[] inputs){
        List<Integer> integers = new ArrayList<>();

        for (RPNElement input : inputs) {
            if (input.integer != null) {
                integers.add(input.integer);
            }
        }

        return integers;
    }

    static List<TwoVariablesOperation> extractOperators(RPNElement[] inputs){
        List<TwoVariablesOperation> operators = new ArrayList<>();

        for (RPNElement input : inputs) {
            if (input.operator != null) {
                operators.add(parseStringToOperation(input.operator));
            }
        }

        return operators;
    }

    private static TwoVariablesOperation parseStringToOperation(String input){
        TwoVariablesOperation twoVariablesOperation;

        if("+".equals(input)){
            twoVariablesOperation = new Addition();
        }else if ("/".equals(input)){
            twoVariablesOperation = new Division();
        }else if ("-".equals(input)){
            twoVariablesOperation = new Subtraction();
        }else{
            twoVariablesOperation = new Multiplication();
        }

        return twoVariablesOperation;
    }

    public static void isNumberOfArgumentsValid(List<TwoVariablesOperation> operators, List<Integer> integers) throws IllegalArgumentException{
        if(operators.size() < integers.size() -1){
            throw new IllegalArgumentException(OPERATOR_IS_MISSING_ERROR_MESSAGE);
        }
        if(operators.size() > integers.size() -1){
            throw new IllegalArgumentException(NUMBER_IS_MISSING_ERROR_MESSAGE);
        }

    }
}
