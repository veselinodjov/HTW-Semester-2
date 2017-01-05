package stapel;

public class StapelTest {

	public static void main(String[] args) 
	{
		Stapel stapel = new Stapel();
		stapel.push(1);
		stapel.push(2);
		stapel.push(3);
		stapel.push(4);
		
		System.out.println(stapel.toString());
	}
}
