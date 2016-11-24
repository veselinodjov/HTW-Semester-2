/**
 * Extends class QuadraticMatrix;
 * Creates an identity matrix; 
 * Uses constructor only;
 * toString() method overridden;
 * 
 * @class IdentityMatrix.java
 * @author Veselin Odzhov s0556006
 * @date 23.11.2016
 */

package Matrix;

public class IdentityMatrix extends QuadraticMatrix 
{
	public IdentityMatrix(int dim)
	{
		super(dim, new double[dim][dim]);
		for(int i=0; i<dim;i++)
		{
			elements[i][i]=1;
		}
	}
	/**
	 * @return String value with identity matrix' elements.
	 */	
	public String toString()
	{
		return super.toString();
	}
}
