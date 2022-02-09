package pkg.programers.day3;

//���� ���ϱ� lv1
public class Solution2 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i=0;
        
        for(int val:absolutes){
            val = signs[i++] ? val : val*-1;    //��ȣ ����
            answer += val;
        }
        
        return answer;
    }
	
	/*
	  
	� �������� �ֽ��ϴ�. 
	�� �������� ������ ���ʴ�� ���� ���� �迭 absolutes�� �� �������� ��ȣ�� ���ʴ�� ���� �Ҹ��� �迭 signs�� �Ű������� �־����ϴ�. ���� �������� ���� ���Ͽ� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	
	���ѻ���
	absolutes�� ���̴� 1 �̻� 1,000 �����Դϴ�.
	absolutes�� ��� ���� ���� 1 �̻� 1,000 �����Դϴ�.
	signs�� ���̴� absolutes�� ���̿� �����ϴ�.
	signs[i] �� ���̸� absolutes[i] �� ���� ������ �������, �׷��� ������ �������� �ǹ��մϴ�.
	
	*/

}
