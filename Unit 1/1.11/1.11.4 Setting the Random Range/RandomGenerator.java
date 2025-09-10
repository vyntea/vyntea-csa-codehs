public class RandomGenerator
{
    public static void main(String[] args)
    {
        // Prints a random integer between 20 - 25 inclusive
        int randomExample = (int)(Math.random() * 6) + 20;
        System.out.println(randomExample);

        // 1. Print a random roll of a 6-sided dice (i.e. numbers 1 - 6)
        // for a group who is playing a board game
        System.out.println((int)(Math.random() * 6) + 1);


        // 2. Print a random integer between 10 - 30 (inclusive) that
        // represents the points deducted when hit in a video game
        System.out.println((int)(Math.random() * 21) + 10);


        // 3. Print a random 0 or 1 that determines if a game character
        // successfully opens a treasure chest (1 = success)
        System.out.println((int)(Math.random()*2));


        // 4. Print a random integer between 1,000,000 and 2,000,000
        // (exclusive) that can be used as an encryption key
        System.out.println((int)(Math.random()*999999) + 1000001);
    

    }
}
