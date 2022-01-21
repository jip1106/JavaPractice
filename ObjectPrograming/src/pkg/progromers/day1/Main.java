package pkg.progromers.day1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======================1¹ø====================");
		Solution1 s = new Solution1();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","muzi frodo"};
		int k = 2;
		
		
		int answer[] = s.solution(id_list, report, k);
		
		int answerLength = answer.length;
		System.out.println(answerLength);
		for(int i=0; i<answerLength;i++){
			
			System.out.print(answer[i] + " ");
		}
		
		
		System.out.println("\n======================2¹ø====================");
		Solution2 s2 = new Solution2();
		
		
		//aabbaccc					7 		2a2ba3c
		//ababcdcdababcdcd			9		2ababcdcd
		//abcabcdede				8		2abcdede
		//abcabcabcabcdededededede	14		4abcdededededede	abcabcabcabc6de
		//xababcdcdababcdcd			17
		
		
		System.out.println(s2.solution("aabbaccc"));
		/*
		System.out.println(s2.solution("ababcdcdababcdcd"));
		System.out.println(s2.solution("abcabcdede"));
		System.out.println(s2.solution("abcabcabcabcdededededede"));
		System.out.println(s2.solution("xababcdcdababcdcd"));
		*/
		
		
		
	}

}
