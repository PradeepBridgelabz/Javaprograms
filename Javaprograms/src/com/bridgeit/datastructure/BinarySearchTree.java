/**************************************************************************************************************************
 * Purpose:BinarySearchTree number of possible nodes
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 **************************************************************************************************************************/
package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BinarySearchTree {

	public static void main (String[] args) {
		Utility utility=new Utility();
		System.out.println("enter the length");
		int t=utility.IntegerInput();
		for(int x=0;x<t;x++)
		{
			int n=utility.IntegerInput();
				if(n==0||n==1)
				{
					System.out.println(n);
					continue;
				}
				int a[]=new int[n+1];
				a[0]=1;
				a[1]=1;
				a[2]=2;
				for(int i=3;i<=n;i++)
				{
						int res=0;
							for(int j=1;j<=i;j++)
							{
								res=res+a[i-j]*a[j-1];
							}
						         a[i]=res;
				}
			System.out.println(a[n]);
		}
	}
}

