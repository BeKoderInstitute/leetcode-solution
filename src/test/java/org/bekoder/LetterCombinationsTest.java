package org.bekoder;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCombinationsTest {

    @Test
    public void testLetterCombinations_Example1() {
        LetterCombinations solution = new LetterCombinations();
        String digits = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected, solution.letterCombinations(digits));
    }

    @Test
    public void testLetterCombinations_EmptyInput() {
        LetterCombinations solution = new LetterCombinations();
        String digits = "";
        List<String> expected = Arrays.asList();
        assertEquals(expected, solution.letterCombinations(digits));
    }

    @Test
    public void testLetterCombinations_SingleDigit() {
        LetterCombinations solution = new LetterCombinations();
        String digits = "2";
        List<String> expected = Arrays.asList("a", "b", "c");
        assertEquals(expected, solution.letterCombinations(digits));
    }

    @Test
    public void testLetterCombinations_TwoDigits() {
        LetterCombinations solution = new LetterCombinations();
        String digits = "45";
        List<String> expected = Arrays.asList("gj", "gk", "gl", "hj", "hk", "hl", "ij", "ik", "il");
        assertEquals(expected, solution.letterCombinations(digits));
    }

    @Test
    public void testLetterCombinations_ThreeDigits() {
        LetterCombinations solution = new LetterCombinations();
        String digits = "789";
        List<String> expected = Arrays.asList("ptw", "ptx", "pty", "ptz", "puw", "pux", "puy", "puz", "pvw", "pvx", "pvy", "pvz",
                "qtw", "qtx", "qty", "qtz", "quw", "qux", "quy", "quz", "qvw", "qvx", "qvy", "qvz", "rtw", "rtx", "rty", "rtz",
                "ruw", "rux", "ruy", "ruz", "rvw", "rvx", "rvy", "rvz", "stw", "stx", "sty", "stz", "suw", "sux", "suy", "suz",
                "svw", "svx", "svy", "svz");
        assertEquals(expected, solution.letterCombinations(digits));
    }

    // Add more test cases as needed
}
