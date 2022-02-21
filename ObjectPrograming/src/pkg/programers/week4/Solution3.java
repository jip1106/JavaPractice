package pkg.programers.week4;

//거리두기
public class Solution3 {
		
/*	 
	 places	
	 [
	 	["POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"], 
	 	["POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"], 
	 	["PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"], 
	 	["OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"], 
	 	["PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"]
	 ]	
*/			 
	public int[] solution(String[][] places) {
		int[] answer = new int[places.length]; 

        for(int p = 0; p < places.length; p++) {
            answer[p] = chkPlace(places[p]);
        }

        return answer;
	} 
			
	// 현재 방이 거리두기를 지키면 1 아니면 0을 반환
		 public int chkPlace(String[] p){
			 //상 우 좌 하 좌표
			 int[] xMove = {0, 1, -1, 0}; 
			 int[] yMove = {1, 0, 0, -1};
			 
			 //대각선 좌표
			 int[] dxMove = {1, 1, -1, -1}; 
			 int[] dyMove = {1, -1, -1, 1};
			 /*
			 [
			 	P O O O P 
			 	O X X O X 
			 	O P X P X 
			 	O O X O X 
			 	P O X X P
			 ]
			 */
			 for(int i = 0; i < 5; i++){			//가로	
				 for(int j = 0; j < 5; j++){ 		//세로
					 // 현재 지정한 위치에 사람이 있을 경우 
					 if(p[i].charAt(j) == 'P'){ 
						 for(int k = 0; k < 4; k++){ 
							 //다음칸
							 int x = j + xMove[k]; 
							 int y = i + yMove[k];
							 
							 // 범위안에 계산한 상하좌우 x, y값이 있을 경우
							 if(chkIdx(x, y)){ 
								 // 바로 붙어있는 경우
								 if(p[y].charAt(x) == 'P') {
									 return 0; 
								 }
								 
								 //다다음칸
								 int x1 = j + xMove[k]*2; 
								 int y1 = i + yMove[k]*2;
								 if(chkIdx(x1, y1) && p[y].charAt(x) == 'O' && p[y1].charAt(x1) == 'P') {
									 return 0; 
								 }
								 
								 //대각선
								 x = j + dxMove[k]; 
								 y = i + dyMove[k]; 
								 
								 // 범위안에 계산한 대각선 x, y값이 있으면서 맨하튼 거리를 지키지 못한 경우 0리턴
								 if(chkIdx(x, y) && p[y].charAt(x) == 'P' && (p[y].charAt(j) == 'O' || p[i].charAt(x) == 'O')) {
									 return 0;
							 	}
						 	} 
						} 
					} 
				} 
			 }
			 
			 return 1; 
		 }

	 	private boolean chkIdx(int x, int y){
	 		boolean rtnVal = (x >= 0 && x < 5) && (y >= 0 && y < 5) ? true : false;
			return rtnVal;
		}
}

		 




/*
 * 대기실은 5개이며, 각 대기실은 5x5 크기입니다.
거리두기를 위하여 응시자들 끼리는 맨해튼 거리가 2 이하로 앉지 말아 주세요. 단 응시자가 앉아있는 자리 사이가 파티션으로 막혀 있을 경우에는 허용합니다.

P : 앉은 자리	O : 빈 테이블	X : 파티션

두 테이블 T1, T2가 행렬 (r1, c1), (r2, c2)에 각각 위치하고 있다면, T1, T2 사이의 맨해튼 거리는 |r1 - r2| + |c1 - c2| 입니다. ↩

places	
[
	["POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"], 
	["POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"], 
	["PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"], 
	["OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"], 
	["PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"]
]	

result [1, 0, 1, 1, 1]

입출력 예 설명
입출력 예 #1

첫 번째 대기실

No.	0	1	2	3	4
0	P	O	O	O	P
1	O	X	X	O	X
2	O	P	X	P	X
3	O	O	X	O	X
4	P	O	X	X	P
모든 응시자가 거리두기를 지키고 있습니다.
두 번째 대기실

No.	0	1	2	3	4
0	P	O	O	P	X
1	O	X	P	X	P
2	P	X	X	X	O
3	O	X	X	X	O
4	O	O	O	P	P
(0, 0) 자리의 응시자와 (2, 0) 자리의 응시자가 거리두기를 지키고 있지 않습니다.
(1, 2) 자리의 응시자와 (0, 3) 자리의 응시자가 거리두기를 지키고 있지 않습니다.
(4, 3) 자리의 응시자와 (4, 4) 자리의 응시자가 거리두기를 지키고 있지 않습니다.
세 번째 대기실

No.	0	1	2	3	4
0	P	X	O	P	X
1	O	X	O	X	P
2	O	X	P	O	X
3	O	X	X	O	P
4	P	X	P	O	X
모든 응시자가 거리두기를 지키고 있습니다.
네 번째 대기실

No.	0	1	2	3	4
0	O	O	O	X	X
1	X	O	O	O	X
2	O	O	O	X	X
3	O	X	O	O	X
4	O	O	O	O	O
대기실에 응시자가 없으므로 거리두기를 지키고 있습니다.
다섯 번째 대기실

No.	0	1	2	3	4
0	P	X	P	X	P
1	X	P	X	P	X
2	P	X	P	X	P
3	X	P	X	P	X
4	P	X	P	X	P
모든 응시자가 거리두기를 지키고 있습니다.
두 번째 대기실을 제외한 모든 대기실에서 거리두기가 지켜지고 있으므로, 배열 [1, 0, 1, 1, 1]을 return 합니다.

제한시간 안내
정확성 테스트 : 10초
두 테이블 T1, T2가 행렬 (r1, c1), (r2, c2)에 각각 위치하고 있다면, T1, T2 사이의 맨해튼 거리는 |r1 - r2| + |c1 - c2| 입니다. ↩

*/