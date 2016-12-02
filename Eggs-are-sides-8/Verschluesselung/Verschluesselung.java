/**
 * Class Verschluesselung has two methods: 
 * 
 * verschluesseln(), which receives the original text and a key object of type Chiffrierung.
 * Returns the text ciphered, using the object.chiffrieren() method
 * 
 * entschluesseln(), which receives the ciphered text and a key object of type Chiffrierung.
 * Returns the text in its original form, using the object.dechiffrieren() method
 * 
 * @class Verschluesselung.java
 * @author Veselin Odzhov s0556006
 * @date 02.12.2016
 */

package Verschluesselung;

public class Verschluesselung 
{
	public static String verschluesseln(String klartext, Chiffrierung schluessel) 
	{
		String result="";
		for(int i = 0; i < klartext.length(); i++)
		{
			char c = schluessel.chiffrieren(klartext.charAt(i));
			result += c;
			
		}
		return result;
	}
	public static String entschluesseln(String geheimtext, Chiffrierung schluessel) 
	{
		String result="";
		for(int i = 0; i < geheimtext.length(); i++)
		{
			char c = schluessel.dechiffrieren(geheimtext.charAt(i));
			result += c;
			
		}
		return result;
	}
} 