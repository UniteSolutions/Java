package FirstProject;

public class House
{
    private double price;
    private int bedRooms;
    private int bathRooms;

    public House()
    {
        // Default Constructor.
    }

    public House(double price, int bedRooms, int bathRooms)
    {
        this.price = price;
        this.bedRooms = bedRooms;
        this.bathRooms = bathRooms;
    }
    public double getPrice()
    {
        return price;
    }

    public int getBedRooms()
    {
        return bedRooms;
    }

    public int getBathRooms()
    {
        return bathRooms;
    }
}
