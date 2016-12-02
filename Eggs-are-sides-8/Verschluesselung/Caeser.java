/**
 * Class Caeser has one variable: 
 * 
 * (int) key, according to which the ciphering is going to
 * take place, has initial value of 3 (basic Caeser),
 * but can be initialized by user, if needed.
 * 
 * Implements interface Chiffrierung, 
 * and overrides its methods.
 * 
 * @class Caeser.java
 * @author Veselin Odzhov s0556006
 * @date 02.12.2016
 */

package Verschluesselung;

public class Caeser implements Chiffrierung
{
	private int key = 3;
	public Caeser()
	{
		
	}
	
	public Caeser(int key)
	{
		this.key = key;
	}
	
	@Override
	public char chiffrieren(char zeichen) 
	{
		if(zeichen >= 97 && zeichen <= 122)
		{
			zeichen = (char) (((zeichen+key) > 122) ? (zeichen+key-26):(zeichen+key));
		}
		return zeichen;
	}
	
	@Override
	public char dechiffrieren(char zeichen) 
	{
		if(zeichen >= 97 && zeichen <= 122)
		{
			zeichen = (char) (((zeichen-key) < 97) ? (zeichen-key+26):(zeichen-key));
		}
		return zeichen;
	}
}
