/*
 * Program Name: star.java
 * Purpose: �L�X���r��
		*
	   *** 
	  *****
	 *******
 * Author: �����x
 * Date: 2016/06/30
 * Last Update: 2016/06/30
*/

import java.util.*;

public class star{
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		System.out.print("��J���r�𰪫�:");
		int n=in.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int k=0;k<n-i;k++)
				System.out.print(" ");
			
			for(int j=0;j<2*i-1;j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}