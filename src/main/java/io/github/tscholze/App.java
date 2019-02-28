package io.github.tscholze;

import com.github.jankroken.commandline.CommandLineParser;
import com.github.jankroken.commandline.OptionStyle;
import com.github.jankroken.commandline.domain.InvalidCommandLineException;
import com.github.jankroken.commandline.domain.InvalidOptionConfigurationException;
import com.github.jankroken.commandline.domain.UnrecognizedSwitchException;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

/**
 * Circle calculator app.
 */
public class App 
{
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        try
        {
            // Parse launch configuration from arguments
            LaunchConfiguration configuration = CommandLineParser.parse(LaunchConfiguration.class, args, OptionStyle.LONG_OR_COMPACT);

            // Calculate area
            double radius = configuration.getRadius();
            double area = Calculator.calculateArea(radius);

            // Log result
            String message = String.format("The area of radius %.2f equals %.2f", radius, area);
            logger.info(message);
        }
        catch (InvalidCommandLineException | InvalidOptionConfigurationException | UnrecognizedSwitchException  | IllegalAccessException | InstantiationException | InvocationTargetException e)
        {
            // Log error
            logger.severe(e.getLocalizedMessage());
        }
    }
}
