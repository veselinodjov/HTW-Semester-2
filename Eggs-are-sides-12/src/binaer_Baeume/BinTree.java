package binaer_Baeume;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */



public class BinTree 
{
	int mini = Integer.MIN_VALUE;
	int maxi = Integer.MAX_VALUE;
	
	private BinNode root = null;
	
	/**
	 * Default constructor
	 */
	BinTree() 
	{
		root = null;
	}
	
	/**
	 * Basic constructor with one parameter.
	 * 
	 * @param root The main node, a.k.a the root
	 */
	BinTree(BinNode root) 
	{
		this.root = root;
	}
	
	/**
	 * Basic printing method for the current tree with starting point from the desired node.
	 * 
	 * @param node The node which will be treated as main, root, 
	 * therefore the printing will take place from there on.
	 */
	public void printBinTree(BinNode node)
	{		
		if(node != null)
		{
			System.out.print("(");
			printBinTree(node.left);
			System.out.print(node.data);
			printBinTree(node.right);
			System.out.print(")");	
		}
	}
	/**
	 * Default constructor for printBinTree() method. 
	 */
	public void printBinTree()
	{
		printBinTree(root);
	}
	
	/**
	 * Method checking if the current tree is empty or not.
	 * 
	 * @return true if not empty, else false.
	 */
	public boolean isNotEmpty()
	{
		System.out.println();
		return root!=null; 
	}
	
	/**
	 * Method counting the number of nodes without more nodes to follow, a.k.a. childnodes.
	 * 
	 * @param node The node which will be treated as main, root, 
	 * therefore the counting will take place from there on.
	 * @return Number of nodes without more nodes to follow, a.k.a. childnodes.
	 */
	public int countLeaves(BinNode node)
	{
		int counter = 0;
		if(node == null)
			return counter;
		if (node.left == null && node.right == null)
			counter += 1;
	    if (node.left != null)
	    	counter += countLeaves(node.left);
	    if (node.right != null)
	    	counter += countLeaves(node.right);
		return counter;
	}
	
	/**
	 * Default constructor for countLeaves() method. 
	 * 
	 * @return Number of nodes without more nodes to follow, a.k.a. childnodes.
	 */
	public int countLeaves() 
	{
		return countLeaves(root);
	}
		
	/**
	 * Basic method which recursively checks whether the current tree is sorted or not.
	 * 
	 * @param node The node which will be treated as main, root, 
	 * therefore the checking will take place from there on.
	 * @param min Minimum comparator 
	 * @param max Maximum comparator
	 * @return true if sorted, else false.
	 */
	boolean isSorted(BinNode node, int min, int max)
    {
        if (node == null)
            return true;
        if (node.data < min || node.data > max)
            return false;
        
        /* the minus, respectively, plus one to the next recursively called 
         * method's max / min value (node.data ± 1) are in order to avoid repetition, 
         * it's to say, more than one node with the same value 		   	  
         */
        return (isSorted(node.left, min, node.data-1) && isSorted(node.right, node.data+1, max));
    }
	
	/**
	 * Default constructor for isSorted() method.
	 * 
	 * @return true if sorted, else false.
	 */
	public boolean isSorted()
	{
		return isSorted(root, mini, maxi);
	}

	public BinNode getRoot() 
	{
		return root;
	}
}
