package fr.lacombe;

import java.util.List;

public class RPNCalculator {

    public static RPNNumber calculate(String input) {
        RPNNumber[] inputs = RPNFormatter.formatToArray(input);
        List<String> operators = RPNFormatter.extractOperators(inputs);
        List<Integer> integers = RPNFormatter.extractIntegers(inputs);
        RPNFormatter.isNumberOfArgumentsValid(operators, integers);

        RPNCoreCalculator rpnCoreCalculator = new RPNCoreCalculator();
        return RPNNumber.integer(rpnCoreCalculator.calculate(operators, integers));
    }


}
