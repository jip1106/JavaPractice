package pkg.pra.sta;

public class AbsTestMain extends AbsTestClass {
	public static void main(String[] args) {
		AbsTestMain atm = new AbsTestMain();
		atm.test();
		atm.test1();
		atm.test2();
		atm.test3();
		
	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("test() ȣ��");
	}

	@Override
	void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1() ȣ��");
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2() ȣ��");
	}
}
