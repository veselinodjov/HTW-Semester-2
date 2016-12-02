/**
 * Class Ciphering has one variable: 
 * 
 * (char) alphabet[], which represents the latin alphabet, 
 * made of non-capital letters only, and exact length of 26 indexes. 
 * As an object is being created, it should explicitly receive an aplhabet as argument,
 * which has been initialized in such a way, that: alphabet[0]->'a', alphabet[1]->'b',
 * alphabet[2]->'c', ..., alphabet[25]->'z'
 * 
 * Implements interface Chiffrierung, 
 * and overrides its methods.
 * 
 * @class Caeser.java
 * @author Veselin Odzhov s0556006
 * @date 02.12.2016
 */

package Verschluesselung;

public class Ciphering implements Chiffrierung
{
	private char[] alphabet;
	
	public Ciphering(char[] m)
	{
		if(m.length!=26)
		{
			System.out.println("Only original latin alphabet is accepted - 26 non-capital letters.");
		}
		else
		{
			alphabet = m;
		}
	}
	@Override
	public char chiffrieren(char zeichen) 
	{
		if(zeichen >= 97 && zeichen <= 122)
		{
			zeichen = alphabet[zeichen%26];
		}
		return zeichen;
	}
 
	@Override
	public char dechiffrieren(char zeichen) 
	{
		if(zeichen >= 97 && zeichen <= 122)
		{
			zeichen = alphabet[((((((zeichen%26)+1)+97)+1)+97)%26)];
		}
		return zeichen;
	}
}
