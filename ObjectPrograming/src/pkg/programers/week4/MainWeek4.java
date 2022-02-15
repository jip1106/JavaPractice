package pkg.programers.week4;

public class MainWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = {{1},{2}};
		int arr2[][] = {{3},{4}};
		
		
		//lv1 행렬의 덧셈
		Solution1.solution(arr1, arr2);
		
		//lv1마스킹
		Solution1.solution1("01033334444");
		
		//lv1 하샤드수 
		Solution1.solution2(10);
		Solution1.solution2(12);
		Solution1.solution2(11);
		Solution1.solution2(13);
		
		//lv1 콜라츠추측
		Solution1.solution4(6);
		Solution1.solution4(16);
		Solution1.solution4(626331);
		
		//lv1 최대공약수,최소공배수
		Solution1.solution5(3, 12);
		Solution1.solution5(2, 5);
		
		int arrOne[] = {2,3,1,5};
		Solution1.solution6(arrOne);
	}

}
