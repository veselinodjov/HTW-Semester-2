package warteschlange;

public interface WarteschlangeSchnittstelle 
{
	/**
	 * f�gt ein Element (mit einem gegebenen Wert) ans Ende der Warteschlange hinzu
	 * @param value The value to be enqueued
	 */
	public abstract void enqueue(int value); 
	
	/**
	 * entnimmt das erste Element aus der Warteschlange und liefert seinen Wert zur�ck
	 */
	public abstract int dequeue();
	
	/**
	 * liefert den Wert des ersten Elements der Warteschlange zur�ck
	 */
	public abstract int first();
	
	/**
	 * liefert true zur�ck, wenn die Warteschlange leer ist
	 * @return true if empty, else false
	 */
	public abstract boolean isEmpty();
}
