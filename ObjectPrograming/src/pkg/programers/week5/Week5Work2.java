package pkg.programers.week5;

import java.util.ArrayList;
import java.util.Arrays;

import pkb.common.Common;

//행렬 테두리 회전하기
/*

rows x columns 크기인 행렬이 있습니다. 행렬에는 1부터 rows x columns까지의 숫자가 한 줄씩 순서대로 적혀있습니다. 
이 행렬에서 직사각형 모양의 범위를 여러 번 선택해, 테두리 부분에 있는 숫자들을 시계방향으로 회전시키려 합니다. 각 회전은 (x1, y1, x2, y2)인 정수 4개로 표현하며, 그 의미는 다음과 같습니다.

x1 행 y1 열부터 x2 행 y2 열까지의 영역에 해당하는 직사각형에서 테두리에 있는 숫자들을 한 칸씩 시계방향으로 회전합니다.
다음은 6 x 6 크기 행렬의 예시입니다.

1  2  3  4  5  6 
7  8  9  10 11 12
13 14 15 16 17 18
19 20 21 22 23 24
25 26 27 28 29 30
31 32 33 34 35 36

이 행렬에 (2, 2, 5, 4) 회전을 적용하면, 아래 그림과 같이 2행 2열부터 5행 4열까지 영역의 테두리가 시계방향으로 회전합니다. 이때, 중앙의 15와 21이 있는 영역은 회전하지 않는 것을 주의하세요.


	{2,2,5,4},
	{3,3,6,6},
	{5,1,6,3}
			
 * */
public class Week5Work2 {
	public static int[] arrayRotation(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];
		
		int arrVal[][] = new int[rows][columns];
		
		int num = 0;
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
	
		//2,2 	-	5,4	=>4,3
		for(int i=0; i<queries.length;i++){
			int arrXY[] = queries[i];	//2,2		5,4
			
			int x1 = arrXY[0] - 1; 
			int y1 = arrXY[1] - 1;
			int x2 = arrXY[2] - 1;
			int y2 = arrXY[3] - 1;
			
			int tmp = arrVal[x1][y1];
			int min = arrVal[x1][y1];
			
			System.out.println("(x1,y1)" + "(" + x1 + "," + y1 + ")");
			System.out.println("(x2,y2)" + "(" + x2 + "," + y2 + ")");
			
			//왼쪽변 ↑
			for(int j=x1; j<x2; j++){
				arrVal[j][y1] = arrVal[j+1][y1];
				min = Math.min(min, arrVal[j][y1]);
			}
			//아래 변 ←
			for(int j=y1;j<y2;j++) {
				arrVal[x2][j] = arrVal[x2][j+1];
		        min = Math.min(min, arrVal[x2][j]);
			}
			//오른쪽변 ↓
			for(int j=x2;j>x1;j--) {
				arrVal[j][y2] = arrVal[j-1][y2];
	            min = Math.min(min, arrVal[j][y2]);
	        }
			//우측 변 →
	        for(int j=y2;j>y1;j--) {
	            arrVal[x1][j] = arrVal[x1][j-1];
	            min = Math.min(min, arrVal[x1][j]);
	        }
	        
	        arrVal[x1][y1+1]  = tmp;
	        
			answer[i] = min;
		}
		
		
        return answer;
	}
	
	public static boolean chkIdx(int a, int b,int rows, int columns){
		return  (a >=0 && a <= rows-1) && (b >= 0 && b<= columns-1);
		
	}
}
