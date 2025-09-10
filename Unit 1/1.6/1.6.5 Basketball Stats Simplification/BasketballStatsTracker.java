public class BasketballStatsTracker
{
    public static void main(String[] args)
    {
        int totalPoints = 0;
        int shotsMade = 0;
        int shotsMissed = 0;
        
        int twoPointer = 2;
        int threePointer = 3;
        int freeThrow = 1;
        
        //Makes a two-pointer shot
        totalPoints += twoPointer;
        shotsMade ++;
        
        //Makes a three-pointer shot
        totalPoints += threePointer;
        shotsMade ++;
        
        //Misses a shot
        shotsMissed ++;
        
        //Makes two free throws
        totalPoints += freeThrow;
        totalPoints += freeThrow;
        shotsMade += 2;
        
        //Misses a shot
        shotsMissed ++;
        
        System.out.print("Total points scored: ");
        System.out.println(totalPoints);
        System.out.print("Total shots attempted: ");
        System.out.println(shotsMade);
    }
}
