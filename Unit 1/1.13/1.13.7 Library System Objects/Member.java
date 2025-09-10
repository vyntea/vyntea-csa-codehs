public class Member 
{
    // Member attributes
    private String name;
    private int id;
    private boolean hasOverdueBooks;

    // Constructor
    public Member(String memberName, int memberID, boolean overdueBooks) 
    {
        name = memberName;
        id = memberID;
        hasOverdueBooks = overdueBooks;
    }

    // Method that automatically runs when object is printed
    public String toString() 
    {
        return "Member Name: " + name + "\nMember ID: " + id + "\nOverdue Books: " + hasOverdueBooks + "\n";
    }
}
