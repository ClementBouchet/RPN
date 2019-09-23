package fr.lacombe;

public class RPNCalculator {

    public static RPNInput calculate(String input) {
        RPNInput[] inputs = RPNFormatter.formatToArray(input);
        RPNCoreCalculator rpnCoreCalculator = new RPNCoreCalculator();
        return RPNInput.integer(rpnCoreCalculator.calculate(inputs));
    }
}
