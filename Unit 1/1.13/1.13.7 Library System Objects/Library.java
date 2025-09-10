public class Library 
{
    // Library attributes
    private int numBooks;
    private String name;
    private String address;

    // Constructor
    public Library(String LibName, String LibAddress, int LibNumBooks) 
    {
        numBooks = LibNumBooks;
        name = LibName;
        address = LibAddress;
    }

    // Method that automatically runs when object is printed
    public String toString() 
    {
        return "Library Name: " + name + "\nAddress: " + address + "\nTotal Books: " + numBooks + "\n";
    }
}
