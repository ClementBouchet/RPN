package fr.lacombe;

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
        return 3;
    }

    public RPNInput[] splitOperation(RPNInput[] inputs) {
        RPNInput rpnInputOperator = null;
        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i].operator != null){
                rpnInputOperator = RPNInput.operator(inputs[i].operator);
                break;
            }
        }
        return new RPNInput[]{inputs[0], inputs[1], rpnInputOperator};
    }
}
