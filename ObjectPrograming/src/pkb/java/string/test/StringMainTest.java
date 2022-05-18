package pkb.java.string.test;

public class StringMainTest {
	public static void main(String[] args) {
		System.out.println("================= compareTo() Test =================");
		String targetStr = "abcdefg";
		//앞에서부터 비교, 기준값에 비교대상이 포함되어 있는 경우  문자열 길이의 차이값을 리턴
		System.out.println(targetStr.compareTo("abcdefg"));	//0
		System.out.println(targetStr.compareTo("abcdef"));	//1
		System.out.println(targetStr.compareTo("abcde"));	//2
		System.out.println(targetStr.compareTo("abcd"));	//3
		
		//compareTo는 같은 위치의 문자만 비교한다, 맨 앞에서 바로 틀리면 틀린 문자의 아스키코드 차이값을 리턴한다 
		System.out.println(targetStr.compareTo("k"));		//-10  'a' (97)와 'k'(107)의 아스키코드 차이값
		System.out.println(targetStr.compareTo("bcdefg"));	//-1
		System.out.println(targetStr.compareTo("defg"));	//-3
		System.out.println(targetStr.compareTo("efg"));		//-4
		System.out.println(targetStr.compareTo("abadefg"));	// 2
		
		
		System.out.println("================= replace(char old, char new) Test =================");
		//4-1) char타입 2개를 인자로 받는다.
		targetStr = "parklaabbccparkjunil";
		System.out.println(targetStr.replace('l', 'x'));		//parkxaabbccparkjunix
		System.out.println(targetStr.replace('p', 'k'));		//karklaabbcckarkjunil
		System.out.println(targetStr.replace('a', 'c'));		//pcrklccbbccpcrkjunil
		
		System.out.println(targetStr.replace("park", "xxx"));		//xxxlaabbccxxxjunil
		System.out.println(targetStr.replace("ab", "xxx"));			//parklaxxxbccparkjunil
		System.out.println(targetStr.replace("aabbcc", "xxx"));		//parklxxxparkjunil
		
		System.out.println(targetStr.replaceAll("[pk]", "정규식"));		//정규식ar정규식laabbcc정규식ar정규식junil
		
		
		System.out.println(targetStr.replaceFirst("[pk]", "정규식"));		//정규식arklaabbccparkjunil
		
		
				System.out.println("================= contains(char old, char new) Test =================");
		targetStr = "abc";
		System.out.println(targetStr.contains("ab"));
		
		
		System.out.println("================= split =================");
		targetStr = "a,b,c,,,,d,,,";
		String arr[] = targetStr.split(",");
		String arrLimit[] = targetStr.split(",",-1);
		String arrLimit2[] = targetStr.split(",",5);
		
		System.out.println(arr.length);
		System.out.println(arrLimit.length);
		System.out.println(arrLimit2.length);
		
		for(String str : arr){
			String t =str.equals("") ? "비어있음" : str;
			System.out.print(t + "\t");
		}
		
		System.out.println();
		
		for(String str : arrLimit){
			String t =str.equals("") ? "비어있음" : str;
			System.out.print(t + "\t");
		}
		
		System.out.println();
		
		for(String str : arrLimit2){
			String t =str.equals("") ? "비어있음" : str;
			System.out.print(t + "\t");
		}
		
		
		System.out.println("====================== substring ======================");
		targetStr = "abc";
		
		System.out.println(targetStr.substring(1));
		
		CharSequence cs = new String("aa");
		 
		String tmp = (String)cs;	//error
		
		
		
		
		
		
	}
}


