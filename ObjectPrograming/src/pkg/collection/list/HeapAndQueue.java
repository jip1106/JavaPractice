package pkg.collection.list;
import java.util.*;

public class HeapAndQueue implements Comparable<HeapAndQueue>{
/*
	큐 -> FIFO (선입 선출)
	우선순위 큐 -> 우선순위가 가장 높은 데이터가 먼저 삭제된다. (물건을 넣었다가, 가치가 높은 물건부터 확인 해야 하는 경우 사용)
	
	우선순위 큐를 구현 하는 경우 
	 1. 리스트, 연결리스트 : 구현 방법은 쉽지만, data가 많아 질 경우 우선순위에 기반해 전체 비교를 거쳐 자리를 찾고, 전체 자료를 밀어야 하는 단점 존재 => 힙으로 우선순위 큐를 구현 
	 2. 힙 : 완전 이진 트리 자료구조의 일종 (우선순위 큐를 위해 고안 되었다.)
	 
	 
	 
	 힙 : 우선순위 큐 를 구현하기 위한 자료구조 / 데이터의 정렬, 검색이 아닌 우선순위의 데이터 검색, 삭제에 유용한 자료구조 
	 - 최대 힙 / 최소 힙
	 
	 최대 힙 : 루트가 가장 큰 값을 가짐
	 최소 힙 : 루트가 가장 작은 값을 가짐
	 
	 
	PriorityQueue란 우선순위 큐로써 일반적인 큐의 구조 FIFO(First In First Out)를 가지면서, 데이터가 들어온 순서대로 데이터가 나가는 것이 아닌 우선순위를 먼저 결정하고 그 우선순위가 높은 데이터가 먼저 나가는 자료구조이다.
	PriorityQueue를 사용하기 위해선 우선순위 큐에 저장할 객체는 필수적으로 Comparable Interface를 구현해야한다.
	Comparable Interface를 구현하면 compareTo method를 override 하게 되고 해당 객체에서 처리할 우선순위 조건을 리턴해주면 PriorityQueue 가 알아서 우선순위가 높은 객체를 추출 해준다.
	  
*/
	private int number;
	private String content;
	
	public HeapAndQueue(int number, String content){
		this.number = number;
		this.content = content;
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public String getContent(){
		return this.content;
	}
	

	@Override
	public int compareTo(HeapAndQueue haq) {
		int rtnVal = 0;
		// TODO Auto-generated method stub
		if(this.number > haq.getNumber()){
			rtnVal = 1;
		}else if(this.number == haq.getNumber()){
			rtnVal = 0;
		}else if(this.number < haq.getNumber()){
			rtnVal = -1;
		}
		return rtnVal;
	}
	
	
	 
}
