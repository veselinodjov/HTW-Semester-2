
public class Azubi extends Employee
{
	private int year;
	private String career;
	
	public Azubi (int year, String career, Employee emp)
	{
		super(emp.getSalary(), emp.getFirstname(), emp.getSurname());
		if(year>0)
			this.year = year;
		else
			System.out.println("Qualification's year cannot be negative.");
		this.career = career;
	}
	
	
	public String toString()
	{
		String output = super.toString();
		output += "\nQualification year: " + getYear();
		output += "\nCareer: " + getCareer() + "\n";
		return output;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) 
	{
		if(year>=0)
		{
			System.out.println("Qualification's year set / changed to: " + year);
			this.year = year;
		}
		else
			System.out.println("Qualification's year cannot be negative.");
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) 
	{
		System.out.println("Career set / changed to: " + career);
		this.career = career;
	}
}
