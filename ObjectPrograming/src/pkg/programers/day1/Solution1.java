package pkg.programers.day1;

import java.util.ArrayList;
import java.util.HashMap;

//day1 �Ű��� �ޱ�
public class Solution1 {
//	id_list => �̿����� ID�� ��� �迭
//	report	=> �̿��ڰ� �Ű��� �̿���(�Ű� ���� �̿��� �迭)
//	k		=> ���� ����
//	�� �������� ó��  ��� ������ ���� Ƚ���� �迭�� ��� return
	public int[] solution(String[] id_list, String[] report, int k){
		int[] answer = {};
		int userLen = id_list.length;
		answer = new int[userLen];
		
		//�̿��ڿ� idx �� ���� ��
		HashMap<String, Integer> idxMap = new HashMap<String, Integer>();	 

		//key:�Ű� ���ѻ�� 	id	value: �Ű��� ����� idx�� ����� list
		HashMap<String, ArrayList<Integer>> listMap = new HashMap<String, ArrayList<Integer>>(); 	
		
		//�̿���id, idx �� ���ʴ�� �ʿ� ����
		for(int i=0; i<userLen; i++){
			idxMap.put(id_list[i], i);
		}
		
		//report => A B ���� , A�� B�� �Ű�
		ArrayList<Integer> tmp = null;
		for(String reportVal : report){
			String[] idArr = reportVal.split("\\s");
			String AId = idArr[0];		//�Ű��� ���
			String BId	  = idArr[1];		//�Ű� ���ѻ��
			
			if( !listMap.containsKey(BId)){
				listMap.put(BId, new ArrayList<Integer>());
			}
			
			//�ߺ�����
			tmp = listMap.get(BId);
			if(!tmp.contains(idxMap.get(AId))){
				tmp.add(idxMap.get(AId));
			}
		}
		
		
		for(int i=0 ; i<userLen; i++) {
        	String userId = id_list[i];
        	//����üũ
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
 ���� ����
 
 - �Խ��� �ҷ� �̿��ڸ� �Ű� , ó�� ����� ���Ϸ� �߼��ϴ� �ý��� ����
   * �� ������ �� ���� �� ���� ������ �Ű��� �� ����
    - �Ű� Ƚ���� ���� X ���� �ٸ� ������ ����ؼ� �Ű� �� �� ����
    - ������ ������ ���� �Ű� Ƚ���� 1ȸ�� ó��
    
   * k�� �̻� �Ű�� ������ �Խ��� �̿��� �����ǰ�, �ش� ������ �Ű��� ��� �������� ���� ����� ���Ϸ� �߼�  
   
    ��ü ���� ����� ["muzi", "frodo", "apeach", "neo"]�̰�, k = 2(��, 2�� �̻� �Ű���ϸ� �̿� ����)�� ����� ����
   
   ["muzi", "frodo", "apeach", "neo"]

   ���� ID	������ �Ű��� ID	����
	muzi 	-> frodo
	apeach 	-> frodo
	
	frodo 	-> neo
	muzi 	-> neo
	
	apeach 	-> muzi
	
	
	frodo 	2
	neo 	2
	muzi 	1
	apeach 	0
	
	
	id_list => �̿����� ID�� ��� �迭
	report	=> �̿��ڰ� �Ű��� �̿���(�Ű� ���� �̿��� �迭)
	k		=> ���� ����
	
	�� �������� ó��  ��� ������ ���� Ƚ���� �迭�� ��� return 
	
	����� ex)
	id_list									report															k	result
	["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
	["con", "ryan"]						["ryan con", "ryan con", "ryan con", "ryan con"]					3	[0,0]
	

*/
 