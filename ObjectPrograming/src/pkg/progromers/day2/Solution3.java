package pkg.progromers.day2;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution3 {
    public String[] solution(String[] record) {
    
    	//ä�ù濡 ������ �����ų�,�г����� ������ ����� ��� ���ڿ� �迭 record�� �Ű������� �־��� ��, 
    	//���������� ���� ������ ����� ���� �Ǵ� �޽����� ���ڿ� �迭 ���·� return 
/*    	
    	record	
    	[	
    		"Enter uid1234 Muzi", 
    		"Enter uid4567 Prodo",
    		"Leave uid1234",
    		"Enter uid1234 Prodo",
    		"Change uid4567 Ryan"
    	]	
		
		- Muzi ���� ��� �Խ��ϴ�.																	  Prodo
		- Prodo ���� ���Խ��ϴ�.																  Ryan
		- Muzi ���� �������ϴ�.			uid1234 => ���̵�� �г����� ã�Ƽ� �������ϴ�. �� ��� 				  Prodo			
		- Prodo ���� ���Խ���. 		uid4567 => ���̵�� ��ϵ� ������ ã�� , ��ϵ� ������� ���ο� �г������� ����    Prodo
		
    	result
    	["Prodo���� ���Խ��ϴ�.", "Ryan���� ���Խ��ϴ�.", "Prodo���� �������ϴ�.", "Prodo���� ���Խ��ϴ�."]
*/
    	String[] answer = {};
        
        ArrayList<String> idArr = new ArrayList<String>();
        ArrayList<String> answerList = new ArrayList<String>();
        
        //1. Enter�� ������ ��� (���̵� ��� �ؾ��� => �ؽøʿ� key : id , value : �г����� �ִ´�.)
        //2. Leave�� ���̵�� �г����� ã�� ã�� �г��� ���
        //3. Change�� ���̵�� �г����� ã��, ��ϵǾ��ִ� ������ ����
        
        HashMap<String, String> recordMap = new HashMap<String, String>();	//id , nickname
       
        String recordDetArr[] = null;
        boolean changeNick = false;
        
        for(String recordVal : record) {
        	
        	recordDetArr = recordVal.split("\\s");
        	
        	switch(recordDetArr[0]) {
	        	case "Enter" : 
	        			recordMap.put(recordDetArr[1], recordDetArr[2]); 
	        			answerList.add(recordDetArr[2] + "���� ���Խ��ϴ�.");
	        			idArr.add(recordDetArr[1]);
	        			
	        			break;	
	        	case "Leave" : 
	        			answerList.add(recordMap.get(recordDetArr[1]) + "���� �������ϴ�.");
	        			idArr.add(recordDetArr[1]);
	        			break;	
	        	case "Change" : 
	        			recordMap.put(recordDetArr[1], recordDetArr[2]); 
	        			break;	
        	}
        	/*
        	25�� ���ĺ��� �ð��ʰ��� ����
        	
            int i = 0;
        	
        	changeNick = (recordDetArr[0].equals("Leave")) ? false : true;
        	if(changeNick) {
	        	for(String tmp : answerList) {
	        		String afterNickName = recordMap.get(recordDetArr[1]);
	        		
	    			if(idArr.get(i).equals(recordDetArr[1]) ) {
	    				answerList.set(i, afterNickName + tmp.substring(tmp.indexOf("��")) );
	    			}
	    			
	    			i++;
	        	}
        	}
        	*/
        }
        int i=0;
        for(String tmp : answerList) {
    		String afterNickName = recordMap.get(idArr.get(i));
    		
    		answerList.set(i, afterNickName + tmp.substring(tmp.indexOf("��")) );
			
			i++;
    	}
        
               
        answer = new String[answerList.size()];
        i=0;
        for(String val : answerList) {
        	System.out.println(val);
        	answer[i++] = val;      
        }
        
      
        
        
        return answer;
        
    }
    

}


