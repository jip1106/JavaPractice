package pkg.pra.sta;

public class AbsTestMain extends AbsTestClass {
	public static void main(String[] args) {
		AbsTestMain atm = new AbsTestMain();
		atm.test();
		atm.test1();
		atm.test2();
		atm.test3();
		
		String testStr = "0123456789";
		System.out.println("substring");
		System.out.println(testStr.substring(0,1) );
		System.out.println(testStr.substring(1,2) );
		System.out.println(testStr.substring(1,3) );
	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("test() 호출");
	}

	@Override
	void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1() 호출");
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2() 호출");
	}
}
