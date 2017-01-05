package warteschlange;

public class WarteschlangeTest 
{
	public static void main(String[] args) 
	{
		Warteschlange warteschlange = new Warteschlange();
		
		warteschlange.enqueue(1);
		warteschlange.enqueue(2);
		warteschlange.enqueue(3);
		warteschlange.enqueue(4);
		
		System.out.println(warteschlange.toString());
	}
}
