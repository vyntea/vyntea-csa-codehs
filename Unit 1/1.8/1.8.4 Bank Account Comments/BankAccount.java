public class BankAccount 
{
    public static void main(String[] args) 
    {
        // Create an account with an initial balance of $100
        double myAccount = 100;

        //output current balance        
        System.out.print("Current balance: $");
        System.out.println(myAccount);

        //deposit $50, then print balance
        myAccount = myAccount + 50;
        System.out.print("Current balance: $");
        System.out.println(myAccount);

        //withdraw $30, then print balance
        myAccount = myAccount - 30;
        System.out.print("Current balance: $");
        System.out.println(myAccount);

        //withdraw $150, then print balance
        myAccount = myAccount - 150; 
        System.out.print("Current balance: $");
        System.out.println(myAccount);
    }
}
