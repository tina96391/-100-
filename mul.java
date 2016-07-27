/*
 * Program Name: mul.java
 * Purpose: 九九乘法表
 * Author: 戴郁庭
 * Date: 2016/06/30
 * Last Update: 2016/06/30
*/

import java.util.*;

public class mul{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}