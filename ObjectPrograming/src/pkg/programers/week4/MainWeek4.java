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
		
		
		//lv1 나누어 떨어지는 숫자 배열
		int arrTwo[] = {2,3,1,5,4,10,22,13,147,136,148};
		Solution1.solution8(arrTwo, 1);
	
		// lv1 정수 내림차순으로 배치하기
		Solution1.solution9(123);
		
		// lv1 정수 자릿수 더하기
		Solution1.solution10(123);
		
		// lv1 자연수를 뒤집어 배열로 만들기
		Solution1.solution11(12345);
		
		//lv1 제곱근 판별
		Solution1.solution12(123);

		//lv1 문자열 정수로 바꾸기		
		Solution1.solution13("-1234");
		
		//lv1 이상한 문자 만들기		
		Solution1.solution14("1");
	}

}
