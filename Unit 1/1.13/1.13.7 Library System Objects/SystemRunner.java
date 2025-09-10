public class SystemRunner
{
    public static void main(String[] args)
    {
        // Create a library, book, and member object:
        
        Book b = new Book("A", "A", 67);
        Library l = new Library("A", "A", 67);
        Member m = new Member("A", 67, false);
        // Print out each object:
        System.out.println(b);
        System.out.println(b);
        System.out.println(b);
        
    }
}
