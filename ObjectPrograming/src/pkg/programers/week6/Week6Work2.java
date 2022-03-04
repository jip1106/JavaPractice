package pkg.programers.week6;

import java.util.*;

//Ÿ�ϳѹ�
public class Week6Work2 {
	public static int targetNumber(int[] numbers, int target){
		int answer = 0;
        
        Stack<Integer> resultStack = new Stack<Integer>();
        ArrayList<Integer> tmpList;
        
        //�ʱⰪ ����
        resultStack.push(numbers[0]);			
        resultStack.push(numbers[0]*-1);
                
    	for (int i = 1; i < numbers.length; i++) {
    		int tmpNum = numbers[i];
			tmpList = new ArrayList<Integer>();
			
			//�� ���
			while(!resultStack.isEmpty()) {
				int popNum = resultStack.pop();
				
				tmpList.add(popNum+tmpNum);			
				tmpList.add(popNum+(tmpNum*-1));		
    		}
			
			//�տ��� ���� ���� ���ÿ� ���
			for (int j = 0; j < tmpList.size(); j++) {
				resultStack.push(tmpList.get(j));
			}
			
		} 
    	
    	//2.Ÿ�ϳѹ��� ���� �� ������ ����
    	while(!resultStack.isEmpty()) {
    		if(resultStack.pop() == target){
    			answer++;    			
    		}
    	}
    	    	
    	    	
        return answer;
	}
}

/*
n���� ���� �ƴ� �������� �ֽ��ϴ�. �� �������� ������ �ٲ��� �ʰ� ������ ���ϰų� ���� Ÿ�� �ѹ��� ������� �մϴ�. ���� ��� [1, 1, 1, 1, 1]�� ���� 3�� ������� ���� �ټ� ����� �� �� �ֽ��ϴ�.


-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

����� �� �ִ� ���ڰ� ��� �迭 numbers, Ÿ�� �ѹ� target�� �Ű������� �־��� �� ���ڸ� ������ ���ϰ� ���� Ÿ�� �ѹ��� ����� ����� ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
�־����� ������ ������ 2�� �̻� 20�� �����Դϴ�.
�� ���ڴ� 1 �̻� 50 ������ �ڿ����Դϴ�.
Ÿ�� �ѹ��� 1 �̻� 1000 ������ �ڿ����Դϴ�.
����� ��
numbers					target	return
[1, 1, 1, 1, 1]			3		5
[4, 1, 2, 1]			4		2
����� �� ����
����� �� #1

���� ���ÿ� �����ϴ�.

����� �� #2

+4+1-2+1 = 4
+4-1+2-1 = 4
�� 2���� ����� �����Ƿ�, 2�� return �մϴ�.



 */
