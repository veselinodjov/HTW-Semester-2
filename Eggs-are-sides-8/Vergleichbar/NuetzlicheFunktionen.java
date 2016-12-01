/**
 * Class NuetzlicheFunktionen has one method: 
 * 
 * kleinstesElement(),
 * which receives an array of type Vergleichbar as argument, 
 * and returns its smallest element. If the array is empty, 
 * prints out a warning message and returns null;
 *   
 * @class NuetzlicheFunktionen.java
 * @author Veselin Odzhov s0556006
 * @date 01.12.2016
 */


package Vergleichbar;

public class NuetzlicheFunktionen 
{
	/**
	 * bestimmt ein kleinstes (auf Basis der Vergleichbar-Implementierung)
 	 * Element des Parameter-Arrays
	 * @param array übergebenes Array
	 * @return ein kleinstes Element des übergebenen Arrays
	 */
public static Vergleichbar kleinstesElement(Vergleichbar[] array) 
	{
		if(array.length == 0)
		{
			System.out.println("\nArray is empty. Nothing to be compared here.");
			return null;
		}
		else
		{
			Vergleichbar smallest = array[0];
			for(Vergleichbar elem : array)
			{
				smallest = (elem.vergleicheMit(smallest) == -1) ? elem : smallest;
			}
			return smallest;
		}
	}
}