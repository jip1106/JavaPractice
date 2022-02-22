package pkg.programers.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Week5Work1 {
	//���� ū ��
	/*
		0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.
		
		���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.
		
		0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.
		
		���� ����
		numbers�� ���̴� 1 �̻� 100,000 �����Դϴ�.
		numbers�� ���Ҵ� 0 �̻� 1,000 �����Դϴ�.
		������ �ʹ� Ŭ �� ������ ���ڿ��� �ٲپ� return �մϴ�.
		����� ��
		numbers	return
		[6, 10, 2]	"6210"
		[3, 30, 34, 5, 9]	"9534330"

	 */
	public static String mostBigNumber(int[] numbers){
		String answer = "";
		int size = numbers.length;
		
		StringBuilder sb = new StringBuilder();
		String strNumbers[] = new String[size];
		
		//String �迭�� ����
		for(int i=0; i<size; i++) {
			strNumbers[i] = String.valueOf(numbers[i]);
		}
		
		//�������� ����
		Arrays.sort(strNumbers, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});
		
		for(int j=0; j<size; j++) {
			sb.append(strNumbers[j]);
		}
		
		answer = sb.toString();
		
		if("0".equals(answer.substring(0,1))){
			answer = "0";
		}
	
		answer = sb.toString();
		
		System.out.println(answer);
        return answer;
	}

}
