package pkg.programers.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
		
		/*
		 * 주어진 숫자 중 3개의 수를 더했을 때 
		 * 소수가 되는 경우의 개수를 구하려고 합니다. 
		 * 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 
		 * 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
		 * 입출력 예 #1  
		 *  [1,2,3,4]	1 
		     [1,2,4]를 이용해서 7을 만들 수 있습니다.
		   
		 *	[1,2,7,6,4]	4 
		 *
		 * 입출력 예 #2
			[1,2,4]를 이용해서 7을 만들 수 있습니다.
			[1,4,6]을 이용해서 11을 만들 수 있습니다.
			[2,4,7]을 이용해서 13을 만들 수 있습니다.
			[4,6,7]을 이용해서 17을 만들 수 있습니다.
		 */
		public static int makeDecimal(int nums[]){
			int answer = 0;
			int sum = 0;			//배열 중 3개를 더한 수
			/*  [1,2,3,4]
			 * */
			
			for(int i = 0; i < nums.length; i++) {
	        	
	        	for(int j = i + 1; j < nums.length; j++) {
	        		for(int h = j + 1; h < nums.length; h++) {
	        			sum = nums[i] + nums[j] + nums[h];
	        			System.out.println("sum : " + sum);
	        			if(confirmDecimal(sum)){
	        				answer ++;
	        			}
	        		}
	        	}
	        }
			
			System.out.println("소수 만들기 : " + answer);
			
			return answer;
		}
		
		//소수확인
		private static boolean confirmDecimal(int num){
			boolean result = true;
			int cnt = 0;
			
			for(int i=2; i<=num; i++){
				if(num%i==0){
					cnt ++;
				}
				
				if(cnt > 1){
					result = false;
					break;
				}
			}
			return result;
		}
		
		
		//모의고사
		/*
		  	수포자는 수학을 포기한 사람의 준말입니다. 
		  	수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
		  	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

			1번 수포자가 찍는 방식: 1,2,3,4,5,  1,2,3,4,5, ...
			
			2번 수포자가 찍는 방식: 2,1,2,3,2,4,2,5,  2,1,2,3,2,4,2,5, ...
							  	
			3번 수포자가 찍는 방식: 3,3,1,1,2,2,4,4,5,5, 		3,3,1,1,2,2,4,4,5,5, ...
			
			1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 
			answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
			
			제한 조건
			시험은 최대 10,000 문제로 구성되어있습니다.
			문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
			가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
			입출력 예
			answers	return
			[1,2,3,4,5]	[1]
			[1,3,2,4,2]	[1,2,3]
		 * 
		 * */
		public int[] mockExam(int[] answers){
			 int[] answer = {};
			 
			 int[] p1 = new int[]{1,2,3,4,5};
			 int[] p2 = new int[]{2,1,2,3,2,4,2,5};
			 int[] p3 = new int[]{3,3,1,1,2,2,4,4,5,5};
			 
			 int size = answers.length;
			 
			 int answer1 = 0;
			 int answer2 = 0;
			 int answer3 = 0;
			 
			 for(int i=0; i<size; i++){
				 if(p1[i%size] == answers[i]) answer1++;
				 if(p2[i%size] == answers[i]) answer2++;
				 if(p3[i%size] == answers[i]) answer3++;
			 }
			 ArrayList<Integer> tmpList = new ArrayList<Integer>();
			 int max = Math.max(answer3,Math.max(answer1,answer2));
			 
			 if(max == answer1){
				 tmpList.add(1);
			 }
			 
			 if(max == answer2){
				 tmpList.add(2);
			 }
			 
			 if(max == answer3){
				 tmpList.add(3);
			 }
			 
			 Collections.sort(tmpList);
			 
			 answer = new int[tmpList.size()];
			 int i=0;
			 for(int tmp : tmpList){
				 answer[i++] = tmp;
				 System.out.println(answer[i-1]);
			 }
			 
			 return answer;
		}
		/*
		 * 키패드 누르기
		 *		 1 2 3 
		 *		 4 5 6 
		 *		 7 8 9
		 *		 * 0 #
		 *		   X		(통화버튼) 
		 *
		 *
		 	이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다.
			맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 엄지손가락을 사용하는 규칙은 다음과 같습니다.
			
			엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
			
			왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
			
			오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
			
			가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
			
			4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
			순서대로 누를 번호가 담긴 배열 numbers, 
			왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가 매개변수로 주어질 때, 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.
			
			[제한사항]
			numbers 배열의 크기는 1 이상 1,000 이하입니다.
			numbers 배열 원소의 값은 0 이상 9 이하인 정수입니다.
			hand는 "left" 또는 "right" 입니다.
			"left"는 왼손잡이, "right"는 오른손잡이를 의미합니다.
			왼손 엄지손가락을 사용한 경우는 L, 오른손 엄지손가락을 사용한 경우는 R을 순서대로 이어붙여 문자열 형태로 return 해주세요.
			
			입출력 예
			numbers								  hand		result
			[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
			[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
			[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]		"right"	"LLRLLRLLRL"
		 * */
		public static String keyPadTouch(int[] numbers, String hand){
			String answer = "";
			
			StringBuilder sb = new StringBuilder();
			
			String mainHand = hand.equals("right")? "R" : "L";
			
			
			int size = numbers.length;
			int keyPads[][]  = {{3,1}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}};	//0 ~ 9 좌표
			int leftPos[]  = {3,0};	//시작왼손
			int rightPos[] = {3,2};	//시작오른손
			
			for(int i=0; i<size; i++){
				
				switch(numbers[i]){
				case 1 : 
				case 4 : 
				case 7 : sb.append("L"); 
						 leftPos = keyPads[numbers[i]];
						 break;	//왼손
				case 3 : 
				case 6 :
				case 9 : sb.append("R");
						 rightPos = keyPads[numbers[i]];
						 break;	//오른손
				default : 
					// 2,5,8,0 번호에 대한 처리 
					int distLeft = Math.abs(keyPads[numbers[i]][0] - leftPos[0]) + Math.abs(keyPads[numbers[i]][1] - leftPos[1]);	 
					int distRight = Math.abs(keyPads[numbers[i]][0] - rightPos[0]) + Math.abs(keyPads[numbers[i]][1] - rightPos[1]);
					
					if(distLeft == distRight){
						sb.append(mainHand);
						
						
					}else if(distLeft > distRight){
						sb.append("R");
						rightPos = keyPads[numbers[i]];
					}else{
						sb.append("L");
						leftPos = keyPads[numbers[i]];
					}
					
					break;	//현재 왼손, 오른손에서 가까운거
				
				}
			}
			
			answer = sb.toString();
			System.out.println(answer);
			return answer;
		}
		
		
		
		//신규아이디 추천
		/*
			카카오에 입사한 신입 개발자 네오는 "카카오계정개발팀"에 배치되어, 
			카카오 서비스에 가입하는 유저들의 아이디를 생성하는 업무를 담당하게 되었습니다. 
			"네오"에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 
			입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것입니다.
			다음은 카카오 아이디의 규칙입니다.
			
			아이디의 길이는 3자 이상 15자 이하여야 합니다.
			아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
			단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
			"네오"는 다음과 같이 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가 카카오 아이디 규칙에 맞는 지 검사하고 규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천해 주려고 합니다.
			신규 유저가 입력한 아이디가 new_id 라고 한다면,
			
			1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
			2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
			3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
			4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
			5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
			6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
			     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
			7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

		 */
		public static String newIdSuggest(String new_id){
	        
			String answer = new_id.toLowerCase();    //1
	        
	        answer = answer.replaceAll("[^a-z0-9-_.]","");    //2
	        answer = answer.replaceAll("[.]{2,}",".");    //3
	        answer = answer.replaceAll("^[.]|[.]$","");    //4
	        
	        //5
	        if ("".equals(answer)){
	            answer += "a";
	        }
	        
	        //6
	       if(answer.length() >= 16){
	    	   answer = answer.substring(0,15);
	    	   if(answer.lastIndexOf('.') == 14){
	    		   answer = answer.substring(0,14);
	    	   }
	       }
	        
	        //7
	       if(answer.length() <= 2){
	    	   while(answer.length() != 3){
	    		   answer +=  answer.charAt(answer.length()-1);
	    	   }
	    	   
	       }
	        
	        System.out.println(answer);
	        		
	        return answer;
		}
		
		
	
}
