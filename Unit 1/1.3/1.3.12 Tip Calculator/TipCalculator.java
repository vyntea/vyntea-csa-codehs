public class TipCalculator
{
    public static void main(String[] args)
    {
        double meal = 25.99;
        double appetizer = 6.50;
        double drink = 3.99;
        
        double fifteenP = 0.15;
        double twentyP = 0.20;
        double twentyFiveP=0.25;
        double totalCost = meal+appetizer+drink;
        System.out.println("Total cost of the meal: "+totalCost);
        System.out.println("15% tip amount: "+totalCost*fifteenP);
        System.out.println("20% tip amount: "+totalCost*twentyP);
        System.out.println("25% tip amount: "+totalCost*twentyFiveP);
        
    }
}
