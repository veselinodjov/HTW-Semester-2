package stapel_warteschlange;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */

public class WarteschlangeTest {

	public static void main(String[] args) 
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nDouble Warteschlange Testing\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		Warteschlange<Double> ws = new Warteschlange<>();
		
		ws.enqueue(6.6);
		ws.enqueue(8.8);
		ws.enqueue(5.5);
		
		System.out.println(ws.toString() + "\n");
		
		
		System.out.println("Warteschlange size = " + ws.size() + " ? : " + (ws.size()==3) + "\n");
		System.out.println("Popping: " + ws.removeLast() + "\n");
		System.out.println("Peeking: " + ws.get(1) + "\n");
		System.out.println("Warteschlange empty ? : " + ws.isEmpty() + "\n");
		
		System.out.println(ws.toString());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n     End Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nCharacter Warteschlange Testing\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		Warteschlange<Character> wsl = new Warteschlange<>();
		
		wsl.enqueue('h');
		wsl.enqueue('i');
		wsl.enqueue('t');
		
		System.out.println(wsl.toString() + "\n");
		
		
		System.out.println("Warteschlange size = " + wsl.size() + " ? : " + (wsl.size()==3) + "\n");
		System.out.println("Popping: " + wsl.removeLast() + "\n");
		System.out.println("Peeking: " + wsl.get(1) + "\n");
		System.out.println("Warteschlange empty ? : " + wsl.isEmpty() + "\n");
		
		System.out.println(wsl.toString());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n     End Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
	}

}
