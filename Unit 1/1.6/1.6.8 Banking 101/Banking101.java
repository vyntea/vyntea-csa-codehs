import java.util.Scanner;

public class Banking101
{
    public static void main(String[] args)
    {   
        // Write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an initial balance: ");
        double x = s.nextDouble();
        System.out.println("Initial balance: $" + x);
        x *= 1.03;
        System.out.println("Balance after interest: $" + x + "\nPlease enter a deposit amount: ");
        double d = s.nextDouble();
        x += d;
        x *= 1.03;
        System.out.println("Final balance after interest: " + x);
    }
}
