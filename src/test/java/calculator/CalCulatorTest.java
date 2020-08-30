package calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CalCulatorTest {

    @Test
    public void calculate() throws Exception{
        //give
        int result1;
        int result2;
        int result3;
        String input1 = "2 + 3 * 4 / 2";
        String input2 = "2 * 10 / 3 + 2";
        String input3 = "2 - 3 * 4 / 2";
        //when
        CalCulator calCulator1 = new CalCulator(input1);
        CalCulator calCulator2 = new CalCulator(input2);
        CalCulator calCulator3 = new CalCulator(input3);
        result1 = calCulator1.calculate();
        result2 = calCulator2.calculate();
        result3 = calCulator3.calculate();
        //then
        assertThat(result1).isEqualTo(10);
        assertThat(result2).isEqualTo(8);
        assertThat(result3).isEqualTo(-2);
    }
}