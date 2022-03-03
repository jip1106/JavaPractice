package pkg.programers.week5;
import java.util.*;

import pkb.common.Common;

public class ArraySortComparatorTest {
	
	//ArrayList sort
	public void arraySortTest(){
		ArrayList<Integer> rtnList = new ArrayList<Integer>();
		
		rtnList.add(7);
		rtnList.add(2);
		rtnList.add(9);
		rtnList.add(10);
		
		System.out.println("리스트 정렬 :: Collections.sort(list)");  
		Collections.sort(rtnList, Collections.reverseOrder());
		Common.printArray(rtnList);

		System.out.println("리스트 역순 정렬 :: Collections.sort(list, Collections.reverseOrder())");
		Collections.sort(rtnList);
		Common.printArray(rtnList);
		
		
		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println();
		stringList.add("1");
		stringList.add("3");
		stringList.add("0");
		stringList.add("5");
		stringList.add("10");
		System.out.println("String 리스트");
		Common.printArray(stringList);
		
		System.out.println("String 리스트 정렬 :: Collections.sort(list)");
		Collections.sort(stringList);
		Common.printArray(stringList);
		
		System.out.println("String 리스트 역순 정렬 :: Collections.sort(list,Collections.reverseOrder())");
		Collections.sort(stringList, Collections.reverseOrder());
		Common.printArray(stringList);
		
		
		

		
		
		
	}
}
