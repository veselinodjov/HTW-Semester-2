/**
 * Created by Veselin on 06/11/2016.
 */
public class Employee
{
    private String surname;
    private String firstname;
    private double salary;
    private double increase;

    public Employee(double slr, String... fullname)
    {
    	if(salary >= 0)
            this.salary = slr;
        else
            System.out.println("Salary cannot be negative.");
        firstname = fullname[0];
        surname = fullname[fullname.length-1];
    }

    public String toString()
    {
    	String output = "\nFirst name: " + getFirstname();
    	output += "\nSurname: " + getSurname();
    	output += "\nSalary: " + getSalary();
    	return output;
    }
    public void setSurname(String surname)
    {
    	System.out.println("\nSurname set / changed to: " + surname);
        this.surname = surname;
    }

    public void setFirstname(String firstname)
    {
    	System.out.println("\nFirst name set / changed to: " + firstname);
        this.firstname = firstname;
    }

    public void setSalary(double salary)
    {
        if(salary >= 0)
            this.salary = salary;
        else
            System.out.println("\nSalary cannot be negative.");
    }

    public String getSurname()
    {

        return surname;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public double getSalary()
    {
        return salary;
    }
    
    public double getIncrease()
    {
    	return increase;
    }
	public void setIncrease(double inc) 
	{
		if(inc>=0)
		{
			System.out.println("Increasing salary by: " + inc);
			this.salary += inc;
			increase += inc;
		}
		else
			System.out.println("Invalid input for salary increase. Amount cannot be negative.");
	}
}

