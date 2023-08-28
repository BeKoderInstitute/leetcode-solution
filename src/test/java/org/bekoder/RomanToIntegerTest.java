package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInt_III_ShouldReturn3() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    public void testRomanToInt_LVIII_ShouldReturn58() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    public void testRomanToInt_MCMXCIV_ShouldReturn1994() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    public void testRomanToInt_IV_ShouldReturn4() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    public void testRomanToInt_IX_ShouldReturn9() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(9, solution.romanToInt("IX"));
    }

    @Test
    public void testRomanToInt_XL_ShouldReturn40() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(40, solution.romanToInt("XL"));
    }

    @Test
    public void testRomanToInt_XC_ShouldReturn90() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(90, solution.romanToInt("XC"));
    }

    @Test
    public void testRomanToInt_CD_ShouldReturn400() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(400, solution.romanToInt("CD"));
    }

    @Test
    public void testRomanToInt_CM_ShouldReturn900() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(900, solution.romanToInt("CM"));
    }

    @Test
    public void testRomanToInt_MMMCDXCIX_ShouldReturn3499() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(3499, solution.romanToInt("MMMCDXCIX"));
    }

    @Test
    public void testRomanToInt_MCXI_ShouldReturn1111() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(1111, solution.romanToInt("MCXI"));
    }

    @Test
    public void testRomanToInt_CCCLXIX_ShouldReturn369() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(369, solution.romanToInt("CCCLXIX"));
    }

    @Test
    public void testRomanToInt_MMCMLXXXIV_ShouldReturn2984() {
        RomanToInteger solution = new RomanToInteger();

        assertEquals(2984, solution.romanToInt("MMCMLXXXIV"));
    }
}
