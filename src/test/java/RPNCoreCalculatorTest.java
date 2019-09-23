import fr.lacombe.RPNCoreCalculator;
import fr.lacombe.RPNInput;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RPNCoreCalculatorTest {

    @Test
    public void when_two_integer_inputs_and_addition_input_make_sum_of_integers_input() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        assertThat(calculator.calculate(2,3, "+")).isEqualTo(5);
    }

    @Test
    public void when_two_integer_inputs_and_multiplication_input_make_multiplication_of_integers_input() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        assertThat(calculator.calculate(2,3,"*")).isEqualTo(6);
    }

    @Test
    public void when_two_integer_inputs_and_division_input_make_division_of_integers_input() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        assertThat(calculator.calculate(6,2,"/")).isEqualTo(3);
    }

    @Test(expected = ArithmeticException.class)
    public void when_divide_input_by_zero_throw_an_exception() {
        RPNCoreCalculator rpnCoreCalculator = new RPNCoreCalculator();
        rpnCoreCalculator.calculate(4,0,"/");
    }

    @Test
    public void one_plus_one_plus_one_makes_three() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        RPNInput input1 = RPNInput.integer(1);
        RPNInput input2 = RPNInput.integer(1);
        RPNInput input3 = RPNInput.integer(1);
        RPNInput input4 = RPNInput.operator("+");
        RPNInput input5 = RPNInput.operator("+");
        RPNInput[] inputs = {input1, input2, input3, input4, input5};
        assertThat(calculator.calculate(inputs)).isEqualTo(3);
    }


    @Test
    public void one_plus_one_plus_two_makes_four() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        RPNInput input1 = RPNInput.integer(1);
        RPNInput input2 = RPNInput.integer(1);
        RPNInput input3 = RPNInput.integer(2);
        RPNInput input4 = RPNInput.operator("+");
        RPNInput input5 = RPNInput.operator("+");
        RPNInput[] inputs = {input1, input2, input3, input4, input5};
        assertThat(calculator.calculate(inputs)).isEqualTo(4);
    }

    @Test
    public void one_plus_one_multiplied_by_three_makes_six() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        RPNInput input1 = RPNInput.integer(1);
        RPNInput input2 = RPNInput.integer(1);
        RPNInput input3 = RPNInput.integer(3);
        RPNInput input4 = RPNInput.operator("+");
        RPNInput input5 = RPNInput.operator("*");
        RPNInput[] inputs = {input1, input2, input3, input4, input5};
        assertThat(calculator.calculate(inputs)).isEqualTo(6);
    }

    @Test
    public void one_plus_one_multiplied_by_three_makes_six_with_different_order() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        RPNInput input1 = RPNInput.integer(1);
        RPNInput input2 = RPNInput.integer(1);
        RPNInput input3 = RPNInput.operator("+");
        RPNInput input4 = RPNInput.integer(3);
        RPNInput input5 = RPNInput.operator("*");
        RPNInput[] inputs = {input1, input2, input3, input4, input5};
        assertThat(calculator.calculate(inputs)).isEqualTo(6);
    }

    @Test
    public void eight_minus_six_divided_by_two_makes_one() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        RPNInput input1 = RPNInput.integer(8);
        RPNInput input2 = RPNInput.integer(6);
        RPNInput input3 = RPNInput.operator("-");
        RPNInput input4 = RPNInput.integer(2);
        RPNInput input5 = RPNInput.operator("/");
        RPNInput[] inputs = {input1, input2, input3, input4, input5};
        assertThat(calculator.calculate(inputs)).isEqualTo(1);
    }

}
