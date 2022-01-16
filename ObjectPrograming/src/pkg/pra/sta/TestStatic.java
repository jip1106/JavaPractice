package pkg.pra.sta;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath.add(1, 2));
		
		MyMath mm = new MyMath();
		System.out.println(mm.add(1,2));
	}

}

class MyMath{
	long a,b,c;
	
	long add() {
		return a + b;
	}
	
	static long add(long a, long b) {
		//c = a + b;
		return a+b;
	}
}
