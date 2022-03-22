package pkg.programers.week8;
import java.util.*;

import pkb.common.Common;

public class Week8Level1 {
	//���� ���ڿ��� ���ܾ�
	/*������ ������ �Ϻ� �ڸ����� ���ܾ�� �ٲٴ� �����Դϴ�.

	1478 �� "one4seveneight"
	234567 �� "23four5six7"
	10203 �� "1zerotwozero3"
	�̷��� ������ �Ϻ� �ڸ����� ���ܾ�� �ٲ�����ų�, Ȥ�� �ٲ��� �ʰ� �״���� ���ڿ� s�� �Ű������� �־����ϴ�. s�� �ǹ��ϴ� ���� ���ڸ� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	
	����	���ܾ�
	0	zero
	1	one
	2	two
	3	three
	4	four
	5	five
	6	six
	7	seven
	8	eight
	9	nine
	
	
	����� ��
			s			result
	"one4seveneight"	1478
	"23four5six7"		234567
	"2three45sixseven"	234567
	"123"				123
	*/
	//���� ���ڿ��� ���ܾ�
	public static int numStringAndEnglishWord(String s){
		int answer = 0;
		
		String keyArr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int len = keyArr.length;
		
		for(int i=0; i<len;i++){
			if(s.contains(keyArr[i])){
				s = s.replace(keyArr[i], findEnglishNum(keyArr[i]));
			}
		}
		
		answer = Integer.parseInt(s);
		
		return answer;
	}
	
	//���� ���ڿ��� ���ܾ�
	public static String findEnglishNum(String key){
		String rtnVal = "";
		HashMap<String, String> numMap = new HashMap<String ,String>();
		
		numMap.put("zero",	"0");
		numMap.put("one",	"1");
		numMap.put("two",	"2");
		numMap.put("three",	"3");
		numMap.put("four",	"4");
		numMap.put("five",	"5");
		numMap.put("six",	"6");
		numMap.put("seven",	"7");
		numMap.put("eight",	"8");
		numMap.put("nine",	"9");
		
		rtnVal = numMap.get(key) == null ? "" : numMap.get(key);
				
		return rtnVal;
	}
	
	
	//�ּ����簢��
	public static int minRectangle(int[][] sizes){
		int answer = 0;
		
		ArrayList<Integer> maxList = new ArrayList<Integer>();
		ArrayList<Integer> minList = new ArrayList<Integer>();
		
		for(int i=0; i<sizes.length; i++){
			maxList.add(Math.max(sizes[i][0], sizes[i][1]));
			minList.add(Math.min(sizes[i][0], sizes[i][1]));
		}
		
		answer = Collections.max(maxList) * Collections.max(minList);
		
		System.out.println(answer);
		
		return answer;
	}
	
	/*
		1.  ��Ʈ ������ �� 3���� ��ȸ�� �����ȴ�.
		2.  �� ��ȸ���� ���� �� �ִ� ������ 0������ 10�������̴�.
		3.  ������ �Բ� Single(S), Double(D), Triple(T) ������ �����ϰ� �� ���� ��÷ �� �������� 1����, 2����, 3���� (����1 , ����2 , ����3 )���� ���ȴ�.
		
		4.  �ɼ����� ��Ÿ��(*) , ������(#)�� �����ϸ� ��Ÿ��(*) ��÷ �� [�ش� ������ �ٷ� ���� ���� ������ �� 2��]�� �����. ������(#) ��÷ �� �ش� ������ ���̳ʽ��ȴ�.
		
		5.  ��Ÿ��(*)�� ù ��° ��ȸ������ ���� �� �ִ�. �� ��� ù ��° ��Ÿ��(*)�� ������ 2�谡 �ȴ�. (���� 4�� ����)
		6.  ��Ÿ��(*)�� ȿ���� �ٸ� ��Ÿ��(*)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ��Ÿ��(*) ������ 4�谡 �ȴ�. (���� 4�� ����)
		
		7.  ��Ÿ��(*)�� ȿ���� ������(#)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ������(#)�� ������ -2�谡 �ȴ�. (���� 5�� ����)
		8.  Single(S), Double(D), Triple(T)�� �������� �ϳ��� �����Ѵ�.
		9.  ��Ÿ��(*), ������(#)�� �������� �� �� �ϳ��� ������ �� ������, �������� ���� ���� �ִ�.
		10. 0~10�� ������ ���� S, D, T, *, #�� ������ ���ڿ��� �Էµ� �� �������� ��ȯ�ϴ� �Լ��� �ۼ��϶�.
		
		
		"����|���ʽ�|[�ɼ�]"���� �̷���� ���ڿ� 3��Ʈ.
		��) 1S 2D* 3T
		
		������ 0���� 10 ������ �����̴�.
		���ʽ��� S, D, T �� �ϳ��̴�.
		�ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
		
		1	1S 2D* 3T		37		1��1����*2 + 2��2���� 2 + 3��3����
		2	1D 2S# 10S		9		1��2���� + 2��1����  * (-1) + 10��1����
		3	1D 2S 0T		3		1��2���� + 2��1���� + 0��3����
		
		4	1S* 2T* 3S	23		1��1���� * 2 * 2 + 2��3���� * 2 + 3������
		
		5	1D#2S*3S	5		12 * (-1) * 2 + 21 * 2 + 31
		6	1T2D3D#		-4		13 + 22 + 32 * (-1)
		7	1D2S3T*		59		12 + 21 * 2 + 33 * 2
	 * */
	//��Ʈ����
	public static int dartGame(String dartResult){
		int answer = 0;
		 
		//S, D, T, *, #
		char[] cArr = dartResult.toCharArray();
		int length = cArr.length;
		
		//01 234 56
		//1S 2D* 3T
		
        return answer;
	}
	

	
}
