public class MathProgram
{
    public static void main(String[] args)
    {
        double power = Math.pow(5, 3);
        System.out.print("5^3 = ");
        System.out.println(power);

        double absolute = Math.abs(-20);
        System.out.print("Absolute value of -20 = ");
        System.out.println(absolute);

        double square = Math.sqrt(144);
        System.out.print("Square root of 144 = ");
        System.out.println(square);

        int random = (int)(Math.random() * 11) + 10;
        System.out.print("Random int between 10 and 20 = ");
        System.out.println(random);

        double m = Math.max(1, 2);
        System.out.print("");
        System.out.println(m);
        
        double a = Math.min(1, 2);
        System.out.print("");
        System.out.println(a);
        
        int b = Math.round(1.0);
        System.out.print("");
        System.out.println(b);
        
        double c = Math.ceil(2.0);
        System.out.print("");
        System.out.println(c);
        /** 
        * Repeat the above structure for 4 other methods
        * from the Math class -- using it correctly and
        * then printing the value with a string that
        * describes what it is doing.
        */











        
    }
}
