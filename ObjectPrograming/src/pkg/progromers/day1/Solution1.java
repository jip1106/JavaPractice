package pkg.progromers.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//day1 �Ű��� �ޱ�
public class Solution1 {
//	id_list => �̿����� ID�� ��� �迭
//	report	=> �̿��ڰ� �Ű��� �̿���(�Ű� ���� �̿��� �迭)
//	k		=> ���� ����
//	�� �������� ó��  ��� ������ ���� Ƚ���� �迭�� ��� return
	public int[] solution(String[] id_list, String[] report, int k){
		int[] answer = {};
		
		ArrayList<String> list1 = new ArrayList<String>();		// �Ű��� ���
		ArrayList<String> list2 = new ArrayList<String>();		// �Ű� ���� ���
		
		int reportLen = report.length;
		
		for(int i=0; i < reportLen; i++){
			String list1Val = report[i].split("\\s")[0];
			String list2Val = report[i].split("\\s")[1];
			
			list1.add(list1Val);
			list2.add(list2Val);
		}
		
		//resultMap => key(�Ű� �� ���) value(�Ű� Ƚ��)
		HashMap<String,Integer> resultMap = new HashMap<String, Integer>();
		
		
		//tmpMap ���� �Ű���� ���, �Ű���� Ƚ���� ��� ����(�� ����� ���� ����� �Ű��ص� ī���� �Ǿ� �ִ� ����)
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
		
		//resultMap => key:�Ű� �� ��� , value : ���� �޴� Ƚ��
		answer = new int[reportLen];
		
		for(int i=0; i< reportLen; i++){
			answer[i] = resultMap.get(id_list[i]);
		}
			
		
		return answer;
		*/
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
 