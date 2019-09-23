package fr.lacombe;

public class RPNCalculator {

    public static RPNNumber calculate(String input) {
        RPNNumber[] inputs = RPNFormatter.formatToArray(input);
        RPNCoreCalculator rpnCoreCalculator = new RPNCoreCalculator();
        return RPNNumber.integer(rpnCoreCalculator.calculate(RPNFormatter.extractOperators(inputs), RPNFormatter.extractIntegers(inputs)));
    }


}
