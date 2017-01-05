package listen;

public class Liste implements AbstrakteListe
{
	private Node first;

	public Liste()
	{
		first = null;
	}
	
	public Liste(int wert)
	{
		first = new Node (wert);
	}
	
	public Liste(Node knot)
	{
		first = knot;
	}
	/**
	 * Calculates the size (length) of the list.
	 * @return length of the list 
	 */
	@Override
	public int size() 
	{
		Node p = first;
		int length = 0;
		
		while( p != null ) 
		{
			length++;
			p = p.next;
		}
		return length;
	}
	
	/**
	 * Checks if a value is in the list
	 * @param wert the value to be checked
	 * @return true if found, else false
	 */
	@Override
	public boolean contains(int wert) 
	{
		Node k = first;
		
		while( k != null && k.data != wert )
			k = k.next;
		if( k == null ) 
			return false;
		else
			return true;
	}
	
	/**
	 * Checks if the given index is valid, if so, returns its value of the object
	 * @param index Index to be checked
	 * @return The value at the desired index, if valid, else throws exception
	 * @throws In case the desired index is not valid
	 */
	@Override
	public int get(int index) throws NullPointerException 
	{
		Node srch = first;
		if(first == null)
			throw new NullPointerException("\nNo element at given index.\n");
		else
		{
		int counter = 0;
		while(counter < index)
			{
				srch = srch.next;
				counter++;
			}
			return srch.data;				
		}		
	}

	/**
	 * Sets the value of an object at the desired index
	 * @param index The desired index
	 * @param wert the desired value to be set
	 * @return the original value before the change
	 * @throws in case of an invalid index, throws an exception
	 */
	@Override
	public int set(int wert, int index) throws NullPointerException 
	{
		Node set = first;
		int counter = 0;
		
		if(index>= 0 && index < size())
		{
			while(counter < index) 
			{
				set = set.next;
				counter++;
			}
			int hlp = set.data;
			set.data = wert;
			return hlp;
		}
		else
			throw new NullPointerException("\nNo element at given index.\n");
	}

	/**
	 * Adds an object at the very beginning
	 * @param wert The value of the object to be added
	 */
	@Override
	public void addFirst(int wert) 
	{
		Node addF = new Node(wert);
		if(first == null)
		{
			first = addF;
		}
		else
		{
			addF.next = first;
			first = addF;
		}
	}	
	
	/**
	 * Adds an object at the end
	 * @param wert The value of the object to be added
	 */
	@Override
	public void addLast(int wert) 
	{
		Node addL = new Node(wert);
		if(first == null)
		{
			first = addL;
		}
		else
		{
			Node tempAddL = first;
			while (tempAddL.next != null)
			{
				tempAddL = tempAddL.next;
			}
			tempAddL.next = addL;
			
		}
	}

	/**
	 * Adds an object at the desired index
	 * @param wert The value of the object to be added
	 * @param index the desired index
	 * @return true if successfully added, else false
	 * @throws in case of an invalid desired index, throws an exception
	 */
	@Override
	public boolean add(int wert, int index) throws NullPointerException 
	{
		Node add = first;
		int counter = 0;
		
		if(index == 0)
		{
			addFirst(wert);
		}
		else
		{
			if(index < 0 || index >= size())
				throw new NullPointerException("Index out of bounds");
			while(add != null)
			{
				if(counter == index - 1)
				{
					Node addNxt = add.next;
					add.next = new Node(wert);
					add.next.next = addNxt;
					return true;
				}
				counter++;
				add = add.next;	
			}
		}
		return false;
	}

	/**
	 * Removes an object with the desired value
	 * @param wert the desired value of an object to be removed
	 * @return true if an object with the desired value was successfully removed, else false
	 */
	@Override
	public boolean remove(int wert)
	{
		if(contains(wert)) 
		{
			int counter = 0;
			
			while(first.data == wert)
			{
				removeFirst();
				counter++;
			}
			
			Node rem = first;
			
			while(rem != null && rem.next != null)
			{
				Node remHlp = rem.next;
				
				if(remHlp.data == wert)
				{
					if(remHlp.next != null)
					{
						rem.next = remHlp.next;
						remHlp = rem.next;
						counter++;
					}
					else
					{
						rem.next = null;
						break;
					}		
				}
				rem = rem.next;
				if(rem.next == null)
				{
					this.removeLast();
					counter++;
				}
			}
			if(counter>0)
				return true;
		}
		return false;
	}

	/**
	 * Removes the first object of a list (if not empty)
	 * @return  the value of the removed element
	 * @throws in case of an empty list, throws an exception
	 */
	@Override
	public int removeFirst() throws NullPointerException 
	{
		Node remF = first;
		if(remF == null)
			throw new NullPointerException("List is empty.");
		else
		{
			first = remF.next;
			return remF.data;
		}
	}

	/**
	 * Removes the last object of a list (if not empty)
	 * @return  the value of the removed element
	 * @throws in case of an empty list, throws an exception
	 */
	@Override
	public int removeLast() throws NullPointerException 
	{
		int valL = 0;
		if(first==null)
			throw new NullPointerException("List is empty.");
		else
		{
			Node remL = first;
			for(int i = 0; i < size()-1; i++)
			{
				
				if(i == size()-2)
				{
					valL = remL.next.data;
					remL.next = null;
				}
				remL = remL.next;
			}
			return valL;
		}
	}

	/**
	 * Removes 	an object of a list at the desired index
	 * @return  the value of the removed element
	 * @throws in case of an invalid index, throws an exception
	 */
	@Override
	public int removeAtIndex(int index) throws NullPointerException 
	{
		Node remAI = first;
		int counter = 0;
		while(counter < index-1)
		{
			remAI = remAI.next;
			counter++;
		}
		if(counter == index-1 && remAI.next != null)
		{
			int remAIHlp = remAI.next.data;
			remAI.next = remAI.next.next;
			return remAIHlp;
		}
		else
			throw new NullPointerException("\nNo element at given index.\n");
	}
	
	@Override
	public String toString()
	{
		Node prt = first;
		if(prt != null)
		{
			String print = "";
			if(print.equals(""))
				print+="[ ";
			while(prt != null)
			{
				print+=prt.data + " ";
				prt = prt.next;
			}
			if(!print.equals(""))
				print+="]";
		return print;
		}
	return "";
	}
}