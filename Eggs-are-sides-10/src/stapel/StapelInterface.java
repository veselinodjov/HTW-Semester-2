package stapel;

public interface StapelInterface 
{
	/**
	 * legt ein Element (mit einem gegebenen Wert) oben auf den Stack
	 * @param wert the desired value to be pushed on top of the stack
	 */
	public abstract void push(int wert); 
	
	/**
	 * nimmt das oberste Element vom Stack herunter und gibt seinen Wert zur�ck
	 * @return the value of the popped element
	 */
	public abstract int pop(); // 
	/**
	 * liefert den Wert des obersten Elements des Stacks zur�ck
	 * @return the value of the top element
	 */
	public abstract int top(); // 
	/**
	 * liefert true zur�ck, wenn der Stack leer ist
	 * @return true if the stack is empty, else false
	 */
	public abstract boolean isEmpty(); // 
}
