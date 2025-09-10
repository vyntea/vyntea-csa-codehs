public class Averages
{
    public static void main(String[] args)
    {
       // Write your test code here:
       System.out.println(calculateAverage(6, 7));
       System.out.println(calculateAverage(6, 7, 4));
       System.out.println(calculateAverage(6, 7, 4, 1));
       
       
    }

   // Calculates the average with two input doubles
    public static double calculateAverage(double a, double b) {
        return (a + b) / 2;
        
        
        
        
    }

    // Calculates the average with three input doubles
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
        
        
        
        
        
    }

    // Calculates the average with four input doubles
    public static double calculateAverage(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
        
        
        
        
        
    }
}
