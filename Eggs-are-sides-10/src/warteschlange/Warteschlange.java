package warteschlange;

import listen.Liste;

public class Warteschlange extends Liste implements WarteschlangeSchnittstelle 
{

	/**
	 * fügt ein Element (mit einem gegebenen Wert) ans Ende der Warteschlange hinzu
	 * @param value The value to be enqueued
	 */
	@Override
	public void enqueue(int value) 
	{
		this.addLast(value);
	}

	/**
	 * entnimmt das erste Element aus der Warteschlange und liefert seinen Wert zurück
	 */
	@Override
	public int dequeue() 
	{
		return this.removeFirst();
	}

	/**
	 * liefert den Wert des ersten Elements der Warteschlange zurück
	 */
	@Override
	public int first() 
	{
		return this.get(0);
	}

	/**
	 * liefert true zurück, wenn die Warteschlange leer ist
	 * @return true if empty, else false
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
    public String toString() {
        String print = "<--- ";

        for (int i = 0; i < this.size(); i++) {
            print += this.get(i) + " ";
        }

        print += "<---";

        return print;
    }
}
