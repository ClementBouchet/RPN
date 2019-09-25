import fr.lacombe.Addition;
import fr.lacombe.Division;
import fr.lacombe.RPNCoreCalculator;
import fr.lacombe.TwoVariablesOperation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RPNCoreCalculatorTest {

    @Test
    public void ten_plus_two_divided_by_three_makes_four() {
        RPNCoreCalculator rpnCalculator = new RPNCoreCalculator();
        List<TwoVariablesOperation> biFunctions = new ArrayList<>();
        biFunctions.add(new Addition());
        biFunctions.add(new Division());
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(2);
        integers.add(3);

        assertThat(rpnCalculator.calculate(biFunctions, integers)).isEqualTo(4);
    }
}
