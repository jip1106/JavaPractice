package pkg.programers.week6;
import java.util.*;

import pkb.common.Common;

//������ձ�
public class Week6Work1 {
	public static int[] wordChainGame(int n, String[] words){
		int[] answer = {0,0};
		// n : �����ڼ� 
		// words : �����ձ⿡ ���� �ܾ��
		/*
			Ż���ϴ� ��� 
			1. ���� �ܾ �� �� ���
			2. �ջ���� ���� ������ ���ڿ� �ٸ� ���ڷ� �����ϴ� �� ���� ���
			
			 ���� ���� Ż���ϴ� ����� ��ȣ�� �� ����� �ڽ��� �� ��° ���ʿ� Ż���ϴ���
		 */
		int size = words.length;
		ArrayList<String> usedWordList = new ArrayList<String>();
		int failIdx = 0;
		
		
		
		for(int i=0; i<size; i++){
			usedWordList.add(words[i]);			//����� ����Ʈ
			
			//1. ���� �ܾ �� �� ���
			if(i+1 < size && !words[i+1].startsWith(String.valueOf(words[i].charAt(words[i].length() - 1)))){
				
				failIdx = i+1;
				break;
			}
			
			//2. �ջ���� ���� ������ ���ڿ� �ٸ� ���ڷ� �����ϴ� �� ���� ���
			if(i+1 < size && usedWordList.contains(words[i+1])){
				failIdx = i+1;
				break;
			}
			
		}
		
		if(failIdx == 0){
			failIdx=  -1;
		}
		
		int firstFailNum = (failIdx == 0) ? -1 : failIdx;
		firstFailNum = ((failIdx) % n) + 1 ;
		
		int rtnIdx = (int)Math.ceil( (failIdx+1) /(double)n);
		
		answer[0] = firstFailNum;
		answer[1] = rtnIdx;
		
		
		return answer;
		
	}
}

/*
1���� n���� ��ȣ�� �پ��ִ� n���� ����� ���� �����ձ⸦ �ϰ� �ֽ��ϴ�. ���� �����ձ�� ������ ���� ��Ģ���� ����˴ϴ�.

1������ ��ȣ ������� �� ����� ���ʴ�� �ܾ ���մϴ�.
������ ����� �ܾ ���� �������� �ٽ� 1������ �����մϴ�.

�ջ���� ���� �ܾ��� ������ ���ڷ� �����ϴ� �ܾ ���ؾ� �մϴ�.
������ �����ߴ� �ܾ�� ����� �� �����ϴ�.

�� ������ �ܾ�� �������� �ʽ��ϴ�.
������ 3���� �����ձ⸦ �ϴ� ��Ȳ�� ��Ÿ���ϴ�.

tank �� kick �� know �� wheel �� land �� dream �� mother �� robot �� tank

�� �����ձ�� ������ ���� ����˴ϴ�.

1�� ����� �ڽ��� ù ��° ���ʿ� tank�� ���մϴ�.
2�� ����� �ڽ��� ù ��° ���ʿ� kick�� ���մϴ�.
3�� ����� �ڽ��� ù ��° ���ʿ� know�� ���մϴ�.
1�� ����� �ڽ��� �� ��° ���ʿ� wheel�� ���մϴ�.
(��� ����)
�����ձ⸦ ��� ������ ������ ����, 3�� ����� �ڽ��� �� ��° ���ʿ� ���� tank ��� �ܾ�� ������ �����ߴ� �ܾ��̹Ƿ� Ż���ϰ� �˴ϴ�.

����� �� n�� ������� ������� ���� �ܾ� words �� �Ű������� �־��� ��, 
���� ���� Ż���ϴ� ����� ��ȣ�� �� ����� �ڽ��� �� ��° ���ʿ� Ż���ϴ����� ���ؼ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���� ����
�����ձ⿡ �����ϴ� ����� �� n�� 2 �̻� 10 ������ �ڿ����Դϴ�.
words�� �����ձ⿡ ����� �ܾ���� ������� ����ִ� �迭�̸�, ���̴� n �̻� 100 �����Դϴ�.
�ܾ��� ���̴� 2 �̻� 50 �����Դϴ�.
��� �ܾ�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
�����ձ⿡ ���Ǵ� �ܾ��� ��(�ǹ�)�� �Ű� ���� �����ŵ� �˴ϴ�.
������ [ ��ȣ, ���� ] ���·� return ���ּ���.
���� �־��� �ܾ��� Ż���ڰ� ������ �ʴ´ٸ�, [0, 0]�� return ���ּ���.



n	words	result
3	["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]	[3,3]
5	["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]	[0,0]
2	["hello", "one", "even", "never", "now", "world", "draw"]	[1,3]
����� �� ����
����� �� #1
3���� ����� �����ձ⿡ �����ϰ� �ֽ��ϴ�.

1�� ��� : tank, wheel, mother
2�� ��� : kick, land, robot
3�� ��� : know, dream, tank
�� ���� ������ ���� �ϰ� �Ǹ�, 3�� ����� �ڽ��� �� ��° ���ʿ� ���� tank��� �ܾ 1�� ����� �ڽ��� ù ��° ���ʿ� ���� tank�� �����Ƿ� 3�� ����� �ڽ��� �� ��° ���ʷ� ���� �� �� ó�� Ż���ڰ� ������ �˴ϴ�.

����� �� #2
5���� ����� �����ձ⿡ �����ϰ� �ֽ��ϴ�.

1�� ��� : hello, recognize, gather
2�� ��� : observe, encourage, refer
3�� ��� : effect, ensure, reference
4�� ��� : take, establish, estimate
5�� ��� : either, hang, executive
�� ���� ������ ���� �ϰ� �Ǹ�, �� ���� �־��� �ܾ�θ����δ� Ż���ڰ� �߻����� �ʽ��ϴ�. ���� [0, 0]�� return�ϸ� �˴ϴ�.

����� �� #3
2���� ����� �����ձ⿡ �����ϰ� �ֽ��ϴ�.

1�� ��� : hello, even, now, draw
2�� ��� : one, never, world
�� ���� ������ ���� �ϰ� �Ǹ�, 1�� ����� �ڽ��� �� ��° ���ʿ� 'r'�� �����ϴ� �ܾ� ���, n���� �����ϴ� now�� ���߱� ������ �̶� ó�� Ż���ڰ� ������ �˴ϴ�.
 
 */

