/**
 * LoginTest is a wrapper class testing the following classes and their methods:
 * Login, ZugriffUngueltigException and KeineBerechtigungException; 
 *   
 * @class LoginTest.java
 * @author Veselin Odzhov s0556006
 * @date 15.12.2016
 */


package Login;
import java.util.Scanner;

public class LoginTest 
{
	public static void main (String[] args) 
	{
		Login login = new Login();
		Scanner input = new Scanner (System.in);
		String benutzer = "";
		String passwort = "";
		System.out.print ("Bitte geben Sie den Benutzernamen ein:");
		benutzer = input.next();
		System.out.println ("Bitte geben Sie das Passwort ein:");
		passwort = input.next();
		try 
		{
			System.out.println ("Sie werden angemeldet ...");
			login.anmelden (benutzer, passwort);
			System.out.println ("Anmeldung erfolgreich!");
		}
		catch (ZugriffUngueltigException ex) 
		{
			System.out.println (ex.getMessage());
		}
		try 
		{
			System.out.println ("Methode bearbeiten() wird aufgerufen ...");
			login.bearbeiten();
		}
		catch (KeineBerechtigungException ex) 
		{
			System.out.println (ex.getMessage());
		}
		System.out.println ("Sie werden abgemeldet ...");
		login.abmelden();
		try 
		{
			System.out.println ("Methode bearbeiten() wird aufgerufen ...");
			login.bearbeiten();
		}
		catch (KeineBerechtigungException ex) 
		{
			System.out.println (ex.getMessage());
		}
		input.close();
	}
}