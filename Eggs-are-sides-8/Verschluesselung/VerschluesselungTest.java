/**
 * Class VerschluesselungTest is a wrapper class,
 * 
 * testing the following classes/interfaces and their methods:
 * Chiffrierung, Caeser, Verschluesselung, Ciphering;
 *   
 * @class VerschluesselungTest.java
 * @author Veselin Odzhov s0556006
 * @date 02.12.2016
 */

package Verschluesselung;

public class VerschluesselungTest 
{
	public static void main(String args[])
	{
		Chiffrierung cipherone = new Caeser();
		String sone = "I wIll bE ciPHereD + only small letters here + abcdefghijklmnopqrstuvwxyz + ABCDEFGHIJKLMNOPQRSTUVWXYZ123[]!";
		String spone = Verschluesselung.verschluesseln(sone, cipherone);
		System.out.println("\n\t\t\t--------------------Testing Caeser method-------------------");
		System.out.printf("%nThe following text will be ciphered: %n'%s'%n",sone);
		System.out.printf("%nThe text after been ciphered: %n'%s'%n", Verschluesselung.verschluesseln(sone, cipherone));
		System.out.printf("%nThe text after been deciphered: %n'%s'%n%n", Verschluesselung.entschluesseln(spone, cipherone));
		System.out.println("\t\t\t------------------End Testing Caeser method-----------------\n");
		
		System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Chiffrierung ciphertwo = new Ciphering(alphabet);
		String stwo = "I wIll bE ciPHereD + only small letters here + abcdefghijklmnopqrstuvwxyz + ABCDEFGHIJKLMNOPQRSTUVWXYZ123[]!";
		String sptwo = Verschluesselung.verschluesseln(stwo, ciphertwo);
		System.out.println("\n\t\t\t------------------Testing Cipherung method------------------");
		System.out.printf("%nThe following text will be ciphered: %n'%s'%n",stwo);
		System.out.printf("%nThe text after been ciphered: %n'%s'%n", Verschluesselung.verschluesseln(stwo, ciphertwo));
		System.out.printf("%nThe text after been deciphered: %n'%s'%n%n", Verschluesselung.entschluesseln(sptwo, ciphertwo));
		System.out.println("\t\t\t----------------End Testing Cipherung method----------------\n");
	}
}
