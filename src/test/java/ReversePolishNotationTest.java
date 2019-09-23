import fr.lacombe.RPNCalculator;
import fr.lacombe.RPNInput;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ReversePolishNotationTest {

    @Test
    public void reversePolishNotationAcceptanceTest() {
        String input = "3 8 10 + *";
        RPNInput actualResult = RPNCalculator.calculate(input);
        RPNInput expectedResult = RPNInput.integer(110);
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
}
