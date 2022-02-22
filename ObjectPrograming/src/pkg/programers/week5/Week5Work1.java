package pkg.programers.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Week5Work1 {
	//가장 큰 수
	/*
		0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
		
		예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
		
		0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
		
		제한 사항
		numbers의 길이는 1 이상 100,000 이하입니다.
		numbers의 원소는 0 이상 1,000 이하입니다.
		정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
		입출력 예
		numbers	return
		[6, 10, 2]	"6210"
		[3, 30, 34, 5, 9]	"9534330"

	 */
	public static String mostBigNumber(int[] numbers){
		String answer = "";
		int size = numbers.length;
		
		StringBuilder sb = new StringBuilder();
		String strNumbers[] = new String[size];
		
		//String 배열로 변경
		for(int i=0; i<size; i++) {
			strNumbers[i] = String.valueOf(numbers[i]);
		}
		
		//내림차순 정렬
		Arrays.sort(strNumbers, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});
		
		for(int j=0; j<size; j++) {
			sb.append(strNumbers[j]);
		}
		
		answer = sb.toString();
		
		if("0".equals(answer.substring(0,1))){
			answer = "0";
		}
	
		answer = sb.toString();
		
		System.out.println(answer);
        return answer;
	}

}
