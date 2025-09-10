public class UnitConverter 
{
    /**
     * Converts kilometers to miles.
     * @param kilometers the length in kilometers
     * @return the equivalent length in miles
     */
    public static double kilometersToMiles(double kilometers) 
    {
        return kilometers * 0.621371;
    }

    /**
     * Converts miles to kilometers.
     * @param miles the length in miles
     * @return the equivalent length in kilometers
     */
    public static double milesToKilometers(double miles) 
    {
        return miles / 0.621371;
    }

    /**
     * Converts Celsius to Fahrenheit.
     * @param celsius the temperature in Celsius
     * @return the equivalent temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) 
    {
        return (celsius * 9/5) + 32;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * @param fahrenheit the temperature in Fahrenheit
     * @return the equivalent temperature in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5/9;
    }

    /**
     * Converts kilograms to pounds.
     * @param kilograms the weight in kilograms
     * @return the equivalent weight in pounds
     */
    public static double kilogramsToPounds(double kilograms) 
    {
        return kilograms * 2.20462;
    }

    /**
     * Converts pounds to kilograms.
     * @param pounds the weight in pounds
     * @return the equivalent weight in kilograms
     */
    public static double poundsToKilograms(double pounds) 
    {
        return pounds / 2.20462;
    }
}
