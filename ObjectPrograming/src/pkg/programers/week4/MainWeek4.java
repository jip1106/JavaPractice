package pkg.programers.week4;

public class MainWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = {{1},{2}};
		int arr2[][] = {{3},{4}};
		
		
		//lv1 ����� ����
		Solution1.solution(arr1, arr2);
		
		//lv1����ŷ
		Solution1.solution1("01033334444");
		
		//lv1 �ϻ���� 
		Solution1.solution2(10);
		Solution1.solution2(12);
		Solution1.solution2(11);
		Solution1.solution2(13);
		
		//lv1 �ݶ�������
		Solution1.solution4(6);
		Solution1.solution4(16);
		Solution1.solution4(626331);
		
		//lv1 �ִ�����,�ּҰ����
		Solution1.solution5(3, 12);
		Solution1.solution5(2, 5);
		
		int arrOne[] = {2,3,1,5};
		Solution1.solution6(arrOne);
		
		
		//lv1 ������ �������� ���� �迭
		int arrTwo[] = {2,3,1,5,4,10,22,13,147,136,148};
		Solution1.solution8(arrTwo, 1);
	
		// lv1 ���� ������������ ��ġ�ϱ�
		Solution1.solution9(123);
		
		// lv1 ���� �ڸ��� ���ϱ�
		Solution1.solution10(123);
		
		// lv1 �ڿ����� ������ �迭�� �����
		Solution1.solution11(12345);
		
		//lv1 ������ �Ǻ�
		Solution1.solution12(123);

		//lv1 ���ڿ� ������ �ٲٱ�		
		Solution1.solution13("-1234");
		
		//lv1 �̻��� ���� �����		
		Solution1.solution14("1");
		
		//lv1 ����� ��
		Solution1.solution15(5);
		
		//lv1 ������ȣ
		Solution1.solution16("a B z",4);
		
		//lv1 �Ҽ�ã��
		Solution1.solution17(10);
		
		//lv1���ڼ��ڼ�
		Solution1.solution18(4);
		
		//lv1 ���￡�� �輭��ã�� 
		Solution1.solution19(new String[]{"Park","Kim"});
		
		Solution1.solution20("1234a");
		
		//lv1 ���ڿ� ������������ ��ġ�ϱ�
		Solution1.solution21("Zbcdefg");
		
		//lv1 �� ���� ������ ��
		Solution1.solution22(1,1000000);		
		
		//lv1 �������ڴ� �Ⱦ�
		Solution1.solution23(new int[]{1,1,3,3,0,1,1});

		//lv1 ��� ���� ��������
		Solution1.solution25("qwer");

		//lv1 k��° ��		[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]
		int arr26f[] = {1, 5, 2, 6, 3, 7, 4};
		int arr26s[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		Solution1.solution26(arr26f, arr26s);
		
		//lv1 ������ �ݾ� ����ϱ�
		Solution1.solution27(3,20,4);
		
		//lv1 �� �� �̾Ƽ� ���ϱ�
		int arr27f[] = {2,1,3,4,1};
		int arr27s[] = {5,0,2,7};
		Solution1.solution28(arr27s);
		
		//lv1 2016�� (����)
		Solution1.solution28(5,24);
		
		//lv1 ���¼��ڴ��ϱ�
		int arr29f[] = {3,4,1,6};
		Solution1.solution29(arr29f);
		
		
		//lv1 ���ϸ�
		int arr30[] = {3,1,2,3};
		int arr30s[] = {3,3,3,2,2,4};
		int arr30t[] = {3,3,3,2,2,2};
		Solution1.solution30(arr30t);
		
		
		/*
		int[][] arr28f = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int[][] arr28s = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int[][] arr28t = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		*/
		
		/*�Ÿ��α�
		System.out.println("�Ÿ��α�");
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
