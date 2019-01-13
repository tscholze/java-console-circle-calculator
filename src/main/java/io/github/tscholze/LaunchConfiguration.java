package io.github.tscholze;

import com.github.jankroken.commandline.annotations.*;

public class LaunchConfiguration
{
    private double radius;

    /**
     * Gets the radius.
     * @return radius value.
     */
    public double getRadius()
    {
        return radius;
    }

    /**
     * Sets the radius.
     */
    @Option
    @ShortSwitch("r")
    @LongSwitch("radius")
    @SingleArgument
    @Required
    public void setRadius(String radius)
    {
        this.radius = Double.valueOf(radius);
    }
}
