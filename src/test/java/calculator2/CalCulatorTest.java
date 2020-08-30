package calculator2;

import calculator.CalCulator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalCulatorTest {

    @Test
    public void calculate() throws Exception{
        //give
        int result1;
        int result2;
        int result3;
        String input1 = "2 + 3 * 4 / 2";
        String input2 = "2 + 10 / 5 + 2";
        String input3 = "2 - 3 * 4 / 2";
        //when
        calculator.CalCulator calCulator1 = new calculator.CalCulator(input1);
        calculator.CalCulator calCulator2 = new calculator.CalCulator(input2);
        calculator.CalCulator calCulator3 = new CalCulator(input3);
        result1 = calCulator1.calculate();
        result2 = calCulator2.calculate();
        result3 = calCulator3.calculate();
        //then
        assertThat(result1).isEqualTo(10);
        assertThat(result2).isEqualTo(4);
        assertThat(result3).isEqualTo(-2);
    }
}