package pkb.java.string.test;

public class StringMainTest {
	public static void main(String[] args) {
		System.out.println("================= compareTo() Test =================");
		String targetStr = "abcdefg";
		//�տ������� ��, ���ذ��� �񱳴���� ���ԵǾ� �ִ� ���  ���ڿ� ������ ���̰��� ����
		System.out.println(targetStr.compareTo("abcdefg"));	//0
		System.out.println(targetStr.compareTo("abcdef"));	//1
		System.out.println(targetStr.compareTo("abcde"));	//2
		System.out.println(targetStr.compareTo("abcd"));	//3
		
		//compareTo�� ���� ��ġ�� ���ڸ� ���Ѵ�, �� �տ��� �ٷ� Ʋ���� Ʋ�� ������ �ƽ�Ű�ڵ� ���̰��� �����Ѵ� 
		System.out.println(targetStr.compareTo("k"));		//-10  'a' (97)�� 'k'(107)�� �ƽ�Ű�ڵ� ���̰�
		System.out.println(targetStr.compareTo("bcdefg"));	//-1
		System.out.println(targetStr.compareTo("defg"));	//-3
		System.out.println(targetStr.compareTo("efg"));		//-4
		System.out.println(targetStr.compareTo("abadefg"));	// 2
		
		
		System.out.println("================= replace(char old, char new) Test =================");
		//4-1) charŸ�� 2���� ���ڷ� �޴´�.
		targetStr = "parklaabbccparkjunil";
		System.out.println(targetStr.replace('l', 'x'));		//parkxaabbccparkjunix
		System.out.println(targetStr.replace('p', 'k'));		//karklaabbcckarkjunil
		System.out.println(targetStr.replace('a', 'c'));		//pcrklccbbccpcrkjunil
		
		System.out.println(targetStr.replace("park", "xxx"));		//xxxlaabbccxxxjunil
		System.out.println(targetStr.replace("ab", "xxx"));			//parklaxxxbccparkjunil
		System.out.println(targetStr.replace("aabbcc", "xxx"));		//parklxxxparkjunil
		
		System.out.println(targetStr.replaceAll("[pk]", "���Խ�"));		//���Խ�ar���Խ�laabbcc���Խ�ar���Խ�junil
		
		
		System.out.println(targetStr.replaceFirst("[pk]", "���Խ�"));		//���Խ�arklaabbccparkjunil
		
		
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
			String t =str.equals("") ? "�������" : str;
			System.out.print(t + "\t");
		}
		
		System.out.println();
		
		for(String str : arrLimit){
			String t =str.equals("") ? "�������" : str;
			System.out.print(t + "\t");
		}
		
		System.out.println();
		
		for(String str : arrLimit2){
			String t =str.equals("") ? "�������" : str;
			System.out.print(t + "\t");
		}
		
		
		System.out.println("====================== substring ======================");
		targetStr = "abc";
		
		System.out.println(targetStr.substring(1));
		
		CharSequence cs = new String("aa");
		 
		String tmp = (String)cs;	//error
		
		
		
		
		
		
	}
}


