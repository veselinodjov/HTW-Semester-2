/**
 * Kombigeraet is a class, which has the following parameters:
 * kombi - a predefined string("Kombiger�t"),
 * kombikombi - a predefined string("Kombiger�t Kombiger�t"),
 * and a static counter i, referring to the number of created objects
 * 
 * Implements interfaces Drucker and Fax, overrides and uses their methods
 *   
 * @interface Kombigeraet.java
 * @author Veselin Odzhov s0556006
 * @date 30.11.2016
 */


package interfaces;

public class Kombigeraet implements Drucker, Fax
{
	static int i = 0;
	private int counter = 0;
	Kombigeraet()
	{
		i++;
		counter = i;
	}
	String kombi = "Kombiger�t";
	String kombikombi = "Kombiger�t Kombiger�t";
	@Override
	public void senden(String sendeRef) 
	{
		System.out.printf(faxsimulation,kombi,counter);
		System.out.println(sendeRef);		
	}

	@Override
	public void drucken(String druckRef) 
	{
		System.out.printf(drucksimulation,kombikombi,counter);
		System.out.println(druckRef);
	}

}
