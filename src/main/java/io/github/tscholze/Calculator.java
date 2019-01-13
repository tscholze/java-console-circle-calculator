package io.github.tscholze;

public class Calculator
{
    /**
     * Calculates the area if a circle by its radius.
     * @param radius Circle's radius
     * @return Calculated area
     */
    public static double calculateArea(double radius)
    {
        return Math.pow(radius, 2) * Math.PI;
    }
}
