/**
 * Kombigeraet is a class, which has the following parameters:
 * kombi - a predefined string("Kombigerät"),
 * kombikombi - a predefined string("Kombigerät Kombigerät"),
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
	String kombi = "Kombigerät";
	String kombikombi = "Kombigerät Kombigerät";
	@Override
	public void senden(String sendeRef) 
	{
		System.out.printf(faxsimulation,kombi,counter,sendeRef);		
	}

	@Override
	public void drucken(String druckRef) 
	{
		System.out.printf(drucksimulation,kombikombi,counter,druckRef);
	}

}
