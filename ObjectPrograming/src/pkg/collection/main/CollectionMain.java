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
		
		/*ArrayList => ������ �ִ� ������ �ߺ��� ������ �÷��� */
		ArrayList<Object> list = new ArrayList<Object>();

		// add(value) => value �߰�
		list.add("����");		
		list.add("����");
		list.add("����");
		
		list.forEach(tmp -> System.out.print(tmp  + ","));
		
		//add(index,value) => index ��ġ�� value �߰�
		list.add(1,"�λ�");	
		System.out.println();
		list.forEach(index -> System.out.print(index + ","));
		
		System.out.println();
		
		// get(index) index�� �� ��������
		System.out.println(list.get(1));
		
		// set(index,value) index�� �� ����
		list.set(1,"�λ꺯��");		
		System.out.println(list.get(1));
		
		//indexOf(value) index 0���� ������� �˻� => ���°�� -1
		System.out.println(list.indexOf("����"));				
		//lastIndexOf(value) �ݴ� ������ �˻� => ���°�� -1
		System.out.println(list.lastIndexOf("����"));			
		System.out.println(list.lastIndexOf("�뱸") + "," + list.indexOf("�뱸"));			
		
		// remove(index)	index�� �� ����
		list.remove(0);				
		// remove(value)	ù��° �˻� �� ����
		list.remove("����");		 
		
		list.forEach(tmp -> System.out.println(tmp));
		//����Ǿ� �ִ� ���� ����
		System.out.println(list.size());		
		
		//contains(value) : value �� �ִ��� ������ ��ȯ
		String tmp = list.contains("�λ꺯��") ? "����" : "������";  
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
		//����Ʈ�� �� ��� ����
		list3.clear();
		//����Ʈ�� ����ִ��� Ȯ��
		if(!list3.isEmpty()){	
			list3.forEach(tmp3 -> System.out.print(tmp3 + " "));
		}else{
			System.out.println("�������");
		}
		
		list3.add("test1");
		//list1.addAll(list2) => list1, list2 �� ��ħ
		list.addAll(list2);
		list.addAll(list3);
		list.forEach(tmp3 -> System.out.print(tmp3 + " "));
		
		System.out.println();
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("�λ꺯��");
		list4.add("�λ꺯��");
		list4.add("����");
//		list4.add("����");
		list4.forEach(tmp3 -> System.out.print(tmp3 + " "));
		
		System.out.println();
		//list1.containsAll(list2) => list2�� ������ ��� ���� ���ԵǾ� �ִ��� ���θ� ��ȯ
		if(list.containsAll(list4)){
			System.out.println("�������X");
		}else{
			System.out.println("�������O");
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
	-	�÷��� �����ӿ��� �ٽ� �������̽� - List , Set, Map
		
		List => �ߺ��� ����ϸ鼭 ���� ������ �����Ǵ� �÷��� => ������ �ִ� �������� ���� (�ߺ� ���)
		 - ���� Ŭ���� : ArrayList , LinkedList, Stack, Vector .. 
		 
		Set => �ߺ��� ������� �ʰ� ��������� �������� �ʴ� �÷��� => ������ ���� �������� ����, �������� �ߺ��� ������� ����
		 - ���� Ŭ���� : HashSet, TreeSet ..
		 
		Map => key value ������ �̷���� ������ ���� , ���� X key �ߺ�X �� �ߺ� O
		 - ���� Ŭ���� : HashMap , TreeMap, Hashtable, Properties ...

*/