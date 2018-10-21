package FirstProject;

public class Person
{
    private int age;
    private String firstName;
    private String lastName;
    private String dob;
    House house;

    public Person(int age, String firstName, String lastName, String dob)
    {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Person(int age, String firstName, String lastName, String dob, House house)
    {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.house = house;
    }

    public int getAge()
    {
        return age;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getDob()
    {
        return dob;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }
}
