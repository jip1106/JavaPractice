package pkg.programers.week4;

//124 ����
public class Solution2 {

	public String solution(int n) {
        
        String answer = "";
        //�ӵ�����..!
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            int tmp = n%3;
            n= n/3;
            
            if(tmp==0){
                tmp=4;
                n = n-1;
            }
            
            //answer = tmp + answer;
            sb.insert(0,tmp);
        }
        
        return sb.toString();
    }
}
