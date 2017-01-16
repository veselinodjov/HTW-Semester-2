package stapel_warteschlange;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */

public interface GenerischStapelInterface<T> 
{
	/**
	 * legt ein Element (mit einem gegebenen Wert) oben auf den Stack
	 * @param wert the desired value to be pushed on top of the stack
	 */
	public abstract void push(T wert); 
	
	/**
	 * nimmt das oberste Element vom Stack herunter und gibt seinen Wert zurück
	 * @return the value of the popped element
	 */
	public abstract T pop(); // 
	/**
	 * liefert den Wert des obersten Elements des Stacks zurück
	 * @return the value of the top element
	 */
	public abstract T top(); // 
	/**
	 * liefert true zurück, wenn der Stack leer ist
	 * @return true if the stack is empty, else false
	 */
	public abstract boolean isEmpty(); // 
}
