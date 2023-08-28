package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    @Test
    public void testIsValid_ValidCases() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertTrue(solution.isValid("{[]}"));
    }

    @Test
    public void testIsValid_InvalidCases() {
        ValidParentheses solution = new ValidParentheses();
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("([)]"));
        assertFalse(solution.isValid("{["));
    }

    @Test
    public void testIsValid_EmptyString() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid(""));
    }
}
