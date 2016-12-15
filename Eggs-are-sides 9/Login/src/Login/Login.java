/**
 * Login is a class that has the following methods:
 * anmelden(), abmelden() and bearbeiten(); 
 *   
 * @class Login.java
 * @author Veselin Odzhov s0556006
 * @date 15.12.2016
 */
package Login;

public class Login 
{
	private boolean angemeldet = false;
	private String benutzer = "";
	private String password = "";
	
	/**
	 * @param angemeldet Uses global variable angemeldet to check if the user is already logged in; Set to true after a successful logout
	 * @param benutzer Username entered by the user to log in, should not be empty
	 * @param passwort Password entered by the user to log in, should not be empty
	 * @throws ZugriffUngueltigException Checks if the user is already logged in, if so, then prints out an exception (message)
	 */
	public void anmelden (String benutzer, String passwort) throws ZugriffUngueltigException
	{
		if(benutzer != "" && passwort != "")
		{
			if(!angemeldet)
			{
				this.benutzer = benutzer;
				this.password = passwort;
				angemeldet = true;		
			}
			else
			{
				throw new ZugriffUngueltigException("Sie sind schon angemeldet als: " + this.benutzer);
			}
		}
		else
		{
			throw new ZugriffUngueltigException("Benutzername und Password sollen nicht leer sein.");
		}
	}
	 
	/**
	 * @param angemeldet Uses global variable angemeldet to check if user is already logged in; Reset to false after a successful logout
	 * @param benutzer Username entered by the user to log in, reset to empty string after a successful logout
	 * @param passwort Password entered by the user to log in, reset to empty string after a successful logout
	 */
	public void abmelden()
	{
		if(this.benutzer != "" && this.password != "" && angemeldet == true)
		{
			this.benutzer = "";
			this.password = "";
			angemeldet = false;
			System.out.println ("Abmeldung erfolgreich!");
		}
	}
	
	/**
	 * @param benutzer If not an empty string, carries on
	 * @param password If not an empty string, carries on
	 * @param angemeldet If true, carries on; If false, prints out an exception (message)
	 * @throws KeineBerechtigungException In case user is not logged in, prints out an exception (message)
	 */
	public void bearbeiten() throws KeineBerechtigungException
	{
		if(this.benutzer != "" && this.password != "" && angemeldet == true)
		{
			System.out.print("\nDaten werden bearbeitet.\nProzess auf: ");
			for(int i = 1; i < 9; i++)
			{
				if(i != 8)
				{
					System.out.print((12*i+i) + "%... ");
				}
				else
				{
					System.out.println((12*i+4) + "%...\nProzess fertig.\n");
				}
			}
		}
		else
		{
			throw new KeineBerechtigungException("\nSie sollen sich erst anmelden, um diese Methode nutzen zu duerfen.");
		}
	}
}
