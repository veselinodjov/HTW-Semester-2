package stapel_warteschlange;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */

public class StapelTest {

	public static void main(String[] args) 
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\nInteger Stapel Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
		Stapel<Integer> st = new Stapel<>();
		
		st.push(4);
		st.push(7);
		st.push(1);
		
		System.out.println(st.toString() + "\n");		
		
		System.out.println("Stapel size = " + st.size() + " ? : " + (st.size()==3) + "\n");
		System.out.println("Popping: " + st.pop() + "\n");
		System.out.println("Peeking: " + st.top() + "\n");
		System.out.println("Stapel empty ? : " + st.isEmpty() + "\n");
		
		System.out.println(st.toString());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n     End Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n Float Stapel Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
		Stapel<Float> stk = new Stapel<>();
		
		stk.push(4.4f);
		stk.push(7.7f);
		stk.push(1.1f);
		
		System.out.println(stk.toString() + "\n");		
		
		System.out.println("Stapel size = " + stk.size() + " ? : " + (stk.size()==3) + "\n");
		System.out.println("Popping: " + stk.pop() + "\n");
		System.out.println("Peeking: " + stk.top() + "\n");
		System.out.println("Stapel empty ? : " + stk.isEmpty() + "\n");
		
		System.out.println(stk.toString());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n     End Testing\n~~~~~~~~~~~~~~~~~~~~~~\n");
	}

}
