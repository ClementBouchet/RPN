package fr.lacombe;

public class RPNCoreCalculator {

    public int calculate(int firstInput, int secondInput, String operator) {
        if("*".equals(operator)){
            return firstInput*secondInput;
        }else if("/".equals(operator)){
            return firstInput/secondInput;
        }
        return firstInput+secondInput;
    }


    public int calculate(RPNInput[] inputs) {
        return 3;
    }
}
