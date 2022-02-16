package pkg.programers.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

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
	 public static boolean solution7(String s) {
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
	 
	 /*
	  	lv1 나누어 떨어지는 숫자 배열
	  	
	  	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
		divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요
	  */
	   public static int[] solution8(int[] arr, int divisor) {
	        int[] answer = {};
	        int answerCnt = 0; 
	        
	        if(divisor == 1){
	        	answer = arr;
	        }else{
	        	for(int tmp : arr){
	        		if((tmp % divisor)==0){
	        			answerCnt++;
	        		}
	        	}
	        	
	        	int tmp = 0;
	        	
	        	if(answerCnt == 0){
	        		answer = new int[1];
	        		answer[0] = -1;
	        	}else{
	        		answer = new int[answerCnt];
	        		
	        		for(int i=0; i<answer.length;i++){
	        			for(int j=tmp; j<arr.length; j++){
	        				if((arr[j] % divisor) == 0){
	        					tmp = j+1;
        						answer[i] = arr[j];
	        					break;	

	        				}
	        			}
	        		}
	        	}
	        }
	                	
        	Arrays.sort(answer);
        	
	        
	        return answer;
	    }
	   
	   /**
	    	lv1 정수 내림차순으로 배치하기
	    	정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	    */
	   public static long solution9(long n) {
	        long answer = 0;
	        
	        ArrayList<Long> list = new ArrayList<Long>();
	        long tmp = n;
	        
	        while(tmp != 0 ){
	        	list.add(tmp%10);
	        	tmp /=10;
	        }
	        
	        list.sort(Comparator.reverseOrder());
	        int size = list.size();
        
 
	        for(int i=0; i<size ;i++){
	        	answer += list.get(i) * Math.pow(10, size-i-1);  
	        	
	        }
	        
	        return answer;
	    }
	   
	   /*
	    * lv1 자릿수 더하기
	    * */
	   public static int solution10(int n){
		   int answer = 0;
		   
		   while(n!=0){
			   answer += n%10;
			   n /= 10; 
		   }
		   
		   return answer;
	   }
	   
	   /*
	    * lv1 자연수 뒤집어 배열로 만들기	=> 질문하기.... 
	    * */
	   public static int[] solution11(long n){
		   int[] answer = {};
		   String tmp = String.valueOf(n);
		   
		   char cAnswer[] = tmp.toCharArray();
		   int size = cAnswer.length;
		   
		   answer = new int[size];
		   int j=0;
		   for(int i=size-1; i>=0; i--){
			   answer[j++] = Integer.parseInt(cAnswer[i]+""); 
		   }
		   
		   for(int i=0; i<answer.length;i++){
			   System.out.print(answer[i]);
		   }
		   
		   /*
		   int in = (int)n;
	        
	       int len = (int) (Math.log10(in)+1);
	       answer = new int[len];
	        
	       int i=0;

	       while(in!=0){
	          answer[i++] = in%10 ;
	          in /=10;
	       }
	       */
	       return answer;
	   }
	   
	   /*lv1 정수 제곱근 판별
	       임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
		n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	    * */
	   public static long solution12(long n){
	        long answer = 0;
	        
	        double tmp = Math.sqrt(n);
	        
	        answer = (tmp%1 == 0)? (long)(Math.pow(tmp+1, 2)) : -1;
	        
	        /*
	        if(tmp%1 == 0){
	        	answer = (long)(Math.pow(tmp+1, 2));
	        }else{
	        	answer = -1;
	        }
	        */
	        
	        return answer;
	   }
	   
	   /*lv1 문자열을 정수로 바꾸기
	    * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

		제한 조건
		s의 길이는 1 이상 5이하입니다.
		s의 맨앞에는 부호(+, -)가 올 수 있습니다.
		s는 부호와 숫자로만 이루어져있습니다.
		s는 "0"으로 시작하지 않습니다.
		입출력 예
		예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
		str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
	    * */
	   public static int solution13(String s){
		   int answer = 0;
		   answer = Integer.parseInt(s);

		   return answer;
	   }
	   
	   
	   /*
	    * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
	    * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
	    * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, 
	    * solution을 완성하세요.
	    * */
	   public static String solution14(String s) {
	        String answer = "";
	        
	        String []splitArr = s.split(" ", -1);
	        
	        int size = splitArr.length;
	        System.out.println();
	       
	        for(int i=0; i<size; i++){
	        	for(int j=0; j<splitArr[i].length(); j++){
	        		if(j%2==0){
	        			answer += String.valueOf(splitArr[i].charAt(j)).toUpperCase();
	        		}else{
	        			answer += String.valueOf(splitArr[i].charAt(j)).toLowerCase();
	        		}
	        	}
	        	if(i!= size-1)answer += " ";
	        }
	        
	        System.out.println(answer);
	        
	        return answer;
	    }
	   
	  

}
