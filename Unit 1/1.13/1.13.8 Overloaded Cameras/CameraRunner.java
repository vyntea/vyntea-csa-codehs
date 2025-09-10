public class CameraRunner 
{
    public static void main(String[] args) 
    {
       // Create at least 3 camera objects and print them out
       Camera a = new Camera(67, 41);
       Camera b = new Camera("67", 41);
       Camera c = new Camera(67, 41);
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
    }
}
