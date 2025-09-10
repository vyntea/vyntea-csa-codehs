public class BookstoreReceiptRunner
{
    public static void main(String[] args)
    {
        //Create 2 BookstoreReceipt objects
        BookstoreReceipt a = new BookstoreReceipt("67", 67, "67");
        BookstoreReceipt b = new BookstoreReceipt("41", 41, "41");
        System.out.println(a.getReceipt());
        System.out.println(b.getReceipt());
        //Print out the receipts
    }
}
