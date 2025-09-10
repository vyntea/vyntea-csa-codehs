public class Rectangle
{
    // Attributes
    private int width;
    private int height;
    
    // Constructor
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    /**
     * This method defines what is printed when the
     * object variable is printed. It is automatically 
     * called when the object variable is printed in 
     * System.out.println().
     */
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
