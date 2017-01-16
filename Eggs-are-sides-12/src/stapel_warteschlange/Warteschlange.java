package stapel_warteschlange;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */

public class Warteschlange<T> extends Liste<T> implements GenerischWarteschlangeInterface<T> 
{

	@Override
	public void enqueue(T value) 
	{
		this.addLast(value);
	}

	@Override
	public T dequeue() 
	{
		return this.removeFirst();
	}

	@Override
	public T first() 
	{
		return this.get(0);
	}

	@Override
	public boolean isEmpty() 
	{
		return this.size() == 0;
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
