public class Calculator
{
    /**
    * Calculates the slope between two points
    * @param x1 - the x-coordinate of the first point
    * @param y1 - the y-coordinate of the first point
    * @param x2 - the x-coordinate of the second point
    * @param y2 - the y-coordinate of the second point
    * @return slope - the calculated slope between the two points
    */
    public static double slope(double x1, double y1, double x2, double y2)
    {
        double slope = (y1 - y2) / (x1 - x2);
        return slope;
    }

    /**
    * Calculates the distance between two points
    * @param x1 - the x-coordinate of the first point
    * @param y1 - the y-coordinate of the first point
    * @param x2 - the x-coordinate of the second point
    * @param y2 - the y-coordinate of the second point
    * @return distance - the calculated distance between the two points
    */
    public static double distance(double x1, double y1, double x2, double y2)
    {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    /**
    * Calculates the two real roots of a quadratic equation Ax^2 + Bx + C = 0
    * @param a - the A coefficient in quadratic equation
    * @param b - the b coefficient in quadratic equation
    * @param c - the c coefficient in quadratic equation
    * @return a string composed of the first and second real roots
    */
    public static String quadRoots(double a, double b, double c)
    {
        double first = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double second = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return first + " and " + second;
    }
}
