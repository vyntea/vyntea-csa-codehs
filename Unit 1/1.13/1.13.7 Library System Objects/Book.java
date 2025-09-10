public class Book 
{
    // Book attributes
    private String title;
    private String author;
    private int numPages;

    // Constructor
    public Book(String bookTitle, String bookAuthor, int bookNumPages) 
    {
        title = bookTitle;
        author = bookAuthor;
        numPages = bookNumPages;
    }

    // Method that automatically runs when object is printed
    public String toString() 
    {
        return title + " by " + author + ", " + numPages + " pages\n";
    }
}
