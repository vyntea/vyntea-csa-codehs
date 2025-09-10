public class RectangleRunner
{
    public static void main(String[] args)
    {
        // Create rectangle objects from class
        Rectangle rect1 = new Rectangle(5, 8, "red");
        Rectangle rect2 = new Rectangle(2, 10, "blue");
        Rectangle rect3 = new Rectangle(10, 3, "violet");
        Rectangle rect4 = new Rectangle(10, 2, "violet");
        // Print out rectangle objects (calls toString method)
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println(rect4);
    }
}
