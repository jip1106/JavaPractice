package pkg.programers.week5;

import java.util.ArrayList;
import java.util.Collections;

public class Week4Level1 {
	
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
}
