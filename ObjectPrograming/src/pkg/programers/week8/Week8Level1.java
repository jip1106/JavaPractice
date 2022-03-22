package pkg.programers.week8;
import java.util.*;

import pkb.common.Common;

public class Week8Level1 {
	//숫자 문자열과 영단어
	/*다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

	1478 → "one4seveneight"
	234567 → "23four5six7"
	10203 → "1zerotwozero3"
	이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
	
	숫자	영단어
	0	zero
	1	one
	2	two
	3	three
	4	four
	5	five
	6	six
	7	seven
	8	eight
	9	nine
	
	
	입출력 예
			s			result
	"one4seveneight"	1478
	"23four5six7"		234567
	"2three45sixseven"	234567
	"123"				123
	*/
	//숫자 문자열과 영단어
	public static int numStringAndEnglishWord(String s){
		int answer = 0;
		
		String keyArr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int len = keyArr.length;
		
		for(int i=0; i<len;i++){
			if(s.contains(keyArr[i])){
				s = s.replace(keyArr[i], findEnglishNum(keyArr[i]));
			}
		}
		
		answer = Integer.parseInt(s);
		
		return answer;
	}
	
	//숫자 문자열과 영단어
	public static String findEnglishNum(String key){
		String rtnVal = "";
		HashMap<String, String> numMap = new HashMap<String ,String>();
		
		numMap.put("zero",	"0");
		numMap.put("one",	"1");
		numMap.put("two",	"2");
		numMap.put("three",	"3");
		numMap.put("four",	"4");
		numMap.put("five",	"5");
		numMap.put("six",	"6");
		numMap.put("seven",	"7");
		numMap.put("eight",	"8");
		numMap.put("nine",	"9");
		
		rtnVal = numMap.get(key) == null ? "" : numMap.get(key);
				
		return rtnVal;
	}
	
	
	//최소직사각형
	public static int minRectangle(int[][] sizes){
		int answer = 0;
		
		ArrayList<Integer> maxList = new ArrayList<Integer>();
		ArrayList<Integer> minList = new ArrayList<Integer>();
		
		for(int i=0; i<sizes.length; i++){
			maxList.add(Math.max(sizes[i][0], sizes[i][1]));
			minList.add(Math.min(sizes[i][0], sizes[i][1]));
		}
		
		answer = Collections.max(maxList) * Collections.max(minList);
		
		System.out.println(answer);
		
		return answer;
	}
	
	/*
		1.  다트 게임은 총 3번의 기회로 구성된다.
		2.  각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
		3.  점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
		
		4.  옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 [해당 점수와 바로 전에 얻은 점수를 각 2배]로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
		
		5.  스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
		6.  스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
		
		7.  스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
		8.  Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
		9.  스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
		10. 0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
		
		
		"점수|보너스|[옵션]"으로 이루어진 문자열 3세트.
		예) 1S 2D* 3T
		
		점수는 0에서 10 사이의 정수이다.
		보너스는 S, D, T 중 하나이다.
		옵선은 *이나 # 중 하나이며, 없을 수도 있다.
		
		1	1S 2D* 3T		37		1의1제곱*2 + 2의2제곱 2 + 3의3제곱
		2	1D 2S# 10S		9		1의2제곱 + 2의1제곱  * (-1) + 10의1제곱
		3	1D 2S 0T		3		1의2제곱 + 2의1제곱 + 0의3제곱
		
		4	1S* 2T* 3S	23		1의1제곱 * 2 * 2 + 2의3제곱 * 2 + 3의제곱
		
		5	1D#2S*3S	5		12 * (-1) * 2 + 21 * 2 + 31
		6	1T2D3D#		-4		13 + 22 + 32 * (-1)
		7	1D2S3T*		59		12 + 21 * 2 + 33 * 2
	 * */
	//다트게임
	public static int dartGame(String dartResult){
		int answer = 0;
		 
		//S, D, T, *, #
		char[] cArr = dartResult.toCharArray();
		int length = cArr.length;
		
		//01 234 56
		//1S 2D* 3T
		
        return answer;
	}
	

	
}
