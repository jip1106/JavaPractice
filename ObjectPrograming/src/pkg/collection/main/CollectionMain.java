package pkg.collection.main;

import java.util.ArrayList;

import pkg.collection.list.VectorArrayListForEx;

public class CollectionMain {

	public static void main(String[] args) {
		VectorArrayListForEx vaList = null;
		
		ArrayList<ArrayList<String>> listArr = new ArrayList<ArrayList<String>>();
		
		for(int i=0; i<3; i++) {
			ArrayList<String> inList = new ArrayList<String>();
			
			for(int j=0; j<=i; j++) {
				inList.add(i+"");
			}
			
			listArr.add(inList);
		}
		
		vaList = new VectorArrayListForEx(listArr.size());
		//System.out.println(listArr);
		vaList.setListArr(listArr);
		
		vaList.print(vaList, vaList.getSize(),"f");
		vaList.print(vaList, vaList.getSize(),"e");
		vaList.print(vaList, vaList.getSize(),"l");
		
		
		/*
		//for , 확장 for , forEach 
		for(int i=0; i<vaList.getSize(); i++) {
			ArrayList<String> inList = new ArrayList<String>();
			inList = vaList.getListArr().get(i);
			
			//확장 for 문
			for(String tmp : inList) {
				System.out.println(tmp + " :: 확장 for");
			}
			
			//forEach함수
			inList.forEach(index -> System.out.println(index + " :: forEach"));
			
			System.out.println("==================================");
		}
		*/
	
	}

}

// Collection Framework
/*
	-	컬렉션 프레임웍의 핵심 인터페이스 - List , Set, Map
		
		List => 중복을 허용하면서 저장 순서가 유지되는 컬렉션 => 순서가 있는 데이터의 집합 (중복 허용)
		 - 구현 클래스 : ArrayList , LinkedList, Stack, Vector .. 
		 
		Set => 중복을 허용하지 않고 저장순서가 유지되지 않는 컬렉션 => 순서가 없는 데이터의 집합, 데이터의 중복을 허용하지 않음
		 - 구현 클래스 : HashSet, TreeSet ..
		 
		Map => key value 쌍으로 이루어진 데이터 집합 , 순서 X key 중복X 값 중복 O
		 - 구현 클래스 : HashMap , TreeMap, Hashtable, Properties ...

*/