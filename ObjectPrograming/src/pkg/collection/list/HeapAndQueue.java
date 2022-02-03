package pkg.collection.list;
import java.util.*;

public class HeapAndQueue implements Comparable<HeapAndQueue>{
/*
	ť -> FIFO (���� ����)
	�켱���� ť -> �켱������ ���� ���� �����Ͱ� ���� �����ȴ�. (������ �־��ٰ�, ��ġ�� ���� ���Ǻ��� Ȯ�� �ؾ� �ϴ� ��� ���)
	
	�켱���� ť�� ���� �ϴ� ��� 
	 1. ����Ʈ, ���Ḯ��Ʈ : ���� ����� ������, data�� ���� �� ��� �켱������ ����� ��ü �񱳸� ���� �ڸ��� ã��, ��ü �ڷḦ �о�� �ϴ� ���� ���� => ������ �켱���� ť�� ���� 
	 2. �� : ���� ���� Ʈ�� �ڷᱸ���� ���� (�켱���� ť�� ���� ��� �Ǿ���.)
	 
	 
	 
	 �� : �켱���� ť �� �����ϱ� ���� �ڷᱸ�� / �������� ����, �˻��� �ƴ� �켱������ ������ �˻�, ������ ������ �ڷᱸ�� 
	 - �ִ� �� / �ּ� ��
	 
	 �ִ� �� : ��Ʈ�� ���� ū ���� ����
	 �ּ� �� : ��Ʈ�� ���� ���� ���� ����
	 
	 
	PriorityQueue�� �켱���� ť�ν� �Ϲ����� ť�� ���� FIFO(First In First Out)�� �����鼭, �����Ͱ� ���� ������� �����Ͱ� ������ ���� �ƴ� �켱������ ���� �����ϰ� �� �켱������ ���� �����Ͱ� ���� ������ �ڷᱸ���̴�.
	PriorityQueue�� ����ϱ� ���ؼ� �켱���� ť�� ������ ��ü�� �ʼ������� Comparable Interface�� �����ؾ��Ѵ�.
	Comparable Interface�� �����ϸ� compareTo method�� override �ϰ� �ǰ� �ش� ��ü���� ó���� �켱���� ������ �������ָ� PriorityQueue �� �˾Ƽ� �켱������ ���� ��ü�� ���� ���ش�.
	  
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
