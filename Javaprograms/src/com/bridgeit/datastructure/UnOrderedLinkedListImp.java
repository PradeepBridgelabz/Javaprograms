/********************************************************************************

 * Purpose: Reading words from file and searching if word found then remove it else add to list
 *
 * @author bridgeit
 * 
 * Date:1/03/18
 *
 ********************************************************************************/
package com.bridgeit.datastructure;
import com.bridgeit.utility.Utility;
public class UnOrderedLinkedListImp {
	public static void main(String args[]) throws Exception
	{
		UserDefinedLinkedList<String> ll=new UserDefinedLinkedList<String>();
		Utility utility=new Utility();
		String[] stringArray = utility.fileReading();
		for(int i=0;i<stringArray.length;i++)
		{
			ll.add(((stringArray[i])));
		}
		ll.disply();
		System.out.println();
			System.out.println();
			System.out.println("\nEnter the key element to search");
			String key = utility.StringInput();
			boolean result=ll.search(key);
			if(result)
			{
				System.out.println("Element found");
				boolean r=ll.remove(key);
				if(r)
				System.out.println("Key"+" "+key+" "+"Removed from list");
				
			
			}
			else
			{
				ll.add(key);
				System.out.println("Key"+" "+key+" "+"Not found\n");
				System.out.println("Key"+" "+key+" "+"added to list");

			}
			utility.filewriting(ll);
	}
}
