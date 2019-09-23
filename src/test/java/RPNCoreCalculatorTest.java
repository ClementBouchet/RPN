import fr.lacombe.RPNCoreCalculator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void ten_plus_two_divided_by_three_makes_four() {
        RPNCoreCalculator rpnCalculator = new RPNCoreCalculator();
        List<String> operators = new ArrayList<>();
        operators.add("+");
        operators.add("/");
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(2);
        integers.add(3);

        assertThat(rpnCalculator.calculate(operators, integers)).isEqualTo(4);
    }
}
