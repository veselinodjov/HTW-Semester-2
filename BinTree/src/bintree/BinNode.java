/**
 * @author Veselin Odzhov, s0556006
 * @date 09.01.2017
 */

package bintree;

public class BinNode 
{
	int	data;
	BinNode	left, right;
	
	BinNode(int	d)
	{
	data = d; 
	left = right = null; 
	} 
	
	BinNode(int d, BinNode l, BinNode r) 
	{
		data = d; left = l; 
		right = r; 
	}
}
