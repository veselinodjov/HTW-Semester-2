package stapel;

import listen.Liste;

public class Stapel extends Liste implements StapelInterface 
{
	public Stapel()
	{
		super();
	}
	public Stapel(int wert)
	{
		super(wert);
	}
	
	/**
	 * legt ein Element (mit einem gegebenen Wert) oben auf den Stack
	 * @param wert the desired value to be pushed on top of the stack
	 */
	@Override
	public void push(int wert) 
	{
		this.addFirst(wert);
	}

	/**
	 * nimmt das oberste Element vom Stack herunter und gibt seinen Wert zurück
	 * @return the value of the popped element
	 */
	@Override
	public int pop() throws NullPointerException
	{
		return this.removeFirst();
	}

	/**
	 * liefert den Wert des obersten Elements des Stacks zurück
	 * @return the value of the top element
	 */
	@Override
	public int top() throws NullPointerException
	{
		return this.get(0);
	}

	/**
	 * liefert true zurück, wenn der Stack leer ist
	 * @return true if the stack is empty, else false
	 */
	@Override
	public boolean isEmpty() 
	{
		if(this.size() == 0)
			return true;
		else
			return false;
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
