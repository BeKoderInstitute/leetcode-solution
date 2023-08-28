package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerTest {

    @Test
    public void testMyAtoiPositive() {
        StringToInteger solution = new StringToInteger();

        assertEquals(42, solution.myAtoi("42"));
    }

    @Test
    public void testMyAtoiNegative() {
        StringToInteger solution = new StringToInteger();

        assertEquals(-42, solution.myAtoi("   -42"));
    }

    @Test
    public void testMyAtoiLeadingWhitespace() {
        StringToInteger solution = new StringToInteger();

        assertEquals(4193, solution.myAtoi("4193 with words"));
    }

    @Test
    public void testMyAtoiNonDigitCharacters() {
        StringToInteger solution = new StringToInteger();

        assertEquals(0, solution.myAtoi("words and 987"));
    }

    @Test
    public void testMyAtoiOverflowMaxValue() {
        StringToInteger solution = new StringToInteger();

        assertEquals(Integer.MAX_VALUE, solution.myAtoi("20000000000000000000"));
    }

    @Test
    public void testMyAtoiOverflowMinValue() {
        StringToInteger solution = new StringToInteger();

        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-20000000000000000000"));
    }

    @Test
    public void testMyAtoiNoDigits() {
        StringToInteger solution = new StringToInteger();

        assertEquals(0, solution.myAtoi("   "));
    }

    @Test
    public void testMyAtoiSignAfterDigits() {
        StringToInteger solution = new StringToInteger();

        assertEquals(4193, solution.myAtoi("4193 with words"));
    }

    @Test
    public void testMyAtoiLeadingZeros() {
        StringToInteger solution = new StringToInteger();

        assertEquals(42, solution.myAtoi("00042"));
    }
}
