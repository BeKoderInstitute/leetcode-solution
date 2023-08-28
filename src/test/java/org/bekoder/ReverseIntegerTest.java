package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReversePositiveNumber() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(321, solution.reverse(123));
    }

    @Test
    public void testReverseNegativeNumber() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    public void testReverseNumberWithTrailingZeros() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(21, solution.reverse(120));
    }

    @Test
    public void testReverseZero() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(0, solution.reverse(0));
    }

    @Test
    public void testReverseOverflowMaxValue() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(0, solution.reverse(Integer.MAX_VALUE));
    }

    @Test
    public void testReverseOverflowMinValue() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(0, solution.reverse(Integer.MIN_VALUE));
    }

    @Test
    public void testReverseOverflowCase() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(0, solution.reverse(1534236469));
    }

    @Test
    public void testReverseSingleDigit() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(1, solution.reverse(1));
    }

    @Test
    public void testReverseLeadingZeros() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(1, solution.reverse(100));
    }

    @Test
    public void testReverseNoOverflow() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(2147483641, solution.reverse(1463847412));
    }
}
