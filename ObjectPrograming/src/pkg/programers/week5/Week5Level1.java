package pkg.programers.week5;

import java.util.ArrayList;
import java.util.Collections;

public class Week5Level1 {
	
	//lv1 약수의 개수와 덧셈
	/*
	 * 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	 */
	public static int divisorCntandSum(int left, int right) {
		int answer = 0;
		
		ArrayList<Integer> tmpList = new ArrayList<Integer>();
		
		for(int i=left; i<=right; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					cnt ++;
				}
			}
			
			if(cnt %2 == 0) {
				tmpList.add(i);
			}else {
				tmpList.add(-i);
			}
		}
		
		for(int tmp : tmpList) {
			answer += tmp;
		}
		
		
		return answer;
	}
	
	//lv1 문자열 내마음대로 정렬하기
	/*
	 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 
	 * 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
	 * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 
	 * strings를 정렬합니다.
	 */
	public static String[] stringSort(String[] strings, int n) {
		String[] answer = {};
		
		ArrayList<String> answerList = new ArrayList<String>();
		
		for(String tmp : strings) {
			answerList.add(tmp.charAt(n) + tmp);
		}
		
		Collections.sort(answerList);
		
		answer = new String[answerList.size()];
		
		for(int i=0; i<answerList.size(); i++) {
			answer[i] = answerList.get(i).substring(1);
		}
		
		
		return answer;
	}
	
	//lv1 3진법 뒤집기
	/*
		자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
		n은 1 이상 100,000,000 이하인 자연수입니다.
		n	result
		45	7
		125	229
		
		n (10진법)	n (3진법)		앞뒤 반전(3진법)	10진법으로 표현
		45			1200			0021			7
	 */
		public static int reverse3Notation(int n) {
	        int answer = 0;
	        
	        StringBuilder sb = new StringBuilder();
			int current = n;
			    
		    while(current >= 1){
		        sb.append(current % 3);
		        current /= 3;
		    }
	        
	        System.out.println(sb.toString());
	        
	        //0021 앞뒤 반전 한 값
	        char tmpArr[] = sb.toString().toCharArray();
	        
	        for(int i=0; i<tmpArr.length; i++){
	        	int size = tmpArr.length-i;
	        	int addSum = ( (int)tmpArr[i] - 48 ) * ((int)Math.pow(3, size-1 ) );
	        	
	        	answer += addSum;
	        }
	        
	        
	        return answer;
	    }
		
		
	
}