/*
īī���� ����ä�ù濡���� ģ���� �ƴ� ������ ��ȭ�� �� �� �ִµ�, ���� �г����� �ƴ� ������ �г����� ����Ͽ� ä�ù濡 �� �� �ִ�.
���Ի���� ��ũ��� īī���� ���� ä�ù��� ������ ����� ����, �پ��� ������� ������, ������ ���� ���Ѻ� �� �ִ� ������â�� ������ �ߴ�. ä�ù濡 ������ ������ ���� �޽����� ��µȴ�.

"[�г���]���� ���Խ��ϴ�."

ä�ù濡�� ������ ������ ���� �޽����� ��µȴ�.

"[�г���]���� �������ϴ�."

ä�ù濡�� �г����� �����ϴ� ����� ������ ���� �� �����̴�.

1. ä�ù��� ���� ��, ���ο� �г������� �ٽ� ����.
2. ä�ù濡�� �г����� �����Ѵ�.
�г����� ������ ���� ������ ä�ù濡 ��µǾ� �ִ� �޽����� �г��ӵ� ���� ����ȴ�.

���� ���, ä�ù濡 "Muzi"�� "Prodo"��� �г����� ����ϴ� ����� ������� ������ ä�ù濡�� ������ ���� �޽����� ��µȴ�.

"Muzi���� ���Խ��ϴ�."
"Prodo���� ���Խ��ϴ�."

ä�ù濡 �ִ� ����� ������ ä�ù濡�� ������ ���� �޽����� ���´�.

"Muzi���� ���Խ��ϴ�."
"Prodo���� ���Խ��ϴ�."
"Muzi���� �������ϴ�."

Muzi�� ������ �ٽ� ���� ��, Prodo ��� �г������� ���� ��� ������ ä�ù濡 �����ִ� Muzi�� Prodo�� ������ ���� ����ȴ�.

"Prodo���� ���Խ��ϴ�."
"Prodo���� ���Խ��ϴ�."
"Prodo���� �������ϴ�."
"Prodo���� ���Խ��ϴ�."

ä�ù��� �ߺ� �г����� ����ϱ� ������, ���� ä�ù濡�� Prodo��� �г����� ����ϴ� ����� �� ���� �ִ�. ����, ä�ù濡 �� ��°�� ���Դ� Prodo�� Ryan���� �г����� �����ϸ� ä�ù� �޽����� ������ ���� ����ȴ�.

"Prodo���� ���Խ��ϴ�."
"Ryan���� ���Խ��ϴ�."
"Prodo���� �������ϴ�."
"Prodo���� ���Խ��ϴ�."

ä�ù濡 ������ �����ų�,�г����� ������ ����� ��� ���ڿ� �迭 record�� �Ű������� �־��� ��, 
��� ����� ó���� ��, ���������� 
���� ������ ����� ���� �Ǵ� �޽����� ���ڿ� �迭 ���·� return �ϵ��� solution �Լ��� �ϼ��϶�.

���ѻ���
record�� ������ ���� ���ڿ��� ��� �迭�̸�, ���̴� 1 �̻� 100,000 �����̴�.
������ record�� ��� ���ڿ��� ���� �����̴�.
��� ������ [���� ���̵�]�� �����Ѵ�.
[���� ���̵�] ����ڰ� [�г���]���� ä�ù濡 ���� - "Enter [���� ���̵�] [�г���]" (ex. "Enter uid1234 Muzi")
[���� ���̵�] ����ڰ� ä�ù濡�� ���� - "Leave [���� ���̵�]" (ex. "Leave uid1234")
[���� ���̵�] ����ڰ� �г����� [�г���]���� ���� - "Change [���� ���̵�] [�г���]" (ex. "Change uid1234 Muzi")
ù �ܾ�� Enter, Leave, Change �� �ϳ��̴�.
�� �ܾ�� �������� ���еǾ� ������, ���ĺ� �빮��, �ҹ���, ���ڷθ� �̷�����ִ�.
���� ���̵�� �г����� ���ĺ� �빮��, �ҹ��ڸ� �����Ѵ�.
���� ���̵�� �г����� ���̴� 1 �̻� 10 �����̴�.
ä�ù濡�� ���� ������ �г����� �����ϴ� �� �߸� �� �Է��� �־����� �ʴ´�.

record	
["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]	

result
["Prodo���� ���Խ��ϴ�.", "Ryan���� ���Խ��ϴ�.", "Prodo���� �������ϴ�.", "Prodo���� ���Խ��ϴ�."]

 */
