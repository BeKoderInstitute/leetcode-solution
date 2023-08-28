package org.bekoder;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DivideTwoIntegersTest {

    @Test
    public void testDivide() {
        DivideTwoIntegers solution = new DivideTwoIntegers();

        int dividend1 = 10;
        int divisor1 = 3;
        int result1 = solution.divide(dividend1, divisor1);
        assertThat(result1, equalTo(3));

        int dividend2 = 7;
        int divisor2 = -3;
        int result2 = solution.divide(dividend2, divisor2);
        assertThat(result2, equalTo(-2));

        // Additional test cases
        int dividend3 = 0;
        int divisor3 = 1;
        int result3 = solution.divide(dividend3, divisor3);
        assertThat(result3, equalTo(0));

        int dividend4 = 1;
        int divisor4 = 1;
        int result4 = solution.divide(dividend4, divisor4);
        assertThat(result4, equalTo(1));

        int dividend5 = -2147483648;
        int divisor5 = 1;
        int result5 = solution.divide(dividend5, divisor5);
        assertThat(result5, equalTo(-2147483648));
    }

}
