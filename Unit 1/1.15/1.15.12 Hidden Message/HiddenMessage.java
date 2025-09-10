public class HiddenMessage
{
    public static void main(String[] args)
    {
        String quote1 = "Coding like poetry";
        String quote2 = "should be short";
        String quote3 = "and concise.";
        String author = "Santosh Kalwar";
        
        //Write your code here!
        System.out.println(author.substring(1, 2) + quote1.substring(7, 8) + quote3.substring(0, 1) + quote3.substring(1, 2) + quote3.substring(3, 4) + author.substring(3, 4) + quote2.substring(3, 4) + quote2.substring(13, 14) + quote1.substring(3, 4)
         + quote3.substring(1, 2) + quote1.substring(5, 6));
    }
}
