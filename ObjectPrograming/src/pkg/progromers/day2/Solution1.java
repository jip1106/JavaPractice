package pkg.progromers.day2;

public class Solution1 {
	public long[] solution(int x, int n) {
        long[] answer = {};
        
        answer = new long[n];
        
        for(int i=0; i<n; i++){
        	if(i==0){
        		answer[i] = x;
        	}else{
        		answer[i] = answer[i-1] + x;
        	}
        }
        
        return answer;
    }
	
	public void print(long [] answer){
		for(int i=0; i<answer.length; i++){
			System.out.print(answer[i] + " ");
		}
		System.out.println();
	}

}

/*
 �Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.

	���� ����
	x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
	n�� 1000 ������ �ڿ����Դϴ�.
	
	x	n	answer
	2	5	[2,4,6,8,10]
	4	3	[4,8,12]
	-4	2	[-4, -8]
 
 * */
