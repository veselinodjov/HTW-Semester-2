package warteschlange;

public interface WarteschlangeSchnittstelle 
{
	/**
	 * fügt ein Element (mit einem gegebenen Wert) ans Ende der Warteschlange hinzu
	 * @param value The value to be enqueued
	 */
	public abstract void enqueue(int value); 
	
	/**
	 * entnimmt das erste Element aus der Warteschlange und liefert seinen Wert zurück
	 */
	public abstract int dequeue();
	
	/**
	 * liefert den Wert des ersten Elements der Warteschlange zurück
	 */
	public abstract int first();
	
	/**
	 * liefert true zurück, wenn die Warteschlange leer ist
	 * @return true if empty, else false
	 */
	public abstract boolean isEmpty();
}
