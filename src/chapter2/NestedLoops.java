package chapter2;

import lib.TextElements;

public class NestedLoops {

	public static void main(String[] args) {
		
		//Simple nested loop
		{
			int x = 20;
			while(x > 0){
				do{
					x -= 2;
				} while(x>5);
				x--;
				System.out.print(x+"\t");
			}
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		//Array Iteration with labels
		{
			int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
			OUTER_LOOP: for(int[] mySimpleArray : myComplexArray){
				INNER_LOOP: for(int i = 0; i<mySimpleArray.length; i++){
					System.out.print(mySimpleArray[i] + "\t");
				}
				
				System.out.println();
//				break OUTER_LOOP;
			}
		}
		System.out.println(TextElements.SEPARATOR);
		//Search Example (with labeled 'break' control)
		{
			int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
			int searchValue = 2;
			int positionX = -1;
			int positionY = -1;
			PARENT_LOOP: for(int i=0; i<list.length; i++){
				for(int j=0; j<list[i].length; j++){
					if(list[i][j] == searchValue){
						positionX = i;
						positionY = j;
						continue PARENT_LOOP;
					}
				}
			}
			if(positionX==-1 || positionY==-1){
				System.out.print("Value " + searchValue + " not found");
			}else{
				System.out.print("Value " + searchValue + " found at: ("+ ++positionX +", "+ ++positionY +")");
			}
				
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		//Search Example (with labeled 'continue' control)
		{
			FIRST_CHAR_LOOP: for(int a = 1; a <= 4; a++){
				for(char x = 'a'; x <= 'c'; x++){
//					if(a == 2 || x == 'b')
//						continue;
					System.out.print(" " + a + x);
				}
			}
		}
		
		//1a 1c 3a 3c 4a 4c
		
		

	}

}
