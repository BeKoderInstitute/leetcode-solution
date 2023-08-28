package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    @Test
    public void testMaxAreaCase1() {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void testMaxAreaCase2() {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }

    @Test
    public void testMaxAreaCase3() {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        assertEquals(16, solution.maxArea(new int[]{4, 3, 2, 1, 4}));
    }

    @Test
    public void testMaxAreaCase4() {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        assertEquals(2, solution.maxArea(new int[]{1, 2, 1}));
    }

    @Test
    public void testMaxAreaCase5() {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        assertEquals(12, solution.maxArea(new int[]{1, 3, 6, 2, 5, 4}));
    }
}
