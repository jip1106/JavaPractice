package pkg.programers.day1;

import java.util.ArrayList;
import java.util.HashMap;

//day1 신고결과 받기
public class Solution1 {
//	id_list => 이용자의 ID가 담긴 배열
//	report	=> 이용자가 신고한 이용자(신고 당한 이용자 배열)
//	k		=> 정지 기준
//	각 유저별로 처리  결과 메일을 받은 횟수를 배열에 담아 return
	public int[] solution(String[] id_list, String[] report, int k){
		int[] answer = {};
		int userLen = id_list.length;
		answer = new int[userLen];
		
		//이용자와 idx 를 담을 맵
		HashMap<String, Integer> idxMap = new HashMap<String, Integer>();	 

		//key:신고 당한사람 	id	value: 신고한 사람의 idx를 기록할 list
		HashMap<String, ArrayList<Integer>> listMap = new HashMap<String, ArrayList<Integer>>(); 	
		
		//이용자id, idx 를 차례대로 맵에 담음
		for(int i=0; i<userLen; i++){
			idxMap.put(id_list[i], i);
		}
		
		//report => A B 형식 , A가 B를 신고
		ArrayList<Integer> tmp = null;
		for(String reportVal : report){
			String[] idArr = reportVal.split("\\s");
			String AId = idArr[0];		//신고한 사람
			String BId	  = idArr[1];		//신고 당한사람
			
			if( !listMap.containsKey(BId)){
				listMap.put(BId, new ArrayList<Integer>());
			}
			
			//중복제거
			tmp = listMap.get(BId);
			if(!tmp.contains(idxMap.get(AId))){
				tmp.add(idxMap.get(AId));
			}
		}
		
		
		for(int i=0 ; i<userLen; i++) {
        	String userId = id_list[i];
        	//조건체크
        	if(listMap.containsKey(userId) && listMap.get(userId).size() >= k) {
	        	for(int idx : listMap.get(userId)) {
	        		System.out.println("idx :: " + idx);
	        		answer[idx]++;
	        	}
	        	
        	}
        }
		
		return answer;
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
 