package pkg.collection.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import pkg.collection.list.VectorArrayListForEx;

public class CollectionMain {

	public static void main(String[] args) {
		VectorArrayListForEx vaList = null;
		int vaListSize = 3;
		ArrayList<ArrayList<String>> listArr = new ArrayList<ArrayList<String>>();
		
		for(int i=0; i<vaListSize; i++) {
			ArrayList<String> inList = new ArrayList<String>();
			
			for(int j=0; j<=i; j++) {
				inList.add(i+"");
			}
			
			listArr.add(inList);
		}
		
		vaList = new VectorArrayListForEx(listArr.size());
		vaList.setListArr(listArr);
		
		vaList.print(vaList, vaList.getSize(),"f");
		vaList.print(vaList, vaList.getSize(),"e");
		vaList.print(vaList, vaList.getSize(),"l");
		
		/*ArrayList => 순서가 있는 데이터 중복이 가능한 컬렉션 */
		ArrayList<Object> list = new ArrayList<Object>();

		// add(value) => value 추가
		list.add("서울");		
		list.add("대전");
		list.add("서울");
		
		list.forEach(tmp -> System.out.print(tmp  + ","));
		
		//add(index,value) => index 위치에 value 추가
		list.add(1,"부산");	
		System.out.println();
		list.forEach(index -> System.out.print(index + ","));
		
		System.out.println();
		
		// get(index) index의 값 가져오기
		System.out.println(list.get(1));
		
		// set(index,value) index의 값 변경
		list.set(1,"부산변경");		
		System.out.println(list.get(1));
		
		//indexOf(value) index 0부터 순서대로 검색 => 없는경우 -1
		System.out.println(list.indexOf("서울"));				
		//lastIndexOf(value) 반대 순서로 검색 => 없는경우 -1
		System.out.println(list.lastIndexOf("서울"));			
		System.out.println(list.lastIndexOf("대구") + "," + list.indexOf("대구"));			
		
		// remove(index)	index의 값 삭제
		list.remove(0);				
		// remove(value)	첫번째 검색 값 삭제
		list.remove("서울");		 
		
		list.forEach(tmp -> System.out.println(tmp));
		//저장되어 있는 값의 갯수
		System.out.println(list.size());		
		
		//contains(value) : value 가 있는지 없는지 반환
		String tmp = list.contains("부산변경") ? "포함" : "미포함";  
		System.out.println(tmp);
		
		//ArrayList to Array
		String[] arr  = list.toArray(new String[list.size()]);
		for(String tmpArr : arr){
			System.out.print(tmpArr + " ");
		}
		
		//Array to List
		List<String> list2 = Arrays.asList(arr);
		list2.forEach(tmp3 -> System.out.print(tmp3 + " "));
		
		System.out.println();
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("test1");
		list3.add("test2");
		list3.add("test3");
		//리스트의 값 모두 삭제
		list3.clear();
		//리스트가 비어있는지 확인
		if(!list3.isEmpty()){	
			list3.forEach(tmp3 -> System.out.print(tmp3 + " "));
		}else{
			System.out.println("비어있음");
		}
		
		list3.add("test1");
		//list1.addAll(list2) => list1, list2 를 합침
		list.addAll(list2);
		list.addAll(list3);
		list.forEach(tmp3 -> System.out.print(tmp3 + " "));
		
		System.out.println();
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("부산변경");
		list4.add("부산변경");
		list4.add("대전");
//		list4.add("서울");
		list4.forEach(tmp3 -> System.out.print(tmp3 + " "));
		
		System.out.println();
		//list1.containsAll(list2) => list2로 제공한 모든 값이 포함되어 있는지 여부를 반환
		if(list.containsAll(list4)){
			System.out.println("순서상관X");
		}else{
			System.out.println("순서상관O");
		}
		
		
		
		/*
		 HashMap<Integer, String> collect = list
	                .stream()
	                .collect(HashMap<Integer, String>::new,
	                        (map, streamValue) -> map.put(map.size(), (String) streamValue),
	                        (map, map2) -> {
	                        });

	        collect.forEach((k, v) -> System.out.println(k + ":" + v));
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