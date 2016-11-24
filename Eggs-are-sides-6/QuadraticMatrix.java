/**
 * Extends class Matrix;
 * Creates a quadratic matrix; 
 * Has one additional method: pow(int p);
 * toString() method overridden;
 * 
 * @class QuadraticMatrix.java
 * @author Veselin Odzhov s0556006
 * @date 23.11.2016
 */

package Matrix;

public class QuadraticMatrix extends Matrix
{

	public QuadraticMatrix(int dim, double[][] elements) 
	{
		super(dim, elements);		
	}
	
	/**
	 * Method calculating a matrix to the power of 'p'
	 * @param p power the current matrix is going to be elevated to
	 * @return a matrix of type Matrix; If power is 0 returns identity matrix, else (M)^p; 
	 * By invalid input - a warning message and null;
	 */
	
	public Matrix pow(int p)
	{
		Matrix result = new Matrix(elements);
		if(p==0)
		{
			Matrix temp = result;
			for(int i=0; i<temp.rows;i++)
			{
				for(int j=0; j<temp.columns; j++)
				{
					if(i==j)
					{
						temp.elements[i][j] = 1;
					}
					else
					{
						temp.elements[i][j] = 0;
					}
				}
			}
			result = temp;
		}
		if(p>0)
		{
			Matrix temp = new Matrix(elements);
			for(int i=1; i<p; i++)
			{
				temp = temp.multiply(result);
			}
			result = temp;
		}
		if(p<0)
		{
			System.out.println("Exponent cannot be negative. Minimum allowed value is 0.");
			Matrix temp = new Matrix(elements);
			result = temp;
		}
		return result;
	}
	
	/**
	 * @return String value with quadratic matrix' elements.
	 */	
	public String toString()
	{
		   return super.toString();
	}
}
