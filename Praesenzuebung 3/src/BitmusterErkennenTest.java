import java.util.Scanner;
public class BitmusterErkennenTest 
{
	public static void main(String[] args) 
	{
	    long a; 

	    Scanner in = new Scanner(System.in);

	    System.out.println("Geben Sie eine Nummer ein: ");
	    a=in.nextLong();
	    
	    System.out.println("Enden Ihre Nummer auf 01 bitweise?: " + BitmusterErkennen.letzteBits(a));
	    
	}
}
