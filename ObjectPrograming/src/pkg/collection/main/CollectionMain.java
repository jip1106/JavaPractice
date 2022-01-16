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
		//for , Ȯ�� for , forEach 
		for(int i=0; i<vaList.getSize(); i++) {
			ArrayList<String> inList = new ArrayList<String>();
			inList = vaList.getListArr().get(i);
			
			//Ȯ�� for ��
			for(String tmp : inList) {
				System.out.println(tmp + " :: Ȯ�� for");
			}
			
			//forEach�Լ�
			inList.forEach(index -> System.out.println(index + " :: forEach"));
			
			System.out.println("==================================");
		}
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