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
		
		//lv1 약수의 합
		Solution1.solution15(5);
		
		//lv1 시저암호
		Solution1.solution16("a B z",4);
		
		//lv1 소수찾기
		Solution1.solution17(10);
		
		//lv1수박수박수
		Solution1.solution18(4);
		
		//lv1 서울에서 김서방찾기 
		Solution1.solution19(new String[]{"Park","Kim"});
		
		Solution1.solution20("1234a");
		
		//lv1 문자열 내림차순으로 배치하기
		Solution1.solution21("Zbcdefg");
		
		//lv1 두 정수 사이의 합
		Solution1.solution22(1,1000000);		
		
		//lv1 같은숫자는 싫어
		Solution1.solution23(new int[]{1,1,3,3,0,1,1});

		//lv1 가운데 글자 가져오기
		Solution1.solution25("qwer");

		//lv1 k번째 수		[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]
		int arr26f[] = {1, 5, 2, 6, 3, 7, 4};
		int arr26s[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		Solution1.solution26(arr26f, arr26s);
		
		//lv1 부족한 금액 계산하기
		Solution1.solution27(3,20,4);
		
		//lv1 두 개 뽑아서 더하기
		int arr27f[] = {2,1,3,4,1};
		int arr27s[] = {5,0,2,7};
		Solution1.solution28(arr27s);
		
		//lv1 2016년 (윤년)
		Solution1.solution28(5,24);
		
		//lv1 없는숫자더하기
		int arr29f[] = {3,4,1,6};
		Solution1.solution29(arr29f);
		
		
		//lv1 폰켓몬
		int arr30[] = {3,1,2,3};
		int arr30s[] = {3,3,3,2,2,4};
		int arr30t[] = {3,3,3,2,2,2};
		Solution1.solution30(arr30t);
		
		
		/*
		int[][] arr28f = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int[][] arr28s = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int[][] arr28t = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		*/
		
		/*거리두기
		System.out.println("거리두기");
		String places[][] = new String[][]{
 			{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, 
 			{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, 
 			{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, 
 			{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, 
 			{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
		};	
		
		new Solution3().solution(places);
		*/
		
	}

}
