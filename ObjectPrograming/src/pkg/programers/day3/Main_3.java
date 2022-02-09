package pkg.programers.day3;

public class Main_3 {
	public static void main(String[] args){
		Solution1 s1 = new Solution1();
		
		int w = 1;
		int h = 1;
		
		System.out.println(s1.solution(w,h));
		
		Solution4 s4 = new Solution4();
	
		s4.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
		s4.solution(new int[]{0, 0, 0, 0, 0, 0}, 	new int[]{38, 19, 20, 40, 15, 25});
		s4.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});
		
		/*
			[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
			[0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
			[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
		 */
		
		
	}
}
