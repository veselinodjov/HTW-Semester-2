package stapel_warteschlange;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class StapelWartechlangeJUnitTest {

	@Test
	public void StapelTest() 
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\nInteger Stapel Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
		Stapel<Integer> st = new Stapel<>();
		
		st.push(4);
		st.push(7);
		st.push(1);
		
		System.out.println(st.toString() + "\n");		
		
		assertEquals(3, st.size());
		System.out.println("Popping: " + st.pop() + "\n");
		System.out.println("Peeking: " + st.top() + "\n");
		assertFalse(st.isEmpty());
		
		System.out.println(st.toString());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n     End Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n Float Stapel Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Stapel<Float> stk = new Stapel<>();
		
		stk.push(4.4f);
		stk.push(7.7f);
		stk.push(1.1f);
		
		System.out.println(stk.toString() + "\n");		
		
		assertEquals(3, stk.size());
		System.out.println("Popping: " + stk.pop() + "\n");
		System.out.println("Peeking: " + stk.top() + "\n");
		assertFalse(stk.isEmpty());
		
		System.out.println(stk.toString());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n     End Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
	}
	
	@Test
	public void WartecschlangeTest()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nDouble Warteschlange Testing\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		Warteschlange<Double> ws = new Warteschlange<>();
		
		ws.enqueue(6.6);
		ws.enqueue(8.8);
		ws.enqueue(5.5);
		
		System.out.println(ws.toString() + "\n");
		
		
		assertEquals(3, ws.size());
		System.out.println("Popping: " + ws.removeLast() + "\n");
		System.out.println("Peeking: " + ws.get(1) + "\n");
		assertFalse(ws.isEmpty());
		
		System.out.println(ws.toString());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n     End Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nCharacter Warteschlange Testing\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		Warteschlange<Character> wsl = new Warteschlange<>();
		
		wsl.enqueue('h');
		wsl.enqueue('i');
		wsl.enqueue('t');
		
		System.out.println(wsl.toString() + "\n");
		
		
		assertEquals(3, wsl.size());
		System.out.println("Popping: " + wsl.removeLast() + "\n");
		System.out.println("Peeking: " + wsl.get(1) + "\n");
		assertFalse(wsl.isEmpty());
		
		System.out.println(wsl.toString());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n     End Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
	}

}
