/**
 * Extends class Matrix;
 * Has one additional method: length();
 * toString() method overridden;
 * 
 * @class Vector.java
 * @author Veselin Odzhov s0556006
 * @date 23.11.2016
 */

package Matrix;

public class Vector extends Matrix
{

	public Vector(double[] elements) 
	{
		super(new double[][]{elements});
	}
	/**
	 * Method calculating the scalar product of a vector
	 * @return double value of scalar product of a vector or NaN if vector is empty.
	 */
	
	public double length()
	{
		double result=0;
		if(elements[0].length == 0)
	    {
			System.out.print("Vector is empty. Scalar product cannot be calculated.\n");
			return Double.NaN;
	    }
		else
		{
		for(int i=0; i<elements[0].length; i++)
		{
			result+=elements[0][i]*elements[0][i];
		}
		return Math.sqrt(result);
		}
	}
	/**
	 * @return String value with vector's elements.
	 */	
	public String toString()
	{
		 String result = "\n";
	       if(elements[0].length == 0)
	       {
	    	   result += "Vector is empty. Nothing to be printed here.\n";
	       }
	       for(int i = 0; i <= columns-1; i++)
	       {
	    	   if(i==0)
	    	   {
	    		   result += "( " + elements[0][i];
	    	   }
	    	   if(i>0 && i<columns-1)
	    	   {
	    	       result += ", " + elements[0][i] + " ";
	    	   }
	    	   if(i==columns-1)
	    	   {
	    		   result += ", " + elements[0][i] + " )";
	    	   }
	       }
	       result += "\n";
	       return result;
	}
}
