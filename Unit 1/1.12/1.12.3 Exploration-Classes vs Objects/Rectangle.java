public class Rectangle 
{
    // Variables for attributes
    private int width;
    private int height;
    private String color;

    // Sets the values of the attributes when a rectangle 
    // object is created (known as the Constructor)
    public Rectangle(int w, int h, String c)
    {
        width = w;
        height = h;
        color = c;
    }
    
    /** 
    * Below are the list of "instance" methods for this class.
    * You'll learn more about defining and using them in 
    * other lessons. For now, just know that they are similar
    * to class methods, and that the toString() method allows
    * you to print information about the object in the standard
    * System.out.println() statement, as shown in the
    * RectangleRunner class.
    */

    // Method to access width
    public int getWidth()
    {
        return width;
    }

    // Method to access height
    public int getHeight()
    {
        return height;
    }
    
    // Method to access color
    public String getColor()
    {
        return color;
    }

    // Method to calculate and return the area
    public int calcArea() 
    {
        return width * height;
    }

    // Method to calculate and return the perimeter
    public int calcPerimeter()
    {
        return 2 * width + 2 * height;
    }

    // Method that is called when a rectangle object is printed
    public String toString()
    {
        return "A rectangle with a width of " + width + ", a height of " + height + ", and a color of " + color + "\n";
    }
}
