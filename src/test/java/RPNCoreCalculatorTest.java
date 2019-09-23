
import fr.lacombe.RPNCoreCalculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RPNCoreCalculatorTest {

    @Test
    public void when_add_zero_plus_zero_return_zero() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        int input = 0;
        assertThat(calculator.calculate(input)).isEqualTo(0);
    }


    @Test
    public void when_add_input_plus_zero_return_input() {
        int input = 3;
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        assertThat(calculator.calculate(input)).isEqualTo(input);
    }
}
