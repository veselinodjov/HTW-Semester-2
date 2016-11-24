/**
 *  Ad-hoc-testing of the following classes:
 *  Vector, Matrix, QuadraticMatrix and IdentityMatrix}
 *  
 * @class VecMatQuadIdenTest.java
 * @author Veselin Odzhov s0556006
 * @date 23.11.2016
 */
package Matrix;

public class VecMatQuadIdenTest {

	public static void main(String[] args) 
	{
		
		/**
		 * Testing class Matrix
		 */
		System.out.println("-------------------------------------------------------\n\t\tTesting class Matrix\n-------------------------------------------------------");

		// creating a 2x3 array and passing it as parameter
		System.out.println("Creating a 2x3 array and passing it as parameter");
		double[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
		Matrix m1 = new Matrix(arr1);
		System.out.println(m1.toString());
		
		// using the array as parameter, also dimension check (correct)
		System.out.println("Using the array as parameter, also dimension check (correct)\n");
		Matrix m2 = new Matrix(2,3,arr1);
		System.out.println(m2.toString());
		
		// using the array as parameter, also dimension check (false)
		System.out.println("Using the array as parameter, also dimension check (false - 2x2)\n");
		Matrix m3 = new Matrix(2,2,arr1);
		System.out.println(m3.toString());
		
		// using the array as parameter, also dimension check (false)
		System.out.println("Using the array as parameter, also dimension check (false - 0x0)\n");
		Matrix m4 = new Matrix(0,0,arr1);
		System.out.println(m4.toString());
		System.out.println("-------------------------------------------------------\n\t\tEnd testing class Matrix\n-------------------------------------------------------");
		
		/**
		 * Testing class QuadraticMatrix
		 */
		System.out.println("-------------------------------------------------------\n\t\tTesting class QuadraticMatrix\n-------------------------------------------------------");
		
		// creating a 3x3 array and passing it as parameter, also dimension check (correct)
		System.out.println("Creating a 3x3 array and passing it as parameter, also dimension check (correct)\n");
		double[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		QuadraticMatrix m5 = new QuadraticMatrix(3, arr2);
		System.out.println(m5.toString());
		
		// using the array as parameter, also dimension check (false)
		System.out.println("Using the array as parameter, also dimension check (false - 2x2)\n");
		QuadraticMatrix m6 = new QuadraticMatrix(2, arr2);
		System.out.println(m6.toString());
			
		// using the array as parameter, also dimension check (false)
		System.out.println("Using the array as parameter, also dimension check (false - 0x0)\n");
		QuadraticMatrix m7 = new QuadraticMatrix(0, arr2);
		System.out.println(m7.toString());
		
		// testing the pow(int p) method, p>0
		System.out.println("Testing the pow(int p) method, p>0\n");
		QuadraticMatrix m8 = new QuadraticMatrix(3, arr2);
		System.out.println(m8.toString());		/*
													Matrix m8:
													
													( 1.0, 2.0, 3.0 )
													( 4.0, 5.0, 6.0 )
													( 7.0, 8.0, 9.0 )
												*/
		Matrix m9 = m8.pow(3);
		System.out.println(m9.toString());		/*
													Matrix m9:
													
													( 468.0, 576.0, 684.0 )
													( 1062.0, 1305.0, 1548.0 )
													( 1656.0, 2034.0, 2412.0 )
		 										*/
		
		// testing the pow(int p) method, p=0
		System.out.println("Testing the pow(int p) method, p=0\n");
		QuadraticMatrix m10 = new QuadraticMatrix(3, arr2);
		System.out.println(m10.toString());		/*
													Matrix m10:
													( 1.0, 2.0, 3.0 )
													( 4.0, 5.0, 6.0 )
													( 7.0, 8.0, 9.0 )
		 										*/	
		
		Matrix m11 = m10.pow(0);
		System.out.println(m11.toString());		/*
													Matrix m11:
													( 1.0, 0.0, 0.0 )
													( 0.0, 1.0, 0.0 )
													( 0.0, 0.0, 1.0 )
		 										*/
		
		// testing the pow(int p) method, p<0
		System.out.println("Testing the pow(int p) method, p<0\n");
		QuadraticMatrix m12 = new QuadraticMatrix(3, arr2);
		Matrix m13 = m12.pow(-1);				// shows an error message and returns identity matrix (as if power has the lowest allowed value - 0
		System.out.println(m13.toString());		// despite of power being -1, returns identity matrix
		System.out.println("-------------------------------------------------------\n\t\tEnd testing class QuadraticMatrix\n-------------------------------------------------------");
		
		/**
		 * Testing class IdentityMatrix
		 */
		System.out.println("-------------------------------------------------------\n\t\tTesting class IdentityMatrix\n-------------------------------------------------------");
		// creating a 2x2 identity matrix
		System.out.println("Creating a 2x2 identity matrix\n");
		IdentityMatrix m14 = new IdentityMatrix(2);
		System.out.println(m14.toString());
		
		// creating a 3x3 identity matrix
		System.out.println("Creating a 3x3 identity matrix\n");
		IdentityMatrix m15 = new IdentityMatrix(3);
		System.out.println(m15.toString());
		
		// creating an empty 0x0 identity matrix
		System.out.println("Creating an empty 0x0 identity matrix\n");
		IdentityMatrix m16 = new IdentityMatrix(0);			// shows an error message
		System.out.println(m16.toString());
		System.out.println("-------------------------------------------------------\n\t\tEnd testing class IdentityMatrix\n-------------------------------------------------------");
		
		/**
		 * Testing class Vector
		 */
		System.out.println("-------------------------------------------------------\n\t\tTesting class Vector\n-------------------------------------------------------");
		
		// creating a 1x4 array and passing it as parameter
		System.out.println("Creating a 1x4 array and passing it as parameter");
		double[] arr3 = {1, 2, 3, 4};
		Vector v1 = new Vector(arr3);
		System.out.println(v1.toString());
		System.out.println("length() method:\n");
		System.out.println(v1.length());
		
		// creating a empty array (0x0) and passing it as parameter
		System.out.println("\n\nCreating an empty array (0x0) and passing it as parameter");
		double[] arr4 = {};
		Vector v2 = new Vector(arr4);
		System.out.println(v2.toString());
		System.out.println("length() method:\n");
		System.out.println(v2.length());
		
		
		System.out.println("-------------------------------------------------------\n\t\tEnd testing class Vector\n-------------------------------------------------------");
	}
}
