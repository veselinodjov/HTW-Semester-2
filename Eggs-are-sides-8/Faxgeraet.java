/**
 * Faxgeraet is a class, which has two parameter - faxgeraet,
 * which is a predefined string("Fax"), and a static counter i,
 * referring to the number of created objects
 * 
 * Implements interface Fax, overrides and uses its methods
 *   
 * @class Faxgeraet.java
 * @author Veselin Odzhov s0556006
 * @date 30.11.2016
 */


package interfaces;

public class Faxgeraet implements Fax
{
	static int i = 0;
	private int counter = 0;
	Faxgeraet()
	{
		i++;
		counter = i;
	}
	String faxgeraet = "Fax";
	@Override
	public void senden(String sendeRef) 
	{
		System.out.printf(faxsimulation,faxgeraet,counter,sendeRef);
	}

}
