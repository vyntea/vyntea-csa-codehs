import java.util.Scanner;

public class NameTagGenerator
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String a = s.nextLine();
        System.out.println("Enter a name: ");
        String b = s.nextLine();
        displayNameTag(a);
        displayNameTag(b);
        System.out.println("Are the two names the same?: " + (a.equals(b)));
    }
    
    
    /* Takes in a person's name and then 
    * prints a nametag, which includes the following:
    * Name
    * Number of characters in the name
    * Last letter in the name
    */
    public static void displayNameTag(String name)
    {
        System.out.println("****************");
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length() + " characters");
        System.out.println("Last letter: " + name.charAt(name.length() - 1));
        System.out.println("****************");
    }
}
