package pkg.programers.week4;

//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
/*
  lv1
	제한 조건
	행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
	입출력 예
	arr1	arr2	return
	[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
	[[1],[2]]	[[3],[4]]	[[4],[6]]
*/
public class Solution1 {
	
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		
		 int[][] answer = new int[arr1.length][arr1[0].length];
		 
		 
		 for(int i=0; i<arr1.length; i++){
			 for(int j=0; j<arr1[j].length; j++){
				 answer[i][j] = arr1[i][j] + arr2[i][j];
	         }
	     }
	        
		 return answer;
	}
	
	/*
	  lv1
		프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
		전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요
	 */
	public static String solution1(String phone_number) {
		
		 String answer = "";
		 phone_number = "1019644";
		 
		 
		 int size = phone_number.length();
		 int maskingLen = size - 4;
		 
		 if(maskingLen == 0){
			 answer = phone_number;
		 }else{
			 for(int i=0; i<maskingLen; i++){
				 answer+="*";
			 }
			 answer += phone_number.substring(maskingLen);
		 }
		 
	     System.out.println(answer); 
		 return answer;
	}
	
	/*
	lv1 하샤드 수
	양의 정수 x가 하샤드 수이려면 
	x의 자릿수의 합으로 x가 나누어져야 합니다. 
	예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
    x는 1 이상, 10000 이하인 정수입니다
	
	*/
	public static boolean solution2(int x){
		boolean answer = true;
		
		int sum = 0;
		int tmp = x;			

		while(tmp != 0 ){		// x>1
			sum = sum + (tmp%10);
			tmp = tmp/10;
		}
		
		answer = (x%sum == 0 ) ? true : false;
				
		return answer;
	}
	
	/*
	  lv1
	  정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	*/
	public static double solution3(int[] arr){
		double answer = 0;
		double sum = 0;
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		answer = sum / arr.length;
		
		return answer;
	}
	
	/*
	  lv1 콜라츠 추측
	  	1-1. 입력된 수가 짝수라면 2로 나눕니다. 
		1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
		2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
		
		 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 
		. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
	*/
	
	 public static int solution4(int num) {
	        int answer = 0;
	        
	        long result = num;
	        
	        while(result != 1){

	        	if(result %2 == 0){
	        		result = result/2;
	        	}else{
	        		result = result*3 + 1;
	        	}

	        	answer++;
	        	
	        	if(answer >= 500){
	        		answer = -1;
	        		break;
	        	}
	        }
	        
	        return answer;
	    }
	 
	 
	 /* solution5
	   	최대공약수와 최소공배수
		문제 설명
		두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
		
		제한 사항
		두 수는 1이상 1000000이하의 자연수입니다.
		입출력 예
		n	m	return
		3	12	[3, 12]
		2	5	[1, 10]
		입출력 예 설명
		입출력 예 #1
		위의 설명과 같습니다.
		
		입출력 예 #2
		자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
	  */
	 
	 //lv 1 최대공약수와 최소공배수
	 public static int gcd(int n, int m){
		 if(n%m == 0) { 
			 return m; 
		 } 
		 return gcd(m, n%m);
	 }
	 
	 public static  int[] solution5(int n, int m) {
		    int[] answer = {};
		    answer = new int[2];
		    int tmp = 0;
		    
		    if(m > n){
		    	tmp = m;
		    	m = n;
		    	n = tmp;
		    }
		    
		    answer[0] = gcd(n,m);
		    answer[1] = n*m / gcd(n,m);
		    
		    System.out.println(answer[0] + " " + answer[1]);
	        return answer;
	 }
	 
	 /*lv1 제일 작은 수 제거하기
	 	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
	 	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다
	 	
	 	************* 스트림 공부하기 *************
	 */
	 public static int[] solution6(int[] arr) {
	        int[] answer = new int[arr.length];
	        int min = arr[0];
	        
	        if(arr.length == 1){
	        	answer = new int[1];
	        	answer[0] = -1;
	        }else{
	        	
	        	for(int i=0; i<arr.length;i++){
	        		if(arr[i] < min) {
	        			min = arr[i];
	        		}
	        	}
	        	
	        	answer = new int[arr.length-1];
	        	
	        	int idx = 0;

	        	for(int i=0; i<arr.length; i++){
	                if(min == arr[i]){
	                    continue;
	                }
	                answer[idx++] = arr[i];
	            }
	        }
	        
	        return answer;
	 }
	 
	 /*
	  * lv1 문자열 내 p와 y의 개수
	  * */
	 public static boolean solution(String s) {
	        boolean answer = true;
	        int yCnt = 0;
	        int pCnt = 0;
	        
	        s = s.toUpperCase();
	        char []sArr = s.toCharArray();
	        
	        for(char tmp : sArr){
	        	if(tmp == 'Y'){
	        		yCnt ++;
	        	}else if(tmp =='P'){
	        		pCnt ++;
	        	}
	        }
	        
	        answer = (pCnt == yCnt) ? true : false;

	        return answer;
	    }

}
