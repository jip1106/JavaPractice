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
		
		/*
		 * �־��� ���� �� 3���� ���� ������ �� 
		 * �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. 
		 * ���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� 
		 * �Ҽ��� �Ǵ� ����� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.
		 * ����� �� #1  
		 *  [1,2,3,4]	1 
		     [1,2,4]�� �̿��ؼ� 7�� ���� �� �ֽ��ϴ�.
		   
		 *	[1,2,7,6,4]	4 
		 *
		 * ����� �� #2
			[1,2,4]�� �̿��ؼ� 7�� ���� �� �ֽ��ϴ�.
			[1,4,6]�� �̿��ؼ� 11�� ���� �� �ֽ��ϴ�.
			[2,4,7]�� �̿��ؼ� 13�� ���� �� �ֽ��ϴ�.
			[4,6,7]�� �̿��ؼ� 17�� ���� �� �ֽ��ϴ�.
		 */
		public static int makeDecimal(int nums[]){
			int answer = 0;
			int sum = 0;			//�迭 �� 3���� ���� ��
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
			
			System.out.println("�Ҽ� ����� : " + answer);
			
			return answer;
		}
		
		//�Ҽ�Ȯ��
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
		
		
		//���ǰ��
		/*
		  	�����ڴ� ������ ������ ����� �ظ��Դϴ�. 
		  	������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. 
		  	�����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

			1�� �����ڰ� ��� ���: 1,2,3,4,5,  1,2,3,4,5, ...
			
			2�� �����ڰ� ��� ���: 2,1,2,3,2,4,2,5,  2,1,2,3,2,4,2,5, ...
							  	
			3�� �����ڰ� ��� ���: 3,3,1,1,2,2,4,4,5,5, 		3,3,1,1,2,2,4,4,5,5, ...
			
			1�� �������� ������ ���������� ������ ������� ���� �迭 
			answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
			
			���� ����
			������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
			������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
			���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
			����� ��
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
		 * Ű�е� ������
		 *		 1 2 3 
		 *		 4 5 6 
		 *		 7 8 9
		 *		 * 0 #
		 *		   X		(��ȭ��ư) 
		 *
		 *
		 	�� ��ȭ Ű�е忡�� �޼հ� �������� �����հ������� �̿��ؼ� ���ڸ��� �Է��Ϸ��� �մϴ�.
			�� ó�� �޼� �����հ����� * Ű�е忡 ������ �����հ����� # Ű�е� ��ġ���� �����ϸ�, �����հ����� ����ϴ� ��Ģ�� ������ �����ϴ�.
			
			�����հ����� �����¿� 4���� �������θ� �̵��� �� ������ Ű�е� �̵� �� ĭ�� �Ÿ��� 1�� �ش��մϴ�.
			
			���� ���� 3���� ���� 1, 4, 7�� �Է��� ���� �޼� �����հ����� ����մϴ�.
			
			������ ���� 3���� ���� 3, 6, 9�� �Է��� ���� ������ �����հ����� ����մϴ�.
			
			��� ���� 4���� ���� 2, 5, 8, 0�� �Է��� ���� �� �����հ����� ���� Ű�е��� ��ġ���� �� ����� �����հ����� ����մϴ�.
			
			4-1. ���� �� �����հ����� �Ÿ��� ���ٸ�, ���������̴� ������ �����հ���, �޼����̴� �޼� �����հ����� ����մϴ�.
			������� ���� ��ȣ�� ��� �迭 numbers, 
			�޼��������� ������������ ���� ��Ÿ���� ���ڿ� hand�� �Ű������� �־��� ��, �� ��ȣ�� ���� �����հ����� �޼��� �� �������� ���� ��Ÿ���� ���ӵ� ���ڿ� ���·� return �ϵ��� solution �Լ��� �ϼ����ּ���.
			
			[���ѻ���]
			numbers �迭�� ũ��� 1 �̻� 1,000 �����Դϴ�.
			numbers �迭 ������ ���� 0 �̻� 9 ������ �����Դϴ�.
			hand�� "left" �Ǵ� "right" �Դϴ�.
			"left"�� �޼�����, "right"�� ���������̸� �ǹ��մϴ�.
			�޼� �����հ����� ����� ���� L, ������ �����հ����� ����� ���� R�� ������� �̾�ٿ� ���ڿ� ���·� return ���ּ���.
			
			����� ��
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
			int keyPads[][]  = {{3,1}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}};	//0 ~ 9 ��ǥ
			int leftPos[]  = {3,0};	//���ۿ޼�
			int rightPos[] = {3,2};	//���ۿ�����
			
			for(int i=0; i<size; i++){
				
				switch(numbers[i]){
				case 1 : 
				case 4 : 
				case 7 : sb.append("L"); 
						 leftPos = keyPads[numbers[i]];
						 break;	//�޼�
				case 3 : 
				case 6 :
				case 9 : sb.append("R");
						 rightPos = keyPads[numbers[i]];
						 break;	//������
				default : 
					// 2,5,8,0 ��ȣ�� ���� ó�� 
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
					
					break;	//���� �޼�, �����տ��� ������
				
				}
			}
			
			answer = sb.toString();
			System.out.println(answer);
			return answer;
		}
		
		
		
		//�űԾ��̵� ��õ
		/*
			īī���� �Ի��� ���� ������ �׿��� "īī������������"�� ��ġ�Ǿ�, 
			īī�� ���񽺿� �����ϴ� �������� ���̵� �����ϴ� ������ ����ϰ� �Ǿ����ϴ�. 
			"�׿�"���� �־��� ù ������ ���� �����ϴ� �������� īī�� ���̵� ��Ģ�� ���� �ʴ� ���̵� �Է����� ��, 
			�Էµ� ���̵�� �����ϸ鼭 ��Ģ�� �´� ���̵� ��õ���ִ� ���α׷��� �����ϴ� ���Դϴ�.
			������ īī�� ���̵��� ��Ģ�Դϴ�.
			
			���̵��� ���̴� 3�� �̻� 15�� ���Ͽ��� �մϴ�.
			���̵�� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.) ���ڸ� ����� �� �ֽ��ϴ�.
			��, ��ħǥ(.)�� ó���� ���� ����� �� ������ ���� �������� ����� �� �����ϴ�.
			"�׿�"�� ������ ���� 7�ܰ��� �������� ó�� ������ ���� �ű� ������ �Է��� ���̵� īī�� ���̵� ��Ģ�� �´� �� �˻��ϰ� ��Ģ�� ���� ���� ��� ��Ģ�� �´� ���ο� ���̵� ��õ�� �ַ��� �մϴ�.
			�ű� ������ �Է��� ���̵� new_id ��� �Ѵٸ�,
			
			1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
			2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
			3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
			4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
			5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
			6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
			     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
			7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.

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
		
		//ü����
		/*
		  ���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�. 
		  ������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�. 
		  �л����� ��ȣ�� ü�� ������ �Ű��� �־�, 
		  �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. 
		  ���� ���, 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. 
		  ü������ ������ ������ ���� �� ���� ������ ü������ ������ ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.

			��ü �л��� �� n, 
			ü������ �������� �л����� ��ȣ�� ��� �迭 lost, 
			������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��, 
			ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	
			���ѻ���
			��ü �л��� ���� 2�� �̻� 30�� �����Դϴ�.
			ü������ �������� �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
			������ ü������ ������ �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
			���� ü������ �ִ� �л��� �ٸ� �л����� ü������ ������ �� �ֽ��ϴ�.
			
			*** ���� ü������ ������ �л��� ü������ ���������� �� �ֽ��ϴ�. 
			
			�̶� �� �л��� ü������ �ϳ��� �������ߴٰ� �����ϸ�, 
			���� ü������ �ϳ��̱⿡ �ٸ� �л����Դ� ü������ ������ �� �����ϴ�.
		 */
		
		//Week5Level1.gymSuit(10, new int[]{1,4,8,9},  new int[]{1,4,5,10,7,3});
		
		public static int gymSuit(int n, int[] lost, int[] reserve){
			int answer = 0;
	        //n => ��ü �л� ��
	        //lost => �������� �л� ��ȣ
	        //������ ü������ ������ �л����� ��ȣ
	        //Week5Level1.gymSuit(5, new int[]{5,4,2},  new int[]{2,4});

	        ArrayList<Integer> lostList = new ArrayList<Integer>();
	        ArrayList<Integer> reserveList = new ArrayList<Integer>();

	        //���� ���� �л� ����Ʈ
	        for(int tmp : lost){
	            lostList.add(tmp);
	        }
				
	        //������ �� �ִ� �л� ����Ʈ
	        for(int tmp : reserve){
	            reserveList.add(tmp);
	        }
	        
	        /**********�׽�Ʈ������13 18*************/
	        Collections.sort(lostList);
	        Collections.sort(reserveList);
	        /***********************/
	        
	        				
	        for(int i=0; i<lostList.size(); i++){	//�Ҿ���� �л� ��ȣ
	            int lostNum = lostList.get(i);
	        
	            //������ �� �ִ� �л� ����Ʈ ����
	            for(int j = 0; j<reserveList.size(); j++){
	                if(reserveList.get(j) == lostNum ){
	                    reserveList.remove(j);
	                    lostList.remove(i);
	                    /**********�׽�Ʈ������13 18*************/
	                    i--;
	                }
	            }
	            
	        }
	        	
	        for(int i=0; i<reserveList.size(); i++){	//������ �� �ִ� �л� ����Ʈ
	            int reserveNum = reserveList.get(i);

	            //���� ���� �л� ����Ʈ ����
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
		 * ���� ���� ������ �������� ū ��ο� ������. 
		 * �׳డ ���� ������ ��õ���� �뼺���� �ŵ�����, ���� �ű� ������� ���� �ް��� ���̴�. 
		 * ������ �ű� ����ڿ� ���� ����� ���̿� �������� ���̰� �ʹ� ū ���� ��������.

			�� ������ ��� �ұ� ��� �� �׳�� �������� ���� �ð��� �÷��� ���̵��� �����ϱ�� �ߴ�. ���� ���� �����ڶ� ��κ��� ������ ���� ����������, �������� ���ϴ� �κп��� ���⿡ ������ ���Ҵ�.
			�������� ���� �������� ���ϴ� �ڵ带 �ϼ��϶�.
			
			�������� ������ ���� �����Ѵ�.
				** ���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� ��
			
			��ü ���������� ���� N, 
			������ �̿��ϴ� ����ڰ� ���� �����ִ� ���������� ��ȣ�� ��� �迭 stages�� �Ű������� �־��� ��, 
			�������� ���� ������������ ������������ 
			���������� ��ȣ�� ����ִ� �迭�� return �ϵ��� solution �Լ��� �ϼ��϶�.
			
			���ѻ���
			���������� ���� N�� 1 �̻� 500 ������ �ڿ����̴�.
			stages�� ���̴� 1 �̻� 200,000 �����̴�.
			stages���� 1 �̻� N + 1 ������ �ڿ����� ����ִ�.
			
			�� �ڿ����� ����ڰ� ���� ���� ���� ���������� ��ȣ�� ��Ÿ����.
			��, N + 1 �� ������ ��������(N ��° ��������) ���� Ŭ���� �� ����ڸ� ��Ÿ����.
			���� �������� ���� ���������� �ִٸ� ���� ��ȣ�� ���������� ���� ������ �ϸ� �ȴ�.
			���������� ������ ������ ���� ��� �ش� ���������� �������� 0 ���� �����Ѵ�.
			
			����� ��
			N		stages						result
			5	[2,1,2,6,2,4,3,3]			[3,4,2,1,5]
			4	[4,4,4,4,4]					[4,1,2,3]
			
			����� �� ����
			����� �� #1
			1�� ������������ �� 8���� ����ڰ� ����������, �� �� 1���� ����ڰ� ���� Ŭ�������� ���ߴ�. ���� 1�� ���������� �������� ������ ����.
			
			1 �� �������� ������ : 1/8
			2�� ������������ �� 7���� ����ڰ� ����������, �� �� 3���� ����ڰ� ���� Ŭ�������� ���ߴ�. ���� 2�� ���������� �������� ������ ����.
			
			2 �� �������� ������ : 3/7
			���������� ������ ���������� �������� ������ ����.
			
			3 �� �������� ������ : 2/4
			4�� �������� ������ : 1/2
			5�� �������� ������ : 0/1
			�� ���������� ��ȣ�� �������� ������������ �����ϸ� ������ ����.
			
			[3,4,2,1,5]
			����� �� #2
			
			��� ����ڰ� ������ ���������� �����Ƿ� 4�� ���������� �������� 1�̸� ������ ���������� �������� 0�̴�.
			
			[4,1,2,3]
			
			N : ��ü �������� ����
			�������� ������ ���� �����Ѵ�.
				** ���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� ��
		 */
		//1,2,2,1,3
		 public static int[] failureRate(int N, int[] stages) {
			 int[] answer = new int[N];
			 
			 int stageSize = stages.length;			//������� ��
			 int nowSize = 0;
			 int passSize = 0;
			 Double []failureRate = new Double[N];
			 
			 // N : 5 	�������� : 0,1,2,3,4 ...
			 for(int i=1; i<=N; i++){	//�������� ���� ��ŭ for��
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
			//������ �������� ����
			Arrays.sort(failureRate, Collections.reverseOrder());
			
			List<Integer> listKeySet = new ArrayList<Integer>(hMap.keySet());
			
			//********** �� �������� key �������� �����ϱ� Collections.sort Ȯ�� �ʿ�
			Collections.sort(listKeySet, (key, value) -> (hMap.get(value).compareTo(hMap.get(key)))); 
				
			int i=0;
			for(Integer key : listKeySet) {
				answer[i++] = key;
			}
			
			print(answer);
			
			
			return answer;
		}
		
		
		
		
		//����Ʈ ��� �Լ�
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
