/**
 * Class Integer has two methods: 
 * 
 * getWert(), 
 * which is a getter method for the variable (int) wert, 
 * 
 * and toString(), 
 * which is an overridden method that returns 
 * the value of the varialbe wert as a string 
 *   
 * @class Integer.java
 * @author Veselin Odzhov s0556006
 * @date 01.12.2016
 */


package Vergleichbar;

public class Integer 
{
	private int wert;
	
	public Integer(int w)
	{
		wert = w;
	}
	public int getWert() 
	{
		return wert;
	}
	
	public String toString()
	{
		return String.valueOf(this.getWert());
		
	}
}
