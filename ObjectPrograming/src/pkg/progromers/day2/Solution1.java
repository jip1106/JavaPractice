package pkg.progromers.day2;

public class Solution1 {
	public long[] solution(int x, int n) {
        long[] answer = {};
        
        answer = new long[n];
        
        for(int i=0; i<n; i++){
        	if(i==0){
        		answer[i] = x;
        	}else{
        		answer[i] = answer[i-1] + x;
        	}
        }
        
        return answer;
    }
	
	public void print(long [] answer){
		for(int i=0; i<answer.length; i++){
			System.out.print(answer[i] + " ");
		}
		System.out.println();
	}

}

/*
 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

	제한 조건
	x는 -10000000 이상, 10000000 이하인 정수입니다.
	n은 1000 이하인 자연수입니다.
	
	x	n	answer
	2	5	[2,4,6,8,10]
	4	3	[4,8,12]
	-4	2	[-4, -8]
 
 * */
