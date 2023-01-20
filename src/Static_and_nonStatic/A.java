package Static_and_nonStatic;

public class A {
	static int a=5;
	 int b=60;
	public static void main(String[] args) {
		A ref=new A();
		System.out.println(ref.b);
		System.out.println(a);
		
	}

}
