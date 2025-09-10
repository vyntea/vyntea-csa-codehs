public class BookstoreReceipt
{
    private String customerName;
    private int numberOfBooks;
    private double pricePerBook;
    private String thankYouMessage;
    
    public BookstoreReceipt(String name, int num, String message)
    {
        customerName = name;
        numberOfBooks = num;
        pricePerBook = 13.99;
        thankYouMessage = message; 
    }
    
    //Complete this method that returns a String of the receipt information
    public String getReceipt()
    {
        return "Customer Name: " + customerName + "\nNumber of Books: " + numberOfBooks + "\nTotal Price: $" + (numberOfBooks * pricePerBook) + "\n" + thankYouMessage;
    }
}
