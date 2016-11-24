/**
 * Example class Matrix, not written by me;
 * Has one additional method: toString();
 * 
 * @class Matrix.java
 * @author Veselin Odzhov s0556006
 * @date 23.11.2016
 */

package Matrix;

public class Matrix {

	/**
	 * Number of rows
	 */
	int rows;
	/**
	 * Number of columns
	 */
	int columns;
	/**
	 * Stores the matrix elements where elements[i][j] is the element in the
	 * i-th row and j-th column
	 */
	double[][] elements;

	/**
	 * Creates a new Matrix
	 *
	 * @param rows
	 *            Number of rows
	 * @param columns
	 *            Number of columns
	 * @param elements
	 *            matrix elements where elements[i][j] is the element in the
	 *            i-th row and j-th column
	 */
	public Matrix(double[][] elements) 
	{
		this.rows = elements.length;
		this.columns = elements[0].length;
		this.elements = elements;
	}
		
	/**
	 * Creates a new Matrix
	 *
	 * @param rows
	 *            Number of rows
	 * @param columns
	 *            Number of columns
	 * @param elements
	 *            matrix elements where elements[i][j] is the element in the
	 *            i-th row and j-th column
	 */
	public Matrix(int rows, int columns, double[][] elements)
	{
		this.rows = rows;
		this.columns = columns;
		if(this.rows == elements.length && this.columns == elements[0].length)
		{
			this.elements = elements;	
		}
		else
		{
			System.out.println("Number of predefined rows and columns should be equal to matrix' dimensions.\n"
					+ "Creating a " + this.rows + "x" + this.columns + " matrix filled with zeros");
			double[][] zero = new double[rows][columns];
			this.elements = zero;
		}
	}	
	
	/**
	 * Creates a new quadratic Matrix
	 *
	 * @param dim
	 *            Number of rows and columns
	 * @param elements
	 *            matrix elements where elements[i][j] is the element in the
	 *            i-th row and j-th column
	 */
	public Matrix(int dim, double[][] elements)
	{
		if(dim==0)
		{
			System.out.println("Matrix with dimensions 0x0 is not a valid one.");
		}
		else
		{
		this.rows = dim;
		this.columns = dim;
		if(this.rows == elements.length && this.columns == elements[0].length)
		{
			this.elements = elements;	
		}
		else
		{
			System.out.println("Number of predefined rows and columns should be equal to those of quadratic matrix' dimensions.\n"
					+ "Creating a " + this.rows + "x" + this.columns + " quadratic matrix filled with zeros");
			double[][] zero = new double[dim][dim];
			this.elements = zero;
		}
		}
	}	

	/**
	 * Adds a matrix to this Matrix
	 *
	 * @param m
	 *            Matrix to be added
	 * @return if input is valid: a new Matrix that is the result of adding m to
	 *         this, if not: null
	 */
	public Matrix add(Matrix m) {
		if (!sameDimensions(m)) {
			System.err.println(String.format("Dimensions %dx%d did not match %dx%d", m.rows, m.columns, rows, columns));
		} else {
			double[][] newElements = new double[rows][columns];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					newElements[i][j] = elements[i][j] + m.elements[i][j];
				}
			}
			return new Matrix(newElements);
		}
		return null;
	}

	/**
	 * Subtracts a matrix from this Matrix
	 *
	 * @param m
	 *            Matrix to be subtracted
	 * @return a new Matrix that is the result of subtracting m from this
	 */
	public Matrix sub(Matrix m) {
		return add(m.multiply(-1));
	}

	/**
	 * Multiplies a scalar with this Matrix
	 *
	 * @param factor
	 *            factor to be multiplied
	 * @return a new Matrix that is the result of multiplying the factor with
	 *         this
	 */
	public Matrix multiply(double factor) {
		double[][] newElements = new double[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				newElements[i][j] = elements[i][j] * factor;
			}
		}
		return new Matrix(newElements);
	}

	/**
	 * Multiplies a matrix with this Matrix
	 *
	 * @param m
	 *            Matrix to be multiplied
	 * @return if input is valid: a new Matrix that is the result of multiplying
	 *         m with this, if not: null
	 */
	public Matrix multiply(Matrix m) {
		if (columns != m.rows) {
			System.err.println("Matrices can not be multiplied");
		} else {

			double[][] newElements = new double[rows][m.columns];
			for (int i = 0; i < rows; i++) 
			{
				for (int j = 0; j < m.columns; j++) 
				{
					double sum = 0;
					for (int k = 0; k < columns; k++) 
					{
						sum += elements[i][k] * m.elements[k][j];
					}
					newElements[i][j] = sum;
				}
			}
			return new Matrix(newElements);
		}
		return null;
	}

	/**
	 * Tests if the two matrices are equal to one another
	 *
	 * @param m
	 *            the reference matrix with which to compare.
	 * @return true if this matrix is the same as the matrix argument; false
	 *         otherwise.
	 */
	public boolean equals(Matrix m) 
	{
		if (!sameDimensions(m)) 
		{
			return false;
		}
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++) 
			{
				if (elements[i][j] != m.elements[i][j]) 
				{
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Tests if the two matrices have the same dimensions
	 *
	 * @param m
	 *            the reference matrix with which to compare.
	 * @return true if this matrix has the same dimensions as the matrix
	 *         argument; false otherwise.
	 */
	private boolean sameDimensions(Matrix m) {
		return rows == m.rows && columns == m.columns;
	}
	
	/**
	 * @return String value with matrix' elements.
	 */	
	public String toString()
	{
		   String result = "\n";
	       if(rows == 0)
	       {
	    	   result += "Matrix is empty.\n";
	       }
	        for(int i = 0; i <= rows-1; i++)
	        {
	        	for(int j = 0; j <= columns-1; j++)
	        	{
	        		if(j==0)
	        			result += "( " + elements[i][j];
	        		if(j > 0 && j < columns-1)
	        			result += ", " + elements[i][j];
	        		if(j == columns-1)
	        			result += ", " +  elements[i][j] + " )\n"; 
	        		if(i==rows && j == columns)
	        			result += "\n";
	        	}
	        }
	        result += "\n";
	        return result;
	}
}
