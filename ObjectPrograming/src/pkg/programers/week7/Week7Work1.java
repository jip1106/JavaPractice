package pkg.programers.week7;

import pkb.common.Common;

/*이진변환*/
public class Week7Work1 {
	public static int[] binaryConvert(String s) {
		int[] answer = {0,0};
		
		int zeroCnt = 0;			//제거할 0의 개수
		int afterLength = 0;		//0 제거 후 길이
		
		String tmpString = s;
		
		while(tmpString.length() != 1) {
			//제거할 0의 개수
			zeroCnt = getZeroLength(tmpString);
			System.out.println("zeroCnt : " + zeroCnt);
			
			//0제거 후 길이
			afterLength = getAfterRemoveZeroLength(tmpString);
			System.out.println("zeroCnt : " + afterLength);
			
			//2진변환 결과
			tmpString = Integer.toBinaryString(afterLength);
			
			answer[0]++;
			answer[1]+=zeroCnt;
			
		}
		
		Common.printArray(answer);
		
		return answer;
	}
	
	public static int getZeroLength(String s) {
		int rtnVal = 0;
		rtnVal  = getAfterRemoveString(s,1).length();
		
		return rtnVal;
	}
	
	public static int getAfterRemoveZeroLength(String s) {
		int rtnVal = 0;
		rtnVal  = getAfterRemoveString(s,0).length();
		
		return rtnVal;
	}
	
	public static String getAfterRemoveString(String s, int type) {
		String rtnVal = s;
		rtnVal = s.replaceAll(String.valueOf(type), "");
		
		return rtnVal;
	}

}


/*
0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.

x의 모든 0을 제거합니다.
x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.

0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.

	s				result
"110010101001"		[3,8]
"01110"				[3,3]
"1111111"			[4,1]


 */