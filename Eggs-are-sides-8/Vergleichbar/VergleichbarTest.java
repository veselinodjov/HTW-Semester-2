/**
 * Class VergleichbarTest is a wrapper class,
 * 
 * testing the following classes/interfaces and their methods:
 * Vergleichbar, NuetzlicheFunktionen, Integer, and VInteger;
 *   
 * @class VergleichbarTest.java
 * @author Veselin Odzhov s0556006
 * @date 01.12.2016
 */

package Vergleichbar;

public class VergleichbarTest {

	public static void main(String[] args) 
	{
		VInteger[] testarray1 = {new VInteger(11), new VInteger(22), new VInteger(33), 
								 new VInteger(44), new VInteger(55), new VInteger(66), 
								 new VInteger(77), new VInteger(88), new VInteger(99),
								 new VInteger(-11),new VInteger(-22),new VInteger(-23)};
		System.out.println("Smallest element is: " + NuetzlicheFunktionen.kleinstesElement(testarray1));
		
		VInteger[] testarray2 = {};
		System.out.println("Smallest element is: " + NuetzlicheFunktionen.kleinstesElement(testarray2));
	}
}
