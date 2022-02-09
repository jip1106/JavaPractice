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
        
        //����
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
�ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�. 

��� ������ ���ں� ������ K �̻����� ����� ���� Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.

���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)

Leo�� ��� ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�.

Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� ���ϴ� ���ں� ���� K�� �־��� ��, 

��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ� �ּ� Ƚ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
scoville�� ���̴� 2 �̻� 1,000,000 �����Դϴ�.

K�� 0 �̻� 1,000,000,000 �����Դϴ�.

scoville�� ���Ҵ� ���� 0 �̻� 1,000,000 �����Դϴ�.

��� ������ ���ں� ������ K �̻����� ���� �� ���� ��쿡�� -1�� return �մϴ�.

*/