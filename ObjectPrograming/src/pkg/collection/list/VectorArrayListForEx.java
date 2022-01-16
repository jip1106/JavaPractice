package pkg.collection.list;

import java.util.ArrayList;

public class VectorArrayListForEx {
  // Vector와 ArrayList 는 List 인터페이스를 구현한 클래스.
	private int size;
	private ArrayList<ArrayList<String>> listArr;
	
	public VectorArrayListForEx(){}
	
	public VectorArrayListForEx(int size) {
		listArr = new ArrayList<ArrayList<String>>(size);
		this.size = size;
	}
		
	
	public ArrayList<ArrayList<String>> getListArr() {
		return listArr;
	}

	public void setListArr(ArrayList<ArrayList<String>> listArr) {
		this.listArr = listArr;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	

	public void print(VectorArrayListForEx vaList, int size, String type) {
		
		switch(type) {
		case "f" : 
			System.out.print("for :: ");
			for(int i=0; i<vaList.getSize(); i++) {
				ArrayList<String> inList = new ArrayList<String>();
				inList = vaList.getListArr().get(i);
				
				for(int j=0; j<inList.size(); j++) {
					callFunc(inList.get(j));
				}
			}
			System.out.println();
			break;
			
		case "e" : 
			System.out.print("확장 for :: ");
			for(ArrayList<String> inList : vaList.getListArr()) {
				for(String tmp : inList ) {
					callFunc(tmp);
				}
			}
			System.out.println();
			break;
		case "l" : 
			System.out.print("람다식 :: ");
			vaList.getListArr().forEach(inList -> inList.forEach(tmp -> callFunc(tmp)));
			System.out.println();
			break;
		}
		
	}
	
	private void callFunc(String index) {
		System.out.print(index + " ");
	}
	
	
	
	
}
