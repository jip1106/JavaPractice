package pkg.programers.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

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
	   
	   /* lv1 약수의 합 
	    * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요. */
	   public static int solution15(int n){
		   int answer = 0;
		   for(int i=1; i<=n; i++){
			   if(n%i == 0){
				   answer += i;
			   }
		   }
		   System.out.println("lv1 : 약수의 합  : " + answer);
		   
		   return answer;
	   }
	   
	   /*
	    * lv1 시저암호
	    * 
	    * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
	    * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 
	    * 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

			제한 조건
			공백은 아무리 밀어도 공백입니다.
			s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
			s의 길이는 8000이하입니다.
			n은 1 이상, 25이하인 자연수입니다.
	    * */
	   
	   public static String solution16(String s, int n){
		   String answer = "";
		   char []cArr = s.toCharArray();
		   
		   //abcdefghijklmnopqrstuvwxyz 
		   for(int i=0; i<cArr.length;i++){
			      if(cArr[i] == ' '){
			    	  continue;
			      }else{
			    	  //대소문자 체크
			    	  boolean chk = Character.isUpperCase(cArr[i]) ? true : false;
			    	  
			    	  cArr[i] = (char)(cArr[i] + n);
			    	  
			    	  if(chk){
			    		  if(cArr[i] > 'Z'){
			    			  cArr[i] = (char)('A' + (cArr[i] -'Z' - 1));
			    		  }
			    	  }else{
			    		  if(cArr[i] > 'z'){
			    			  cArr[i] = (char)('a' + (cArr[i] -'z' - 1));
			    		  }			    		  
			    	  }
			    	  
			    	  			    	  
			      }
		   }
		   
		   answer = String.valueOf(cArr);
		   //System.out.println(answer);
		   
		   return answer;
	   }
	   
	   /*
	    	lv1 소수찾기
		   1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
		      소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
		   (1은 소수가 아닙니다.)
	   */
	   public static int solution17(int n){
		   int answer = 0;
		   
		   for(int i=2; i<=n; i++){
			   boolean chk = true;
			   for(int j = 2; (int)Math.pow(j,2)<= i ; j++){
				   if(i%j==0){
					   chk = false;
					   break;
				   }
			   }
			   
			   if(chk){
				   answer++;
			   }
		   }
		   
		   return answer;
	   }
	   
	   /* lv1 수박수박수?
	    * 
	    * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
	    * */
	   public static String solution18(int n){
		   String answer = "";
		   
		   for(int i=0; i<n; i++){
			   if(i==0){
				   answer += "수";
			   }else{
				   answer += i%2==0? "수" : "박";
			   }
		   }
		   
		   System.out.println(answer);
		   
		   
		   return answer;
	   }
	   
	   /* lv1 서울에서 김서방 찾기*/
	   public static String solution19(String[] seoul){
		   String answer = "";
		   int idx = 0;
		   for(String tmp : seoul){
			   
			   if(tmp.equals("Kim")){
				   break;
			   }
			   idx++;
		   }
		   answer = "김서방은 " + idx + "에 있다";
		   return answer;
	   }
	   
	   /* 문자열 s의 길이가 4 혹은 6 이고, 숫자로만 구성되어 있는지 확인해주는 함수 */
	   public static boolean solution20(String s){
	        boolean answer = true;
	        
	        if(!(s.length() == 4 || s.length() == 6)){
	        	answer = false;	        	
	        }else{
	        	try{
	        		Integer.parseInt(s);
	        		answer = true;
	        	}catch(Exception e){
	        		answer = false;
	        	}
	        }
	        
	        return answer;
	   }
	   
	   /*lv1 문자열 내림차순으로 배치하기*/
	   public static String solution21(String s){
		   String answer = "";
		   char cArr[] = s.toCharArray();
		   
		   Character chArr[] = new Character[s.length()];
		   
		   for(int i=0; i<cArr.length;i++){
			   chArr[i] = cArr[i];
		   }
		   
		   Arrays.sort(chArr,Collections.reverseOrder());
		   for(Character tmp : chArr){
			   answer += tmp;
		   }
		   
		   return answer;
	   }
	   
	   /*두 정수 사이의 합*/
	   public static long solution22(int a, int b){
		   long answer = 0;
		   long la = (long)a;
		   long lb = (long)b;
		   
		   long tmp = 0;
		   
		   if(la > lb){
	            tmp = lb;
	            lb = la;
	            la = tmp;
	        }
		   
		   for(long i=la; i<=lb; i++){
			   answer += i;
		   }
		   
		   return answer;
	   }
	   
	   /*lv1 같은 숫자는 싫어
		배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
		단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

		arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
		arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
		배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
		
		제한사항
		배열 arr의 크기 : 1,000,000 이하의 자연수
		배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
	    * */
	   	public static int[] solution23(int []arr){
	   		int[] answer = {};
	   		
	   		ArrayList<Integer> aList = new ArrayList<Integer>();
	   		
	   		int tmp = 10;
	   		for(int i=0; i<arr.length; i++){
	   			if(tmp != arr[i]){
	   				aList.add(arr[i]);
	   			}
	   			tmp = arr[i];
	   		}
	   		
	   		answer = new int[aList.size()];
	   		for(int i=0; i<answer.length;i ++){
	   			answer[i] = aList.get(i);
	   			System.out.print(answer[i] + " ");
	   		}
	   		
	   		
	   		return answer;
	   	}
	   	
	   	
	   	/*	lv1 문자열 내 마음대로 정렬하기   *********************************************************
	   	  	문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 
	   	  	각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
	   	  	예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

			제한 조건
			strings는 길이 1 이상, 50이하인 배열입니다.
			strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
			strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
			모든 strings의 원소의 길이는 n보다 큽니다.
			인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
			입출력 예
			strings					n	return
			["sun", "bed", "car"]	1	["car", "bed", "sun"]			=> u , e , a 로 strings를 정렬? => a e u
			["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]			=>	c, c, x 로 strings를 정렬?
			입출력 예 설명
			입출력 예 1
			"sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다. 이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다.
			
			입출력 예 2
			"abce"와 "abcd", "cdx"의 2번째 인덱스 값은 "c", "c", "x"입니다. 
			따라서 정렬 후에는 "cdx"가 가장 뒤에 위치합니다. "abce"와 "abcd"는 사전순으로 정렬하면 "abcd"가 우선하므로, 답은 ["abcd", "abce", "cdx"] 입니다.
	   	 * 
	   	 * */
		public static String[] solution24(String[] strings, int n){
			String[] answer = {};
	        return answer;
	   
		}
		
		/*lv1 가운데 글자 가져오기
		 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
		 * */
		public static String solution25(String s) {
	        String answer = "";
	        int len = s.length();
	        char[] cArr = s.toCharArray();
	       
	        int idx = len/2;
	        if(len%2==0){
	        	answer = String.valueOf(cArr[idx-1]) + String.valueOf(cArr[idx]);
	        }else{
	        	answer = String.valueOf(cArr[idx]);
	        }
	        
	        System.out.println(answer);
	        
	        return answer;
	    }
		
		/*
		 * lv1 나머지가 1이 되는 수 찾기
		 * 자연수 n이 매개변수로 주어집니다. 
		 * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 
		 * 답이 항상 존재함은 증명될 수 있습니다.
		 * 3 ≤ n ≤ 1,000,000
		 * 
		 * 
		 	10	3		=>10을 3으로 나눈 나머지 : 1 3보다 작은 자연수 중 문제의 조건을 만족하는 수가 없음 : 3
			12	11		=>12를 11로 나눈 나머지 : 1 12보다 작은 자연수 중 문제의 조건을 만족하는 수가 없음  : 11
			
		 * */
		public static int solution25(int n){
			int answer = 0;
			
			int tmp = 1;
			
			while(n>=tmp){
				if(n % tmp==1){
					answer = tmp;
					break;
				}
				
				tmp++;
			}
			
			return answer;
		}
		
		
		/*lv1 K번째 수
		 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
		 array가 [1, 5, 2, 6, 3, 7, 4], 		commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]] 
		 
		 i = 2, j = 5, k = 3이라면
		 
		 array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
		
			1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
			2에서 나온 배열의 3번째 숫자는 5입니다.
			
		 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
		 
		 * */
		public static int[] solution26(int[] array, int[][] commands) {
			System.out.println(" K번째 수 ");
	        int[] answer = {};
	        int size = commands.length;
	        
	        answer = new int[size];
	        
	        int first = 0;
	        int second = 0;
	        int idx = 0;
	        int[] tmpSplitArr;
	        
	        for(int i=0; i<commands.length; i++){
        		first = commands[i][0];
    	        second = commands[i][1];
    	        idx = commands[i][2];
    	        
    	        tmpSplitArr = new int[second - first + 1];
    	        for(int j=0; j<tmpSplitArr.length;j++){
    	        	tmpSplitArr[j] = array[first-1 + j];
    	        }
    	        
    	        Arrays.sort(tmpSplitArr);
    	        
    	        answer[i] = tmpSplitArr[idx-1];
	        }
	        
	        for(int tmp : answer){
	        	System.out.print(tmp + " ");
	        }
	       
	        
	        return answer;
	    }
		
		
		/*lv1 부족한 금액 계산하기
		새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 
		이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다. 
		즉, 처음 이용료가 100이었다면 2번째에는 200, 
		3번째에는 300으로 요금이 인상됩니다.
		놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 
		금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
		단, 금액이 부족하지 않으면 0을 return 하세요.
		 * 
		 * */
		public static long solution27(int price, int money, int count){
			long answer = -1;
			long pay  = 0;
			
			for(int i=1; i<=count;i++){
				pay += (price * i);
			}
			
			if(money - pay > 0){
				answer = 0;
			}else{
				answer = (money-pay) * -1;
			}

			System.out.println("\n lv1 부족한 금액 계산하기 : " + answer);
			return answer;
		}
		
		
		/*
			lv1 두개 뽑아서 더하기
			정수 배열 numbers가 주어집니다. 
			numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 
			배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

			numbers			result
			[2,1,3,4,1]		[2,3,4,5,6,7]
			[5,0,2,7]		[2,5,7,9,12]
		 */
		public static int[] solution28(int[] numbers){
			int[] answer = {};
			ArrayList<Integer> arList = new ArrayList<Integer>();
			int sum = 0;
			
			for(int i=0; i<numbers.length; i++){
				for(int j=i+1; j<numbers.length; j++){
					 sum = numbers[i] + numbers[j];
					 if(!arList.contains(sum)){
						 arList.add(sum);
					 }
					 
				}
			}
			answer = new int[arList.size()];
			Collections.sort(arList);
			
			int idx = 0;
			for(int tmp : arList){
				answer[idx++] = tmp;
			}
			
			return answer;
			
		}
		
		//lv1 최소직사각형
		public static String solution28(int a, int b){
			String answer = "";
            
	        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

	        String[] year = new String[366];
	        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
	        int wantDay = 0;
	        
	        for(int i=0; i<year.length; i++) {
	            year[i] =  day[(i+5)%7];
	        }
	          
	        for(int i=0; i<a-1; i++) {
	            wantDay += month[i]; 
	        }

	        wantDay += b-1;
	          
	        answer = year[wantDay];
	        
	        return answer;
			
		}
		
		
		
		
		

}
