public class GeometryRunner 
{
    public static void main(String[] args)
    {
        System.out.print("Area of a circle with radius 5: ");
        System.out.print(Geometry.getCircleArea(5));
        System.out.println(" units squared");
        
        System.out.print("Volume of a sphere with radius 5: ");
        System.out.print(Geometry.getSphereVolume(5));
        System.out.println(" units cubed");
    }
}
