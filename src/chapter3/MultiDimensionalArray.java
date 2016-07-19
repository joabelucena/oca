package chapter3;

import lib.TextElements;

@SuppressWarnings("unused")
public class MultiDimensionalArray {
	public static void main(String[] args) {

		{
			int[][]vars1;				// 2D array
			int vars2 [][];				// 2D array
			int vars3[];				// 2D array
			int[] vars4 [], space[][];	// a 2D and a 3D array
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			
			String [][] rectangule = new String[3][2];
			
			rectangule[0][1] = "set";
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			int[][] differentSize = {{1,4}, {3}, {9,8,7}};
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			int [][] el = new int[4][];
			el[0] = new int[5];
			el[1] = new int[3];
		}
	}
}
