package io.github.tscholze;

import com.github.jankroken.commandline.CommandLineParser;
import com.github.jankroken.commandline.OptionStyle;
import com.github.jankroken.commandline.domain.InvalidCommandLineException;
import com.github.jankroken.commandline.domain.InvalidOptionConfigurationException;
import com.github.jankroken.commandline.domain.UnrecognizedSwitchException;

import java.lang.reflect.InvocationTargetException;

/**
 * Circle calculator app.
 */
public class App 
{
    public static void main( String[] args )
    {
        try
        {
            LaunchConfiguration configuration = CommandLineParser.parse(LaunchConfiguration.class, args, OptionStyle.LONG_OR_COMPACT);

            double radius = configuration.getRadius();
            double area = Calculator.calculateArea(radius);
            System.out.println(String.format("Area of radius %.2f equals %.2f", area, radius));
        }
        catch (InvalidCommandLineException | InvalidOptionConfigurationException | UnrecognizedSwitchException  | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            System.out.print(e.getLocalizedMessage());
        }
    }
}
