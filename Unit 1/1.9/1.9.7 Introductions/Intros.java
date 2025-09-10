import java.util.Scanner;

public class Intros
{
    public static void main(String[] args)
    {
        // Write your code here:
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = s.nextLine();
        System.out.println("Please enter your grade: ");
        String g = s.nextLine();
        int grade = Integer.parseInt(g);
        System.out.println("Please enter a fun fact about yourself: ");
        String fact = s.nextLine();
        printIntroduction(name, grade, fact);
    }
    
    public static void printIntroduction(String name, int grade, String fact) {
        // Complete this method
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Fun Fact: " + fact);

        
    }
}
