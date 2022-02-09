package pkg.programers.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


public class Solution2 {
    public int solution() {
    	//[1, 2, 3, 9, 10, 12]  / 7 / answer = 2 
    	int scoville[] = {1,1,1};
    	
    	// => 1 2 3 9 10 12 		=>		size : 6
    	// 1 + 4 => 5				
    	// 5 3 9 10 12				=>	
    	//  => 1 10 				=>		7
    	
    	int K = 2;
        int answer = 0;
        
        PriorityQueue<Integer> heapmin = new PriorityQueue<Integer>();
        for(int i=0; i<scoville.length; i++) {
            heapmin.offer(scoville[i]);
        }

        while(heapmin.peek()<K) {
            
            int new_food = heapmin.poll() + heapmin.poll()*2;
            heapmin.offer(new_food);
            answer++;
            
            if(heapmin.peek()>=K) break;
            if(heapmin.size()==1 && heapmin.peek()<K) {
                answer=-1;
                break;
            }
            
        }
        
        System.out.println(answer);
        
        return answer;
        
        /*        
        ArrayList<Integer> scovilleList = new ArrayList<Integer>();
        
        for(int tmp : scoville){
        	scovilleList.add(tmp);
        }
        
        if(scovilleList.size() == 1){
            if(scovilleList.get(0) >= K){
                return answer;
            }else{
                return -1;
            }
        }
        
        //정렬
        Collections.sort(scovilleList);                         
        
        while(scovilleList.get(0)<K ) {                 
           if( scovilleList.size()==1){                                 
                answer = -1;
                break;  
            }

            int tmp = scovilleList.get(0)+(scovilleList.get(1)*2);         

            scovilleList.remove(1);
            scovilleList.remove(0);
            scovilleList.add(tmp);

            answer++;                                          

            Collections.sort(scovilleList);                         
        }
        
        
        return answer;
        */
    }
}


/*
매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 

모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.

섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.

Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 

모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

제한 사항
scoville의 길이는 2 이상 1,000,000 이하입니다.

K는 0 이상 1,000,000,000 이하입니다.

scoville의 원소는 각각 0 이상 1,000,000 이하입니다.

모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.

*/