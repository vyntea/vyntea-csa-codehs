import java.util.Scanner;
public class TrafficEngineer
{
    public static void main(String[] args)
    {
        // Get user input for the distance of the onramp
        Scanner s = new Scanner(System.in);
        System.out.println("distance");
        int d = s.nextInt();
        // Calculate the time to accelerate down onramp
        double t = calculateTime(3, d);
        
        // Print out results
        System.out.println(t + "s");
        
    }

    // Calculates and returns the time it takes for an object to accelerate
    // a distance, given the initial velocity of the object is 0
    public static double calculateTime(double a, double d)
    {
        // Complete this method!
        return (Math.sqrt(2.0 * d / a));
    }
}
