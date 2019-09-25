package fr.lacombe;

import java.util.List;

public class RPNCalculator {

    public static RPNNumber calculate(String input) {
        RPNNumber[] inputs = RPNFormatter.formatToArray(input);
        List<Operation> biFunctions = RPNFormatter.extractOperators(inputs);
        List<Integer> integers = RPNFormatter.extractIntegers(inputs);
        RPNFormatter.isNumberOfArgumentsValid(biFunctions, integers);

        RPNCoreCalculator rpnCoreCalculator = new RPNCoreCalculator();
        return RPNNumber.integer(rpnCoreCalculator.calculate(biFunctions, integers));
    }


}
