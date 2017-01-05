package listen;

public class ListeTest {

	public static void main(String[] args) 
	{
		Liste list = new Liste();
	
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		
		System.out.println(list.toString());
	}
}
