package pkg.programers.week6;
import java.util.*;

public class Week6Level1 {
	/*크레인 인형뽑기 게임 
	  
	  [ 0,0 0,1 0,2 0,3 0,4
	  	
	  	[0,	0,	0,	0,	0],
	  	[0,	0,	1,	0,	3],
	  	[0,	2,	5,	0,	1],
	  	[4,	2,	4,	4,	2],
	  	[3,	5,	1,	3,	1]
	  	
	  	 1 2 3 4 5
	  ]	
	  
	  [1,5,3,5,1,2,1,4]	4
	  
	  4
	  2
	  3
	  1
	  1
	  3
	  4
	*/
	
	// 
	public static int cranePuppet(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> resultStack = new Stack<Integer>();
        
        int size = moves.length;
        int length = board.length;
        int insertValue =0;
        int j=0;
    
        
        for(int i=0; i<size; i++){
        	j=0;

        	while(board[j][moves[i]-1] == 0){
        		j=j+1;
        		
        		if(j>=length-1){
        			break;
        		}
        	}
        	insertValue = board[j][moves[i]-1];
        	board[j][moves[i]-1] = 0;
        	
        	
        	if(insertValue != 0){	//문제 조건 잘 읽기
	        	if(!resultStack.empty() && resultStack.peek() == insertValue){
	        		resultStack.pop();
	        		answer+=2;
	        	}else{
	        		resultStack.push(insertValue);
	        	}
        	}
        }
        
        return answer;
    
	}
	
	
}
