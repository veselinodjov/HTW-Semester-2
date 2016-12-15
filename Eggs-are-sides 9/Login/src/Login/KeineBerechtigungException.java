/**
 * An user defined "No authority" exception; 
 *   
 * @class KeineBerechtigungException.java
 * @author Veselin Odzhov s0556006
 * @date 15.12.2016
 */

package Login;

public class KeineBerechtigungException extends Exception
{	
	private static final long serialVersionUID = -5468947163710947852L;
	
	public KeineBerechtigungException()
	{
		System.out.println("Keine Berechtigung!");
	}
	
	public KeineBerechtigungException(String message)
	{
		super(message);
	}
}
