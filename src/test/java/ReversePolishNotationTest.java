import fr.lacombe.RPNCalculator;
import fr.lacombe.RPNNumber;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ReversePolishNotationTest {

    @Test
    public void reversePolishNotationAcceptanceTest() {
        String input = "3 8 10 + *";
        RPNNumber actualResult = RPNCalculator.calculate(input);
        RPNNumber expectedResult = RPNNumber.integer(110);
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void reversePolishNotationAcceptanceTest2() {
        String input = "8 6 - 2 / 3 +";
        RPNNumber actualResult = RPNCalculator.calculate(input);
        RPNNumber expectedResult = RPNNumber.integer(4);
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void reversePolishNotationAcceptanceTest2WithDifferentOrder() {
        String input = "8 6 2 3 - / +";
        RPNNumber actualResult = RPNCalculator.calculate(input);
        RPNNumber expectedResult = RPNNumber.integer(4);
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
}
