package stapel_warteschlange;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */

public class Stapel<T> extends Liste<T> implements GenerischStapelInterface<T> 
{
	public Stapel()
	{
		super();
	}
	public Stapel(T wert)
	{
		super(wert);
	}
	@Override
	public void push(T wert) 
	{
		this.addFirst(wert);
	}

	@Override
	public T pop() throws NullPointerException
	{
		return this.removeFirst();
	}

	@Override
	public T top() throws NullPointerException
	{
		return this.get(0);
	}

	@Override
	public boolean isEmpty() 
	{
		return this.size() == 0;
	}
	
	@Override
	public String toString()
	{
		String print = "";
		for(int i = 0; i < this.size(); i++)
			{
				print = print + "** " + this.get(i) + " **\n";
			}
		print += "*******";
		return print;
	}
}
