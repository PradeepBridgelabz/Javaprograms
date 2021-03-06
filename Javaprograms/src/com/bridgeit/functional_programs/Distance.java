/***********************************************************************************
 * Purpose:Euclidean distance from the point (x, y) to the origin (0, 0)
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.functional_programs;

import com.bridgeit.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		Utility utility=new Utility();
    System.out.println("Euclidean distance from the point (x, y) to the origin (0, 0)");
	System.out.println("Frist argument is:");
    int x=utility.IntegerInput();
	System.out.println("second argument is:");
    int y=utility.IntegerInput();
    double distance=utility.EuclideanDistance(x,y);
    System.out.println(distance);
    
	}

}
