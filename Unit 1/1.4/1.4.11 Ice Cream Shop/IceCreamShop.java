import java.util.Scanner;

public class IceCreamShop
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double price = 2.50;
        System.out.println("What flavor ice cream would you like?");
        String flavor = s.nextLine();
        System.out.println("How many scoops would you like?");
        int scoops = s.nextInt();
        double cost = price * scoops;
        System.out.println("Order summary:\nFlavor: " + flavor + "\nNumber of Scoops: " + scoops + "\nTotal: " + cost);
    }
}
