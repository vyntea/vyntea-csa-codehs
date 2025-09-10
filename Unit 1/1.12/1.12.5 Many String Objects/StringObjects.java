public class StringObjects
{
    public static void main(String[] args)
    {
        // Part 1: Create two string variables and a third that
        // references the first:
        String stringOne = "67";
        String stringTwo = "41";
        String stringThree = stringOne;


        // Part 2: Assign a new value to stringOne variable:
        stringOne = "93";
        

        // Part 3: Print out the values of all three string variables:
        System.out.println(stringOne);
        System.out.println(stringTwo);
        System.out.println(stringThree);
    }
}
