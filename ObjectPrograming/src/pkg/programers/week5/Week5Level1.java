package pkg.programers.week5;

import java.util.ArrayList;
import java.util.Collections;

public class Week5Level1 {
	
	//lv1 ����� ������ ����
	/*
	 * �� ���� left�� right�� �Ű������� �־����ϴ�. left���� right������ ��� ���� �߿���, ����� ������ ¦���� ���� ���ϰ�, ����� ������ Ȧ���� ���� �� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
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
	
	//lv1 ���ڿ� ��������� �����ϱ�
	/*
	 * ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, 
	 * �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
	 * ���� ��� strings�� ["sun", "bed", "car"]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"�� 
	 * strings�� �����մϴ�.
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
	
	//lv1 3���� ������
	/*
		�ڿ��� n�� �Ű������� �־����ϴ�. n�� 3���� �󿡼� �յڷ� ������ ��, �̸� �ٽ� 10�������� ǥ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
		n�� 1 �̻� 100,000,000 ������ �ڿ����Դϴ�.
		n	result
		45	7
		125	229
		
		n (10����)	n (3����)		�յ� ����(3����)	10�������� ǥ��
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
	        
	        //0021 �յ� ���� �� ��
	        char tmpArr[] = sb.toString().toCharArray();
	        
	        for(int i=0; i<tmpArr.length; i++){
	        	int size = tmpArr.length-i;
	        	int addSum = ( (int)tmpArr[i] - 48 ) * ((int)Math.pow(3, size-1 ) );
	        	
	        	answer += addSum;
	        }
	        
	        
	        return answer;
	    }
		
		
	
}
