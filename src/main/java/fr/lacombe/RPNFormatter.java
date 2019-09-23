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
}
