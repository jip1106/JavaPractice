package pkg.progromers.day1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 s = new Solution1();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","muzi frodo"};
		int k = 2;
		
		
		int answer[] = s.solution(id_list, report, k);
		/*
		int answerLength = answer.length;
		System.out.println(answerLength);
		for(int i=0; i<answerLength;i++){
			
			System.out.print(answer[i] + " ");
		}
		*/
		

	}

}
