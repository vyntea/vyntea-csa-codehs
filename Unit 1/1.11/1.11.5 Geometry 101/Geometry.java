public class Geometry
{
    // Calculates and returns the area of a circle with the input radius
    public static double getCircleArea(double radius)
    {
        return radius * radius * Math.PI;
        
    }
    
    // Calculates and returns the volume of a sphere with the input radius
    public static double getSphereVolume(double radius)
    {
        return radius * radius * radius * 4 * Math.PI / 3.0;
        
    }
}
