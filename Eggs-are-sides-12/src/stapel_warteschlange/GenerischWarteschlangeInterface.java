package stapel_warteschlange;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */

public interface GenerischWarteschlangeInterface<T> 
{
	/**
	 *  f�gt ein Element (mit einem gegebenen Wert) ans Ende der Warteschlange hinzu
	 * @param value the value to be enqueued
	 */
	public abstract void enqueue(T value);
	
	/**
	 *  entnimmt das erste Element aus der Warteschlange und liefert seinen Wert zur�ck
	 * @return the dequeued element
	 */
	public abstract T dequeue();
	
	/**
	 *  liefert den Wert des ersten Elements der Warteschlange zur�c
	 * @return the first element of the queue
	 */
	public abstract T first();

	/**
	 * liefert true zur�ck, wenn die Warteschlange leer ist
	 * @return true if empty, else false
	 */
	public abstract boolean isEmpty();

}
