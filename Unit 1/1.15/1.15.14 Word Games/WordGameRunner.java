import java.util.Scanner;

public class WordGameRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        // Scramble it and print out scrambled word
        System.out.println("Scrambled word: " + WordGames.scramble(word));
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();
        System.out.println("Enter another word: ");
        String anotherWord = input.nextLine();
        
        // Add random word at index and print out the word
        System.out.println("Banana split!: " + WordGames.bananaSplit(word, idx, anotherWord));
        
        // Ask for a character
        // Ask for random word
        System.out.println("Enter a character in " + word + ": ");
        String letter = input.nextLine();
        System.out.println("Enter another word: ");
        anotherWord = input.nextLine();
        
        // Add random word at character and print out the word
        System.out.println("Banana split!: " + WordGames.bananaSplit(word, letter, anotherWord));
    }
}
