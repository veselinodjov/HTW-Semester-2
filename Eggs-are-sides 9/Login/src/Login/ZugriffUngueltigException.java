/**
 * An user defined "Access denied" exception; 
 *   
 * @class ZugriffUngueltigException.java
 * @author Veselin Odzhov s0556006
 * @date 15.12.2016
 */

package Login;

public class ZugriffUngueltigException extends Exception
{
	private static final long serialVersionUID = -4707202762049206647L;

	public ZugriffUngueltigException() 
	{
		System.out.println("Zugriff ungueltig!");
	}
	
	public ZugriffUngueltigException(String message) 
	{
		super(message);
	}
}
