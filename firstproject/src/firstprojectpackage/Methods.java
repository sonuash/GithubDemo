package firstprojectpackage;

public class Methods {
	//no arguments and no returns
	void method1() {
		System.out.println("Method1");
	}
	//method with 2 arguments
	void method2(int a,int b) {
		System.out.println(a+b);
	}
	//method return statement
	boolean method3() {
		System.out.println();
		return false;
	}
	//arguments and returns
	int method4(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		Methods m1=new Methods();
		m1.method1();
		m1.method2(60,70);
		boolean res=m1.method3();
		System.out.println(res);
		int res1=m1.method4(40, 50);
		System.out.println(res1);
		
	}
	

}
