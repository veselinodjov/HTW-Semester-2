package binaer_Baeume;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */

public class BinTreeTest {

	public static void main(String[] args) 
	{
		BinNode root1L2L3L = new BinNode(1);
		BinNode root1L2L3R = new BinNode(3);
		
		BinNode root1L2L = new BinNode(2, root1L2L3L, root1L2L3R);
		BinNode root1L2R = new BinNode(5);
		
		BinNode root1R2L = new BinNode(8);
		BinNode root1R2R = new BinNode(16);
		
		BinNode root1L = new BinNode(4, root1L2L, root1L2R);
		BinNode root1R = new BinNode(9, root1R2L, root1R2R);
		
		BinNode root = new BinNode(7, root1L, root1R);
		
		BinTree tree = new BinTree(root);
		
		Travesieren trav = new Travesieren(tree);
		
		System.out.println(trav.depthFirst());
		System.out.println(trav.breadthFirst());
		/*
		 * 		     (7)
		 *          /   \
		 *       (4)    (9)
		 *       / \    /  \
		 *     (2) (5) (8) (16)
		 *    /  \
		 *  (1)  (3)
		 *    
		 */
	}

}
