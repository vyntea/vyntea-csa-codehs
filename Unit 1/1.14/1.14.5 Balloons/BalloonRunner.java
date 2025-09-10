public class BalloonRunner 
{
    public static void main(String[] args) 
    {
        // Create two balloon objects
        Balloon a = new Balloon(6.7, "a");
        Balloon b = new Balloon(6.7, "a");
        
        
        // Print out initial information of each balloon
        System.out.println(a);
        System.out.println(b);

        // Inflate first balloon
        a.inflate(10);
        // Change the color of second balloon
        b.changeColor("silver");

        // Print out final information of each balloon
        System.out.println(a);
        System.out.println(b);
                
    }
}
