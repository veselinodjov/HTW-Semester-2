/**
 * @author Veselin Odzhov, s0556006
 * @date 05.01.2017
 */

package bintree;

public class BinTreeTest 
{
	public static void main(String[] args) 
	{
		BinNode root1L2L3L = new BinNode(1);
		BinNode root1L2L3R = new BinNode(3);
		
		BinNode root1L2L = new BinNode(2, root1L2L3L, root1L2L3R);
		BinNode root1L2R = new BinNode(5);
		
		BinNode root1R2L = new BinNode(8);
		
		BinNode root1L = new BinNode(4, root1L2L, root1L2R);
		BinNode root1R = new BinNode(9,root1R2L, null);
		
		BinNode root = new BinNode(7, root1L, root1R);
		
		BinTree tree = new BinTree(root);
		
		tree.printBinTree();
		
		System.out.println("\nBinary tree not empty ? : " + tree.isNotEmpty());
		System.out.println("\nNumber of leaves: " + tree.countLeaves());
		System.out.println("\nBinary tree sorted ? : " + tree.isSorted());
	}
}
