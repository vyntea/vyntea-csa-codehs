public class HomeworkTime
{
    public static void main(String[] args)
    {
        int hours = 2;
        int minutes = 30;
        int seconds = 45;
        
        // Add your code here
        seconds += minutes * 60 + hours * 3600;
        System.out.println(seconds);
    }
}
