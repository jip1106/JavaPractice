package pkg.programers.day1;

public class Solution2 {
	public int solution(String s){
		int answer = s.length();
        int strTokenSize = s.length()/2;
	        
	    if(!(answer==1)){
	        for(int i=1; i<strTokenSize+1; i++) {
	        	String dupStr  = s.substring(0,i);	//�ݺ��Ǵ� ��
	        	int cnt =1;
	        	String rtnVal="";			//�����
	        	
	        	
	        	//����
	        	for(int j=i; j<=s.length()-i; j=j+i){
	        		//System.out.println("j  :: " + j);
	        		if(dupStr.equals(s.substring(j,j+i))){	//�ݺ����� �����Ҽ� �ִ��� Ȯ��
	    				cnt++;
	    			}else {
	    				if(cnt>1) {
	    					rtnVal += cnt+"";
	    				}
	    				rtnVal += dupStr;
	   				    dupStr= s.substring(j,j+i);
	    				cnt=1;
	    			}
	        	}
	        	
	        	if(cnt>1) {
	        		rtnVal += ""+cnt;
	    		}
	        	rtnVal += dupStr;
	    		
	        	//System.out.println("===" + rtnVal + " (" + s +  ")===");
	    		int modStrLen = s.length()%i;		 //���� �� ���� str����
	    		answer = Math.min(answer, rtnVal.length()+modStrLen);
	        }
	        
	    }
	    
	    return answer;
	}
}
/*
 ������ ó�� �������� �ǰ� ���� "����ġ"�� ���ڿ��� �����ϴ� ����� ���� ���θ� �ϰ� �ֽ��ϴ�. �ֱٿ� �뷮�� ������ ó���� ���� ������ ��ս� ���� ����� ���� ���θ� �ϰ� �ִµ�, 
 ���ڿ����� ���� ���� �����ؼ� ��Ÿ���� ���� �� ������ ������ �ݺ��Ǵ� ������ ǥ���Ͽ� �� ª�� ���ڿ��� �ٿ��� ǥ���ϴ� �˰����� �����ϰ� �ֽ��ϴ�.
 
������ ���� "aabbaccc"�� ��� "2a2ba3c"(���ڰ� �ݺ����� �ʾ� �ѹ��� ��Ÿ�� ��� 1�� ������)�� ���� ǥ���� �� �ִµ�, 
�̷��� ����� �ݺ��Ǵ� ���ڰ� ���� ��� ������� ���ٴ� ������ �ֽ��ϴ�. ���� ���, "abcabcdede"�� ���� ���ڿ��� ���� ������� �ʽ��ϴ�. 
"����ġ"�� �̷��� ������ �ذ��ϱ� ���� ���ڿ��� 1�� �̻��� ������ �߶� �����Ͽ� �� ª�� ���ڿ��� ǥ���� �� �ִ��� ����� ã�ƺ����� �մϴ�.

���� ���, "ababcdcdababcdcd"�� ��� ���ڸ� 1�� ������ �ڸ��� ���� ������� ������, 2�� ������ �߶� �����Ѵٸ� "2ab2cd2ab2cd"�� ǥ���� �� �ֽ��ϴ�. 
�ٸ� ������� 8�� ������ �߶� �����Ѵٸ� "2ababcdcd"�� ǥ���� �� ������, �̶��� ���� ª�� �����Ͽ� ǥ���� �� �ִ� ����Դϴ�.

�ٸ� ����, "abcabcdede"�� ���� ���, ���ڸ� 2�� ������ �߶� �����ϸ� "abcabc2de"�� ������, 3�� ������ �ڸ��ٸ� "2abcdede"�� �Ǿ� 3�� ������ ���� ª�� ���� ����� �˴ϴ�. 
�̶� 3�� ������ �ڸ��� �������� ���� ���ڿ��� �״�� �ٿ��ָ� �˴ϴ�.

������ ���ڿ� s�� �Ű������� �־��� ��, ���� ������ ������� 1�� �̻� ������ ���ڿ��� �߶� �����Ͽ� ǥ���� ���ڿ� �� ���� ª�� ���� ���̸� return �ϵ��� solution �Լ��� �ϼ����ּ���. 
  
  
  s							result 
 
aabbaccc					7 		2a2ba3c
ababcdcdababcdcd			9		2ababcdcd
abcabcdede					8		2abcdede
abcabcabcabcdededededede	14		4abcdededededede	abcabcabcabc6de
xababcdcdababcdcd			17
  
  
  abcabcabcabcdededededede
  
  
  4abcdededededede			->	16
  abcabcabcabc6de			->	15
  2abcabc2dedede		->	14
  x2ab2cd2ab2cd			->17
  
  �ٸ� ����, "abcabcdede"�� ���� ���, ���ڸ� 2�� ������ �߶� �����ϸ� "abcabc2de"�� ������, 3�� ������ �ڸ��ٸ� "2abcdede"�� �Ǿ� 3�� ������ ���� ª�� ���� ����� �˴ϴ�.
  
  
  */
 