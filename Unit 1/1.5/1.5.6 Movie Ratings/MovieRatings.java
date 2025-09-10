import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
       Scanner s = new Scanner(System.in);
       System.out.println("Enter movie rating (as a decimal)");
       double x = s.nextDouble();
       System.out.println(Math.round(x));
    }
}
