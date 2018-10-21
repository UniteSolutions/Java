package FirstProject;

public class FirstProject
{
    public static void main(String[] args)
    {
        int x, y;
        x = 2;
        y = 4;
        doubleValues(x,y);
        addTwoValues(x,y);
        subtractTwoValues(x,y);
        House h1 = new House(250_000, 4, 7);
        Person p1 = new Adult(123, "evan", "Goulden", "05/08/90", h1);
        System.out.println(p1.getAge() + " " + p1.getFirstName());
        System.out.println("£" + p1.house.getPrice());
    }
    private static void doubleValues(double x, double y)
    {
        System.out.println("double result for x*x = " + x*x + " double result for y*y = " + y*y);
    }
    private static void addTwoValues(double x, double y)
    {
        System.out.println("Addition of 2 values X and Y = " + x+y);
    }
    private static void subtractTwoValues(double x, double y)
    {
        System.out.println("Subtracting two values X - Y = " + (x - y));
    }
}
