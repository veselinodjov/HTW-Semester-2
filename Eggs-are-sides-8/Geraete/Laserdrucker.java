/**
 * Laserdrucker is a class, which has two parameter - laserdrucker,
 * which is a predefined string("Drucker Laser"), and a static counter i,
 * referring to the number of created objects
 * 
 * Implements interface Drucker, overrides and uses its methods
 *   
 * @class Laserdrucker.java
 * @author Veselin Odzhov s0556006
 * @date 30.11.2016
 */


package interfaces;

public class Laserdrucker implements Drucker
{
	static int i = 0;
	private int counter = 0;
	Laserdrucker()
	{
		i++;
		counter = i;
	}
	String laserdrucker = "Drucker Laser";
	
	@Override
	public void drucken(String druckRef) 
	{
		System.out.printf(drucksimulation,laserdrucker,counter,druckRef);
	}
}
