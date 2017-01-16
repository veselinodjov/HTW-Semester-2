package binaer_Baeume;

/**
 * @author Veselin Odzhov, s0556006
 * @date 16.01.2017
 */

import stapel_warteschlange.Stapel;
import stapel_warteschlange.Warteschlange;

public class Travesieren 
{

	BinTree tree;

	
	public Travesieren(BinTree tree)
	{
		this.tree = tree;
	}

	/**
	 * Method for DFS binary tree
	 * @return depth first string representation of the binary tree
	 */
	public String depthFirst()
	{
		Stapel<BinNode> stapel = new Stapel<>();
		String result = "";

		stapel.push(tree.getRoot());
		
		while (!stapel.isEmpty())
		{			
			BinNode hlp = stapel.pop();
			
			if (hlp != null)
			{	
				if(hlp.right != null) stapel.push(hlp.right);
				if(hlp.left != null) stapel.push(hlp.left);
				result +=  hlp.data;
				if(!stapel.isEmpty()) result += ", ";			
			}
		}
		return result;
	}

	/**
	 * Method for BFS binary tree
	 * @return breadth first string representation of the binary tree
	 */
	public String breadthFirst()
	{
		Warteschlange<BinNode> ws = new Warteschlange<>();
		String result = "";

		ws.enqueue(tree.getRoot());
		
		while (!ws.isEmpty())
		{
			BinNode hlp = ws.dequeue();
			if (hlp != null)
			{
				result += (!ws.isEmpty()) ? ", " + hlp.data : hlp.data;
				ws.enqueue(hlp.left);
				ws.enqueue(hlp.right);
			}
		}			
			return result;
	}
}