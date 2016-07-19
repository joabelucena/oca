package chapter4;

public class Varargs {

	public static void main(String[] args) {
		walk(1);
		walk(1, 2);
		walk(1, 2, 3);
		walk(1, new int[] {4,5});
		
		run(11,22);
		
		try {
			walk(1, null);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void walk(int start, int...nums){
		System.out.println(nums.length);
	}
	
	public static void run(int...nums){
		System.out.println(nums[1]);
	}

}
