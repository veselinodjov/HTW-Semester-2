/**
 * Drucker is an interface, which has one parameter - drucksimulation,
 * which is a predefined string, and one method - drucken,
 * which receives a string as an argument and returns nothing (void);
 *   
 * @interface Druck.java
 * @author Veselin Odzhov s0556006
 * @date 30.11.2016
 */


package interfaces;

public interface Drucker 
{
	String drucksimulation ="%s%d meldet sich%nDas Drucken wird simuliert%n%s%n";
	public void drucken (String druckRef);
}
