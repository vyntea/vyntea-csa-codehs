import java.util.Scanner;

public class MadlibGenerator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Get a number
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.nextLine();
        
        // Get an adjective
        System.out.println("Enter an adjective: ");
        String adj = input.nextLine();
        
        // Get a noun 
        System.out.println("Enter a noun: ");
        String noun = input.nextLine();
        
        // Get a clothing iteam
        System.out.println("Enter a clothing item: ");
        String clothingItem = input.nextLine();
        
        // Get a location
        System.out.println("Enter a location: ");
        String location = input.nextLine();
        
        System.out.println(madLib(num, adj, noun, clothingItem, location));
    }
    
    // Returns the madlib sentence: 
    // "Yesterday I saw [number] [adjective] [noun] wearing [clothing item] at the [location]."
    public static String madLib(int num, String adj, String noun, String clothes, String place)
    {
        
        String sentence = "Yesterday, I saw ";
        
        // Add the number
        sentence += num + " ";
        sentence += adj + " ";
        sentence += noun + " wearing ";
        sentence += clothes + " at the ";
        sentence += place + ".";
        // Add the adjective 
        
        // Add the noun and the text before the clothing item
        
        // Add the clothing item and the text before the place
        
        // Add the place and a period
        
        return sentence;
    }
}
