public class Balloon 
{
    private double radius; // Radius of the balloon in centimeters
    private String color; // Color of the balloon
    
    // Constructor to initialize the radius and color
    public Balloon(double initialRadius, String balloonColor) 
    {
        radius = initialRadius;
        color = balloonColor;
    }
    
    // Instance method to inflate the balloon by a specific amount
    public void inflate(double amount) 
    {
        radius += amount;
        // FINISH THIS METHOD
    }
    
    // Instance method to change the balloon's color
    public void changeColor(String newColor) 
    {
        color = newColor;
    }
    
    // Display balloon attributes when printed
    public String toString()
    {
        return "This balloon is " + color + " and has a radius of " +
        radius + "cm.";
    }
}
