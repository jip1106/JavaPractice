package pkg.programers.day3;

public class Solution1 {
	public long solution(int w, int h) {
		long answer = 0;
		long tmp = 0;
        
		w=8;
		h=12;
		
        if(w==1 || h==1){
            return 0;
        }
        
        
        if(w==h){
            answer = (w*h)- w;
        }else{
        	 for(int i=0; i<w;i++){
        		 System.out.println("h/w :: " + (h/w));
        		 //tmp = (h/w)*i;
        		 tmp = (h*i)/w;
        		 System.out.println(tmp);
        		 answer += tmp;
        		 //System.out.println(answer);
             }
         }
        

        return answer*2;
		
	}
}
