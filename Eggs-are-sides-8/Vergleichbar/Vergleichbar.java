/**
 * Interface Vergleichbar has one method: 
 * 
 * vergleicheMit(), 
 * which compares if the given as a parameter value (object of type - Vergleichbar)
 * is bigger than, equal to, or less than the main object itself, 
 * returning, respectively, an integer value of 1, 0, and -1;
 *   
 * @interface Vergleichbar.java
 * @author Veselin Odzhov s0556006
 * @date 01.12.2016
 */


package Vergleichbar;

public interface Vergleichbar 
{
	/**
	 * vergleicht this mit dem als Parameter uebergebenen Objekt
	 * @param obj übergebenes Objekt, mit dem this verglichen wird
	 * @return -1, falls this kleiner ist als das Parameterobjekt; 0, falls
 	 * beide Objekte gleich gross sind; 1, falls this groesser ist als das
 	 * Parameterobjekt
	 */
public abstract int vergleicheMit(Vergleichbar obj);
}
