
import fr.lacombe.RPNCoreCalculator;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RPNCoreCalculatorTest {

    @Test
    public void when_add_zero_plus_zero_return_zero() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        Assertions.assertThat(calculator.calculate()).isEqualTo(0);
    }


}
