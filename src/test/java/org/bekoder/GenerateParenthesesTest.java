package org.bekoder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateParenthesesTest {

    @Test
    public void testGenerateParenthesisWithNEqual3() {
        GenerateParentheses solution = new GenerateParentheses();

        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> result = solution.generateParenthesis(3);
        assertEquals(expected, result);
    }

    @Test
    public void testGenerateParenthesisWithNEqual1() {
        GenerateParentheses solution = new GenerateParentheses();

        List<String> expected = Collections.singletonList("()");
        List<String> result = solution.generateParenthesis(1);
        assertEquals(expected, result);
    }
}
