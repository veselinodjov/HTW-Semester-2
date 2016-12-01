/**
 * Class VInteger is an extension to class Integer,
 * implementing interface Vergleichbar;
 * 
 * Overrides only one method: vergleicheMit();
 * 
 * @class VInteger.java
 * @author Veselin Odzhov s0556006
 * @date 01.12.2016
 */

package Vergleichbar;

public class VInteger extends Integer implements Vergleichbar
{

	public VInteger(int w) 
	{
		super(w);
	}

	@Override
	public int vergleicheMit(Vergleichbar obj) 
	{
		if(this.getWert() > ((VInteger) obj).getWert())
		{
			return 1;
		}
		else
		{
			if(this.getWert() == ((VInteger) obj).getWert())
			{
				return 0;
			}
			else
			{
				return -1;
			}
		}
	}
}