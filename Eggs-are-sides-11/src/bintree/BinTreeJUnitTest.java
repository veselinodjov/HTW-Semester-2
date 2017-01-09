/**
 * @author Veselin Odzhov, s0556006
 * @date 09.01.2017
 */

package bintree;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinTreeJUnitTest 
{
	@Test
	public void emptyTreeTest() 
	{
		BinTree tree = new BinTree();
		
		assertFalse(tree.isNotEmpty());
		assertTrue(tree.isSorted());
		assertEquals(0, tree.countLeaves());
	}
	
	@Test
	public void oneKnotTreeTest()
	{
		BinTree tree = new BinTree(new BinNode(0));
		
		assertTrue(tree.isNotEmpty());
		assertTrue(tree.isSorted());
		assertEquals(1, tree.countLeaves());
	}
	
	@Test
	public void exampleBinaryTreeTest()
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
		
		
		assertTrue(tree.isNotEmpty());
		assertTrue(tree.isSorted());
		assertEquals(4, tree.countLeaves());
	}
}
