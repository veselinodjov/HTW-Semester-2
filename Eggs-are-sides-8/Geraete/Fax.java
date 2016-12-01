/**
 * Fax is an interface, which has one parameter - faxsimulation,
 * which is a predefined string, and one method - senden,
 * which receives a string as an argument and returns nothing (void);
 *   
 * @interface Fax.java
 * @author Veselin Odzhov s0556006
 * @date 30.11.2016
 */
 

package interfaces;

public interface Fax 
{
	String faxsimulation ="Absender ist: %s%d%nDas Drucken wird simuliert%n%s%n";
	public void senden (String sendeRef);
}