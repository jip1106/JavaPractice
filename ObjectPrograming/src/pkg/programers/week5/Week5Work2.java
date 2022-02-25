package pkg.programers.week5;

import java.util.ArrayList;
import java.util.Arrays;

import pkb.common.Common;

//��� �׵θ� ȸ���ϱ�
/*

rows x columns ũ���� ����� �ֽ��ϴ�. ��Ŀ��� 1���� rows x columns������ ���ڰ� �� �پ� ������� �����ֽ��ϴ�. 
�� ��Ŀ��� ���簢�� ����� ������ ���� �� ������, �׵θ� �κп� �ִ� ���ڵ��� �ð�������� ȸ����Ű�� �մϴ�. �� ȸ���� (x1, y1, x2, y2)�� ���� 4���� ǥ���ϸ�, �� �ǹ̴� ������ �����ϴ�.

x1 �� y1 ������ x2 �� y2 �������� ������ �ش��ϴ� ���簢������ �׵θ��� �ִ� ���ڵ��� �� ĭ�� �ð�������� ȸ���մϴ�.
������ 6 x 6 ũ�� ����� �����Դϴ�.

1  2  3  4  5  6 
7  8  9  10 11 12
13 14 15 16 17 18
19 20 21 22 23 24
25 26 27 28 29 30
31 32 33 34 35 36

�� ��Ŀ� (2, 2, 5, 4) ȸ���� �����ϸ�, �Ʒ� �׸��� ���� 2�� 2������ 5�� 4������ ������ �׵θ��� �ð�������� ȸ���մϴ�. �̶�, �߾��� 15�� 21�� �ִ� ������ ȸ������ �ʴ� ���� �����ϼ���.


	{2,2,5,4},
	{3,3,6,6},
	{5,1,6,3}
			
 * */
public class Week5Work2 {
	public static int[] arrayRotation(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];
		
		int arrVal[][] = new int[rows][columns];
		
		int num = 0;
		//�ε����� �迭 �ε����� �°� �������� ������ ������ �ٸ��� ������Ѵ�..........
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				arrVal[i][j] = ++num;
			}
		}
		
		for(int i=0; i<arrVal.length; i++){
			for(int j=0; j<arrVal[i].length;j++){
				System.out.print(arrVal[i][j] + " ");
			}
			System.out.println();
		}
		

		int tmpArrVal[][] = Arrays.copyOf(arrVal, arrVal.length);
		
		for(int i=0; i<queries.length;i++){
			int arrXY[] = queries[i];	//2,2		5,4
			
			//���� �迭�� �°� �ε��� ������
			int x1 = arrXY[1] - 1; 
			int y1 = arrXY[0] - 1;
			int x2 = arrXY[3] - 1;
			int y2 = arrXY[2] - 1;
			
			System.out.println("(x1,y1)" + "(" + x1 + "," + y1 + ")");
			System.out.println("(x2,y2)" + "(" + x2 + "," + y2 + ")");
			System.out.println();
			//����
			for(int j=y1; j<=x2; j++){ 
				System.out.println("arrVal[" + j + "][" + y1 +  "]" + arrVal[j][y1]);
			}
			
			
		}
		
        return answer;
	}
}
