import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the author's name as 'Last name, First name': ");
        String name = s.nextLine();
        System.out.println("Enter the year the book was published: ");
        String year = s.nextLine();
        System.out.println("Enter the title of the book: ");
        String book_title = s.nextLine();
        System.out.println("Enter the publisher of the book: ");
        String publisher = s.nextLine();
        System.out.println(name + ". " + book_title + ".\n" + publisher + ", " + year + ".");
    }
}
