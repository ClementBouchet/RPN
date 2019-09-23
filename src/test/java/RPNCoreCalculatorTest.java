
import fr.lacombe.RPNCoreCalculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RPNCoreCalculatorTest {

    @Test
    public void when_add_zero_plus_zero_return_zero() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        assertThat(calculator.calculate(0, 0, "")).isEqualTo(0);
    }


    @Test
    public void when_add_input_plus_zero_return_input() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        assertThat(calculator.calculate(3, 0, "")).isEqualTo(3);
    }

    @Test
    public void when_add_2_plus_3_return_5() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        assertThat(calculator.calculate(2,3, "")).isEqualTo(5);
    }

    @Test
    public void when_multiply_2_by_3_return_6() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        assertThat(calculator.calculate(2,3,"*")).isEqualTo(6);
    }

    @Test
    public void when_divide_6_by_2_return_3() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        assertThat(calculator.calculate(6,2,"/")).isEqualTo(3);
    }

    @Test(expected = ArithmeticException.class)
    public void when_divide_input_by_zero_throw_an_exception() {
        RPNCoreCalculator rpnCoreCalculator = new RPNCoreCalculator();
        rpnCoreCalculator.calculate(4,0,"/");
    }
}
