/**
 * Interface Chiffrierung has two methods:
 * 
 * chiffrieren(), which ciphers one letter at a time
 * and dechiffrieren(), which deciphers the letter
 * adequately to the way it was ciphered 
 * (the exact opposite of chiffrieren())
 *   
 * @interface Chiffrierung.java
 * @author Veselin Odzhov s0556006
 * @date 02.12.2016
 */

package Verschluesselung;

interface Chiffrierung 
{
	 public char chiffrieren(char zeichen);
	 public char dechiffrieren(char zeichen);
} 