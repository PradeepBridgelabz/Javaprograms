/*************************************************************************************************************************************************
 *  Purpose: program to check the word is palindrome or not using ArrayDequeue
 *
 *  @author  bridgeit
 * 
 *  Date:    1/03/18
 *
 ************************************************************************************************************************************************/
package com.bridgeit.datastructure;
import java.util.ArrayDeque;
import java.util.Arrays;
import com.bridgeit.utility.Utility;
public class PalindromeChecker {
	public static void main(String args[])
	{
		//UserDefinedDeQueue urDefinedDeQueue=new UserDefinedDeQueue();
        ArrayDeque<Character>arrayDeque=new ArrayDeque<Character>();
        Utility utility=new Utility();
		System.out.println("Enter the String");
		String stringInput=utility.StringInput();
		for(int i=0;i<stringInput.length();i++)
		{
			char c=stringInput.charAt(i);
			arrayDeque.addFirst(c);
		}
		int i=0;
		char array[]=new char[arrayDeque.size()];
		while(!arrayDeque.isEmpty())
		{

			 array[i]=arrayDeque.removeFirst();
			 i++;
		}
		String string=Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
		if(string.equals(stringInput))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}


	}

}
