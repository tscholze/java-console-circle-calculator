package io.github.tscholze;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for circle calculator.
 */
public class AppTest 
{
    /**
     * Test area calculation with radius of 5.
     */
    @Test
    public void testAreaCalculationOfRadiusFive()
    {
        double radius = 5;
        double area = Calculator.calculateArea(radius);
        assertEquals(78.53981633974483, area, 0.0);
    }
}
