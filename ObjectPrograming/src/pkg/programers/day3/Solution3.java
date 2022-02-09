package pkg.programers.day3;

//���� lv1
public class Solution3 {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        int length = a.length;
        
        for(int i=0; i<length; i++){
        	answer += a[i]*b[i];
        }
        
        return answer;
    }

}

/*
���̰� ���� �� 1���� ���� �迭 a, b�� �Ű������� �־����ϴ�. a�� b�� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

�̶�, a�� b�� ������ a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] �Դϴ�. (n�� a, b�� ����)

a				b			result
[1,2,3,4]	[-3,-1,0,2]		3
[-1,0,1]	[1,0,-1]		-2


 */
