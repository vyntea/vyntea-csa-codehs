public class UnitRunner
{
    public static void main(String[] args)
    {
        double fahrenheit = UnitConverter.celsiusToFahrenheit(0);
        System.out.print("Fahrenheit: ");
        System.out.println(fahrenheit);

        double kilograms = UnitConverter.poundsToKilograms(20);
        System.out.print("Kilograms: ");
        System.out.println(kilograms);

        double kilometers = UnitConverter.milesToKilometers(65);
        System.out.print("Kilometers: ");
        System.out.println(kilometers);        
    }
}
