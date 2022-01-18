package pkg.progromers.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//day1 신고결과 받기
public class Solution1 {
//	id_list => 이용자의 ID가 담긴 배열
//	report	=> 이용자가 신고한 이용자(신고 당한 이용자 배열)
//	k		=> 정지 기준
//	각 유저별로 처리  결과 메일을 받은 횟수를 배열에 담아 return
	public int[] solution(String[] id_list, String[] report, int k){
		int[] answer = {};
		
		ArrayList<String> list1 = new ArrayList<String>();		// 신고한 사람
		ArrayList<String> list2 = new ArrayList<String>();		// 신고 당한 사람
		
		int reportLen = report.length;
		
		for(int i=0; i < reportLen; i++){
			String list1Val = report[i].split("\\s")[0];
			String list2Val = report[i].split("\\s")[1];
			
			list1.add(list1Val);
			list2.add(list2Val);
		}
		
		//resultMap => key(신고 한 사람) value(신고 횟수)
		HashMap<String,Integer> resultMap = new HashMap<String, Integer>();
		
		
		//tmpMap 에는 신고당한 사람, 신고당한 횟수가 들어 있음(한 사람이 같은 사람을 신고해도 카운팅 되어 있는 상태)
		HashMap<String,Integer> tmpMap = new HashMap<String,Integer>();
		list2.forEach(str -> tmpMap.put(str, Collections.frequency(list2, str)));

		tmpMap.forEach((key, value) -> {
			System.out.println(key + " : " + value);
			
			if(value >= k){
				
			}
			System.out.println("");
		});
		
		
		
		tmpMap.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
		return null;

		/*
		
		//resultMap => key:신고 한 사람 , value : 메일 받는 횟수
		answer = new int[reportLen];
		
		for(int i=0; i< reportLen; i++){
			answer[i] = resultMap.get(id_list[i]);
		}
			
		
		return answer;
		*/
	}

}
/*
 문제 설명
 
 - 게시판 불량 이용자를 신고 , 처리 결과를 메일로 발송하는 시스템 개발
   * 각 유저는 한 번에 한 명의 유저를 신고할 수 있음
    - 신고 횟수에 제한 X 서로 다른 유저를 계속해서 신고 할 수 있음
    - 동일한 유저에 대한 신고 횟수는 1회로 처리
    
   * k번 이상 신고된 유저는 게시판 이용이 정지되고, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송  
   
    전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시
   
   ["muzi", "frodo", "apeach", "neo"]

   유저 ID	유저가 신고한 ID	설명
	muzi 	-> frodo
	apeach 	-> frodo
	
	frodo 	-> neo
	muzi 	-> neo
	
	apeach 	-> muzi
	
	
	frodo 	2
	neo 	2
	muzi 	1
	apeach 	0
	
	
	id_list => 이용자의 ID가 담긴 배열
	report	=> 이용자가 신고한 이용자(신고 당한 이용자 배열)
	k		=> 정지 기준
	
	각 유저별로 처리  결과 메일을 받은 횟수를 배열에 담아 return 
	
	입출력 ex)
	id_list									report															k	result
	["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
	["con", "ryan"]						["ryan con", "ryan con", "ryan con", "ryan con"]					3	[0,0]
	

*/
 