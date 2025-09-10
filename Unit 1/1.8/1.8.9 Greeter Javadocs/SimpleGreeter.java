public class SimpleGreeter 
{
    public static void main(String[] args) 
    {
        String person1 = "Maria";
        String person2 = "Julian";

        greetEnglish(person1);
        introduce(person1, person2);
    }

    /**
     * Greets a person in English by printing "Hello" followed by their name.
     *
     * <p><strong>Precondition:</strong> The name parameter must not be null.</p>
     * <p><strong>Postcondition:</strong> Prints a greeting message to the console.</p>
     *
     * @param name The name of the person to greet.
     */
    public static void greetEnglish(String name) 
    {
        System.out.print("Hello ");
        System.out.println(name);
    }

    /**
     * Introduces one person to another by printing a message in the format:
     * "[name1], meet [name2]".
     *
     * <p><strong>Precondition:</strong> Both name1 and name2 must not be null.</p>
     * <p><strong>Postcondition:</strong> Prints an introduction message to the console.</p>
     *
     * @param name1 The name of the person being introduced.
     * @param name2 The name of the person they are being introduced to.
     */
    public static void introduce(String name1, String name2) 
    {
        System.out.print(name1);
        System.out.print(", meet ");
        System.out.println(name2);
    }
}
