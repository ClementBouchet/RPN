
import fr.lacombe.RPNCoreCalculator;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RPNCoreCalculatorTest {

    @Test
    public void name() {
        RPNCoreCalculator calculator = new RPNCoreCalculator();
        Assertions.assertThat(calculator.calculate()).isEqualTo(0);
    }
}
