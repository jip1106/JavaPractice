package pkg.programers.week7;

import pkb.common.Common;

/*������ȯ*/
public class Week7Work1 {
	public static int[] binaryConvert(String s) {
		int[] answer = {0,0};
		
		int zeroCnt = 0;			//������ 0�� ����
		int afterLength = 0;		//0 ���� �� ����
		
		String tmpString = s;
		
		while(tmpString.length() != 1) {
			//������ 0�� ����
			zeroCnt = getZeroLength(tmpString);
			System.out.println("zeroCnt : " + zeroCnt);
			
			//0���� �� ����
			afterLength = getAfterRemoveZeroLength(tmpString);
			System.out.println("zeroCnt : " + afterLength);
			
			//2����ȯ ���
			tmpString = Integer.toBinaryString(afterLength);
			
			answer[0]++;
			answer[1]+=zeroCnt;
			
		}
		
		Common.printArray(answer);
		
		return answer;
	}
	
	public static int getZeroLength(String s) {
		int rtnVal = 0;
		rtnVal  = getAfterRemoveString(s,1).length();
		
		return rtnVal;
	}
	
	public static int getAfterRemoveZeroLength(String s) {
		int rtnVal = 0;
		rtnVal  = getAfterRemoveString(s,0).length();
		
		return rtnVal;
	}
	
	public static String getAfterRemoveString(String s, int type) {
		String rtnVal = s;
		rtnVal = s.replaceAll(String.valueOf(type), "");
		
		return rtnVal;
	}

}


/*
0�� 1�� �̷���� � ���ڿ� x�� ���� ���� ��ȯ�� ������ ���� �����մϴ�.

x�� ��� 0�� �����մϴ�.
x�� ���̸� c��� �ϸ�, x�� "c�� 2�������� ǥ���� ���ڿ�"�� �ٲߴϴ�.
���� ���, x = "0111010"�̶��, x�� ���� ��ȯ�� ���ϸ� x = "0111010" -> "1111" -> "100" �� �˴ϴ�.

0�� 1�� �̷���� ���ڿ� s�� �Ű������� �־����ϴ�. s�� "1"�� �� ������ ����ؼ� s�� ���� ��ȯ�� ������ ��, ���� ��ȯ�� Ƚ���� ��ȯ �������� ���ŵ� ��� 0�� ������ ���� �迭�� ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

	s				result
"110010101001"		[3,8]
"01110"				[3,3]
"1111111"			[4,1]


 */