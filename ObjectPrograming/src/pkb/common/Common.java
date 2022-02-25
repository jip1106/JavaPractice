package pkb.common;

import java.util.ArrayList;

public class Common {
	//리스트 출력 함수
	public static void printArray(Object obj){
		System.out.println();
		if( obj instanceof ArrayList){
			ArrayList<Object> list = (ArrayList<Object>)obj;
			for(Object tmp : list){
				System.out.print(tmp + " , ");
			}
		}else if(obj instanceof int[]){
			
			int tmpArr[] = (int[])obj;
			
			for(int i=0; i<tmpArr.length; i++){
				System.out.print(tmpArr[i] + " , ");
			}
		}else if(obj instanceof double[]){
			
			double tmpArr[] = (double[])obj;
			
			for(int i=0; i<tmpArr.length; i++){
				System.out.print(tmpArr[i] + " , ");
			}
		}else if(obj instanceof Double[]){
			
			Double tmpArr[] = (Double[])obj;
			
			for(int i=0; i<tmpArr.length; i++){
				System.out.print(tmpArr[i] + " , ");
			}
		}
	}
	

	
	
}
