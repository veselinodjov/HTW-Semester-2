/** 
 * Created by Veselin on 06/11/2016.
 */
public class EmployeeAndAzubiTest 
{
    public static void main(String args[]) 
    {
    	/**
    	 * 
    	 * Creating a new object of type Employee, and testing its methods
    	 */
        // Creating a1 object of type Employee with the following parameters
    	// Salary: 124, First name: Maria, Surname: Hernandes
    	Employee a1 = new Employee(1200, "Maria", "Jesus", "de", "la", "Cruz", "Hernandes");
        
        System.out.println(a1.getFirstname()); 	// prints out Maria
        System.out.println(a1.getSurname());	// prints out Hernandes
        System.out.println(a1.getSalary());		// prints out 1200
        System.out.println(a1.toString());		/* prints out
        
        										First name: Maria
												Surname: Hernandes
												Salary: 1200.0
												
												*/
        
        System.out.println("\n* * * * * * * * * * * * *\n");
        /**
         * 
         * Creating a new object of type Azubi, and testing its methods
         */
        
        // Creating a2 object of type Azubi with the following parameters
    	// Salary: 1200, First name: Maria, Surname: Hernandes, Qualification year: 2, Career: Programmer
        Azubi a2 = new Azubi(2, "Programmer", a1);
        
        System.out.println(a2.getYear());			// prints out 2
        System.out.println(a2.getCareer()); 		// prints out Programmer
        
        System.out.println("\nSalary before increase: " + a2.getSalary());	// prints out Salary before increase: 1200.0
        
        a2.setIncrease(300);						// increases salary by 300
        System.out.println("Salary post increase: " + a2.getSalary());	// prints out Salary post increase: 1500.00
        System.out.println("Salary increased by a total of: " + a2.getIncrease()); // prints out the amount salary has been increased by so far (300)
        a2.setIncrease(200);						// increases salary by another 200
        System.out.println("Salary post increase: " + a2.getSalary());	// prints out Salary post increase: 1700.00
        System.out.println("Salary increased by a total of: " + a2.getIncrease()); // prints out the amount salary has been increased by so far (500)
        
        System.out.println(a2.toString());			/* prints out
        											
        											First name: Maria
													Surname: Hernandes
													Salary: 1700.0
													Qualification year: 2
													Career: Programmer
													
        											*/
        System.out.println("\n* * * * * * * * * * * * *\n");
        /**
         * 
         * Now creating new objects of type Employee and Azubi and testing invalid input for their methods
         */
        
        // Creating a3 object of type Employee with the following parameters
    	// Salary: 1300, First name: Hans, Surname: Schmidt
        Employee a3 = new Employee(1300, "Hans", "Schmidt");
        
        System.out.println(a3.toString());			/* prints out
        
													First name: Hans
													Surname: Schmidt
													Salary: 1300.0
													
         											*/
        // Creating a4 object of type Azubi
        // Qualification's year is -2, should be displayed
        Azubi a4 = new Azubi(-2, "Painter", a3);
        System.out.println(a4.getYear());			// prints out 0
        a4.setYear(3);								// sets qualification's year to 3
        a4.setIncrease(-200);						// trying to increase salary by -200, invalid input
        System.out.println(a4.getSalary());			// prints out 1300.0 (salary was not affected by the negative increment)
        System.out.println(a4.toString());			/* prints out
        
        											First name: Hans
        											Surname: Schmidt
        											Salary: 1300.0
        											Qualification year: 3
        											Career: Painter
        											
         											*/
        System.out.println("\n* * * * * * * * * * * * *\n");
        /** 
          	Frank Walser (1.600,00Euro), 
			Eva Flink (1.650,00 Euro)  
			Hans Boss (4.000,00 Euro)
			Sven Vogel (Gehalt: 450,00 Euro) 
		*/
        Employee frankwalser = new Employee(1600, "Frank","Walser");
        System.out.println(frankwalser.toString());
        System.out.println("\n* * * * * * * * * * * * *\n");
        Employee evaflink = new Employee(1650, "Eva", "Flink");
        System.out.println(evaflink.toString());
        System.out.println("\n* * * * * * * * * * * * *\n");
        Employee hansboss = new Employee(4000, "Hans","Boss");
        System.out.println(hansboss.toString());
        System.out.println("\n* * * * * * * * * * * * *\n");
        Employee svogel = new Employee(450, "Sven","Vogel");
        Azubi svenvogel = new Azubi(1, "Auszubildende", svogel); 	// year 1 because of: "wurde bereits ein Ausbildungsvertrag vereinbart"
        System.out.println(svenvogel.toString());
        System.out.println("\n* * * * * * * * * * * * *\n");
        
        /**
         * 
         * Creating a new object to test all of its methods
         */
        Employee test1 = new Employee(0,"","");
                
        System.out.println("\nCurrent first name is: " + test1.getFirstname());
        test1.setFirstname("Michael");
        
        System.out.println("\nCurrent surname is: " + test1.getSurname());
        test1.setSurname("Bauer");
        
        System.out.println("\nCurrent salary is: " + test1.getSalary());
        test1.setSalary(2000);
        
        System.out.println("\nCurrent salary increase: " + test1.getIncrease());
        test1.setIncrease(500);
        
        System.out.println("\n" + test1.getClass());
        
        System.out.println(test1.toString());
        
        System.out.println("\n* * * * * * * * * * * * *\n");
        
        Azubi test2 = new Azubi(0, "",test1);
        
        System.out.println("\nCurrent first name is: " + test2.getFirstname());
        test2.setFirstname("Martin");
        
        System.out.println("\nCurrent surname is: " + test2.getSurname());
        test2.setSurname("Rose");
        
        System.out.println("\nCurrent salary is: " + test2.getSalary());
        test2.setSalary(3000);
        
        System.out.println("\nCurrent salary increase: " + test2.getIncrease());
        test2.setIncrease(400);
        
        System.out.println("\nCurrent qualification's year: " + test2.getYear());
        test2.setYear(6);
        
        System.out.println("\nCurrent career: " + test2.getCareer());
        test2.setCareer("Cook");
        
        System.out.println("\n" + test2.getClass());
        
        System.out.println(test2.toString());

    }
}
