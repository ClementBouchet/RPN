import fr.lacombe.RPNCalculator;
import fr.lacombe.RPNNumber;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ReversePolishNotationTest {

    @Test
    public void reverse_polish_notation_acceptance_test() {
        String input = "3 8 10 + *";
        RPNNumber actualResult = RPNCalculator.calculate(input);
        RPNNumber expectedResult = RPNNumber.integer(110);
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void reverse_polish_notation_acceptance_test2() {
        String input = "8 6 - 2 / 3 +";
        RPNNumber actualResult = RPNCalculator.calculate(input);
        RPNNumber expectedResult = RPNNumber.integer(4);
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void reverse_polish_notation_acceptance_test_with_different_order() {
        String input = "8 6 2 3 - / +";
        RPNNumber actualResult = RPNCalculator.calculate(input);
        RPNNumber expectedResult = RPNNumber.integer(4);
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_put_a_character_different_from_integer_or_operator_then_an_exception_occurs() {
        String input = "8 4 M *";
        RPNCalculator.calculate(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_put_an_invalid_number_of_operators_an_exception_occurs() {
        String input = "8 4 + *";
        RPNCalculator.calculate(input);
    }
}
