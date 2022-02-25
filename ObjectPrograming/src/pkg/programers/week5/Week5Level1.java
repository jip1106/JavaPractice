package pkg.programers.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
		
		//체육복
		/*
		  점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 
		  다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
		  학생들의 번호는 체격 순으로 매겨져 있어, 
		  바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
		  예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
		  체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

			전체 학생의 수 n, 
			체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 
			여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
			체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
	
			제한사항
			전체 학생의 수는 2명 이상 30명 이하입니다.
			체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
			여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
			여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
			
			*** 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 
			
			이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 
			남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
		 */
		
		//Week5Level1.gymSuit(10, new int[]{1,4,8,9},  new int[]{1,4,5,10,7,3});
		
		public static int gymSuit(int n, int[] lost, int[] reserve){
			int answer = 0;
	        //n => 전체 학생 수
	        //lost => 도난당한 학생 번호
	        //여벌의 체육복을 가져온 학생들의 번호
	        //Week5Level1.gymSuit(5, new int[]{5,4,2},  new int[]{2,4});

	        ArrayList<Integer> lostList = new ArrayList<Integer>();
	        ArrayList<Integer> reserveList = new ArrayList<Integer>();

	        //도난 당한 학생 리스트
	        for(int tmp : lost){
	            lostList.add(tmp);
	        }
				
	        //빌려줄 수 있는 학생 리스트
	        for(int tmp : reserve){
	            reserveList.add(tmp);
	        }
	        
	        /**********테스트데이터13 18*************/
	        Collections.sort(lostList);
	        Collections.sort(reserveList);
	        /***********************/
	        
	        				
	        for(int i=0; i<lostList.size(); i++){	//잃어버린 학생 번호
	            int lostNum = lostList.get(i);
	        
	            //빌려줄 수 있는 학생 리스트 수정
	            for(int j = 0; j<reserveList.size(); j++){
	                if(reserveList.get(j) == lostNum ){
	                    reserveList.remove(j);
	                    lostList.remove(i);
	                    /**********테스트데이터13 18*************/
	                    i--;
	                }
	            }
	            
	        }
	        	
	        for(int i=0; i<reserveList.size(); i++){	//빌려줄 수 있는 학생 리스트
	            int reserveNum = reserveList.get(i);

	            //도난 당한 학생 리스트 수정
	            for(int j=0; j<lostList.size(); j++){
	                if(lostList.get(j) == reserveNum -1 || lostList.get(j) == reserveNum + 1 || lostList.get(j) == reserveNum){
	                    lostList.remove(j);
	                    break;
	                }
	            }
	        }
				
			answer = n - lostList.size();
			
			System.out.println(answer);

	        return answer;
		}
		
		
		
		//
		/*
		 * 슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 
		 * 그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다. 
		 * 원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.

			이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다.
			오렐리를 위해 실패율을 구하는 코드를 완성하라.
			
			실패율은 다음과 같이 정의한다.
				** 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
			
			전체 스테이지의 개수 N, 
			게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 
			실패율이 높은 스테이지부터 내림차순으로 
			스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
			
			제한사항
			스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
			stages의 길이는 1 이상 200,000 이하이다.
			stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
			
			각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
			단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
			만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
			스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
			
			입출력 예
			N		stages						result
			5	[2,1,2,6,2,4,3,3]			[3,4,2,1,5]
			4	[4,4,4,4,4]					[4,1,2,3]
			
			입출력 예 설명
			입출력 예 #1
			1번 스테이지에는 총 8명의 사용자가 도전했으며, 이 중 1명의 사용자가 아직 클리어하지 못했다. 따라서 1번 스테이지의 실패율은 다음과 같다.
			
			1 번 스테이지 실패율 : 1/8
			2번 스테이지에는 총 7명의 사용자가 도전했으며, 이 중 3명의 사용자가 아직 클리어하지 못했다. 따라서 2번 스테이지의 실패율은 다음과 같다.
			
			2 번 스테이지 실패율 : 3/7
			마찬가지로 나머지 스테이지의 실패율은 다음과 같다.
			
			3 번 스테이지 실패율 : 2/4
			4번 스테이지 실패율 : 1/2
			5번 스테이지 실패율 : 0/1
			각 스테이지의 번호를 실패율의 내림차순으로 정렬하면 다음과 같다.
			
			[3,4,2,1,5]
			입출력 예 #2
			
			모든 사용자가 마지막 스테이지에 있으므로 4번 스테이지의 실패율은 1이며 나머지 스테이지의 실패율은 0이다.
			
			[4,1,2,3]
			
			N : 전체 스테이지 개수
			실패율은 다음과 같이 정의한다.
				** 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		 */
		//1,2,2,1,3
		 public static int[] failureRate(int N, int[] stages) {
			 int[] answer = new int[N];
			 
			 int stageSize = stages.length;			//사용자의 수
			 int nowSize = 0;
			 int passSize = 0;
			 Double []failureRate = new Double[N];
			 
			 // N : 5 	스테이지 : 0,1,2,3,4 ...
			 for(int i=1; i<=N; i++){	//스테이지 갯수 만큼 for문
				 nowSize = 0;
				 passSize = 0;
				 
				 for(int j=0; j<stageSize; j++){
					 int nowStage = stages[j];
					 
					 if(nowStage == i){
						 nowSize++;
						 passSize++;
					 }else if(nowStage > i ){
						 passSize++;
					 }
				 }
				 System.out.print("nowSize :: " + nowSize + " /// passSize :: " + passSize);				 
				 System.out.println();
				 
				 if(passSize == 0){
					 failureRate[i-1] = 0.0;
				 }else{
					 failureRate[i-1] = (double)nowSize/(double)passSize;
				 }
				 

			 }
			 
			 print(failureRate);
			 
			 
			HashMap<Integer , Double> hMap = new HashMap<Integer, Double>();
			for(int i=0; i<failureRate.length;i++){
				hMap.put(i+1,failureRate[i]);	
			}
			//실패율 내림차순 정렬
			Arrays.sort(failureRate, Collections.reverseOrder());
			
			List<Integer> listKeySet = new ArrayList<Integer>(hMap.keySet());
			
			//********** 값 기준으로 key 내림차순 정렬하기 Collections.sort 확인 필요
			Collections.sort(listKeySet, (key, value) -> (hMap.get(value).compareTo(hMap.get(key)))); 
				
			int i=0;
			for(Integer key : listKeySet) {
				answer[i++] = key;
			}
			
			print(answer);
			
			
			return answer;
		}
		
		
		
		
		//리스트 출력 함수
		public static void print(Object obj){
			System.out.println();
			if( obj instanceof ArrayList){
				ArrayList<Object> list = (ArrayList<Object>)obj;
				for(Object tmp : list){
					System.out.print(tmp + " , ");
				}
			}else if(obj instanceof int[]){
				
				int tmpArr[] = (int[])obj;
				
				for(int i=0; i<tmpArr.length; i++){
					System.out.print(tmpArr[i] + " , ");
				}
			}else if(obj instanceof double[]){
				
				double tmpArr[] = (double[])obj;
				
				for(int i=0; i<tmpArr.length; i++){
					System.out.print(tmpArr[i] + " , ");
				}
			}else if(obj instanceof Double[]){
				
				Double tmpArr[] = (Double[])obj;
				
				for(int i=0; i<tmpArr.length; i++){
					System.out.print(tmpArr[i] + " , ");
				}
			}
			
			
			
		}
	
}
