import fr.lacombe.RPNCalculator;
import fr.lacombe.RPNNumber;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ReversePolishNotationTest {

    @Test
    public void reversePolishNotationAcceptanceTest() {
        String input = "3 8 10 + *";
        RPNNumber actualResult = RPNCalculator.calculate(input);
        RPNNumber expectedResult = RPNNumber.of(110);
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
}
